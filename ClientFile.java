import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
}
