import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;

public class ClientFile {
    private static final String CLIENT_PATH = "files/client.csv";
    private File file;

    public ClientFile() {
        this.file = new File(CLIENT_PATH);
        this.createClientFile();
    }

    public void createClientFile() {
        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(CLIENT_PATH);
                writer.write("Client No, Firstname, Name, Adress, Email, Phone No\n");
                writer.close();
            }
        } catch (IOException e) {

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
public void deleteLine(String targetLine) {
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(CLIENT_PATH))) {
        StringBuffer inputBuffer = new StringBuffer();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            if (!line.equals(targetLine)) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }

        }

try (FileOutputStream fileOut = new FileOutputStream(CLIENT_PATH)) {
    fileOut.write(inputBuffer.toString().getBytes());
}
} catch (Exception e) {

}
}}

