import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BookingFile {
    private static final String BOOKING_PATH = "files/booking.csv";
    private File file;

    public BookingFile() {
        this.createBookingFile();
    }

    public void createBookingFile() {
        this.file = new File(BOOKING_PATH);
        try {
            if (file.createNewFile()) {
                System.out.println(BOOKING_PATH);
                FileWriter writer = new FileWriter(BOOKING_PATH);
                writer.write("Bicyle No, Client No, Start Date, End Date\n");
                writer.close();
            }
        } catch (IOException e) {

        }
    }
}
