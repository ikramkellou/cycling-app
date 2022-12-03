import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BicyleFile {
    private static final String BICYCLE_PATH = "files/bicyle.csv";
    private File file;

    public BicyleFile() {
        this.file = new File(BICYCLE_PATH);
        this.createBicyleFile();
    }

    public void createBicyleFile() {
        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(BICYCLE_PATH);
                writer.write("Bycicle No, Color, Price, Availability\n");
                writer.close();
            }
        } catch (Exception e) {
        }
    }

    public void displayFile() {
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {

        }
    }

    public String getLineById(String id) {
        try (Scanner scanner = new Scanner(this.file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                String[] array = data.split(",");

                if (id.equals(array[0])) {
                    return data;
                }
            }
            return null;
        } catch (IOException e) {
            return null;
        }
    }

    public void replaceLines(String targetLine, String replacementLine) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(BICYCLE_PATH))) {
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (line.equals(targetLine)) {
                    line = replacementLine;
                }
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }

            try (FileOutputStream fileOut = new FileOutputStream(BICYCLE_PATH)) {
                fileOut.write(inputBuffer.toString().getBytes());
            }
        } catch (Exception e) {

        }
    }
}
