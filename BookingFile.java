import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BookingFile {
    private static final String BOOKING_PATH = "files/booking.csv";
    private File file;

    public BookingFile() {
        this.file = new File(BOOKING_PATH);
        this.createBookingFile();
    }

    public void createBookingFile() {
        try {
            if (file.createNewFile()) {
                FileWriter writer = new FileWriter(BOOKING_PATH);
                writer.write("Booking No, Bicyle No, Client No, Start Date, End Date\n");
                writer.close();
            }
        } catch (IOException e) {

        }
    }

    public void addLine(String line) {
        try {
            FileWriter writer = new FileWriter(BOOKING_PATH, true);
            writer.write(line + "\n");
            writer.close();
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
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(BOOKING_PATH))) {
            StringBuffer inputBuffer = new StringBuffer();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals(targetLine)) {
                    inputBuffer.append(line);
                    inputBuffer.append('\n');
                }

            }

            try (FileOutputStream fileOut = new FileOutputStream(BOOKING_PATH)) {
                fileOut.write(inputBuffer.toString().getBytes());
            }
        } catch (Exception e) {

        }
    }
}
