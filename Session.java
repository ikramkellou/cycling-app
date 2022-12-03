import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Session {
    private static final String CLIENT_PATH = "files/client.csv";
    private static final String BICYCLE_PATH = "files/bicyle.csv";
    private static final String BOOKING_PATH = "files/booking.csv";

    public Session() throws IOException {
        this.createClientFile();
        this.createBicyleFile();
        this.createBookingFile();
    }

    public void createClientFile() throws IOException {
        new File(CLIENT_PATH);
        try (FileWriter writer = new FileWriter(CLIENT_PATH)) {
            writer.write("NoCNI,Prénom,Nom,Adresse,Email,NoTel\n");
        }
    }

    public void writeClient() throws IOException {
        System.out.println("Enter a new client:");
        Scanner sc = new Scanner(System.in);

        System.out.print("NoCNI (max 10 letters): ");
        String clientId = sc.nextLine();

        System.out.print("Prénom (max 30 letters): ");
        String firstname = sc.nextLine();

        System.out.print("nom (max 30 letters): ");
        String lastName = sc.nextLine();

        System.out.print("Adresse (max 35 letters): ");
        String address = sc.nextLine();

        System.out.print("Email (max 15 letters): ");
        String mail = sc.nextLine();

        System.out.print("NoTel (max 10 letters): ");
        String phone = sc.nextLine();

        Client client = new Client(clientId, firstname, lastName, address, mail, phone);
        client.formatValues();
        String line = client.getClientAsLine();

        try (FileWriter writer = new FileWriter(CLIENT_PATH, true)) {
            writer.write(line);
        }
    }

    public void createBicyleFile() throws IOException {
        new File(BICYCLE_PATH);
        try (FileWriter writer = new FileWriter(BICYCLE_PATH)) {
            writer.write("Matricule,Couleur,Prix location,Disponibilité");
        }
    }

    public void writeBicyle() throws IOException {
        // TODO: implement this method
    }

    public void createBookingFile() throws IOException {
        new File(BOOKING_PATH);
        try (FileWriter writer = new FileWriter(BOOKING_PATH)) {
            writer.write("Matricule,NoCNI,Date début location,Date fin location");
        }
    }

    public void writeBooking() throws IOException {
        // TODO: implement this method
    }
}
