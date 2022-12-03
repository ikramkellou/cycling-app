import java.util.Scanner;

public class Session {
    private ClientFile clientFile = new ClientFile();
    private BicyleFile bicyleFile = new BicyleFile();
    private BookingFile bookingFile = new BookingFile();

    public Session() {
    }

    private Client buildClient() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Client number (max 10 digits): ");
            String clientId = sc.nextLine();

            System.out.print("Firstname (max 30 letters): ");
            String firstname = sc.nextLine();

            System.out.print("Lastname (max 30 letters): ");
            String lastName = sc.nextLine();

            System.out.print("Adress (max 35 letters): ");
            String address = sc.nextLine();

            System.out.print("Email (max 15 letters): ");
            String mail = sc.nextLine();

            System.out.print("Phone number (max 10 digits): ");
            String phone = sc.nextLine();

            return new Client(clientId, firstname, lastName, address, mail, phone);
        }
    }

    private Bicycle buildBicycle() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Bicyle number (max 6 digits): ");
            String id = sc.nextLine();

            System.out.print("Color (max 4 letters): ");
            String color = sc.nextLine();

            System.out.print("Price (max 6 digits): ");
            double price = sc.nextDouble();

            System.out.print("Is available ? (true, false): ");
            boolean isAvailable = sc.nextBoolean();

            return new Bicycle(id, color, price, isAvailable);
        }
    }

    public static long getID() {
        // 10 digits.
        long id = System.currentTimeMillis() % 10000000000L;
        if (id <= 0) {
            id = (0 + 1) % 10000000000L;
        }
        return id;
    }

    private Booking buildBooking() {
        try (Scanner sc = new Scanner(System.in)) {
            String boookingId = Long.toString(getID());

            System.out.print("Client number (max 10 digits): ");
            String clientId = sc.nextLine();

            System.out.print("Bicyle number (max 6 digits): ");
            String bicyleId = sc.nextLine();

            System.out.print("Start Date (DD/MM/YYYY): ");
            String startDate = sc.nextLine();

            System.out.print("End Date (DD/MM/YYYY): ");
            String endDate = sc.nextLine();

            return new Booking(boookingId, bicyleId, clientId, startDate, endDate);
        }
    }

    public void updateBicycle() {
        bicyleFile.displayFile();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the bicycle number to update, please!");
            String bicyleId = sc.next();
            String targetLine = bicyleFile.getLineById(bicyleId);
            if (targetLine != null) {
                System.out.println(targetLine);
                System.out.println("Update the bicycle information, please!");
                Bicycle bicyle = this.buildBicycle();
                String replacementLine = bicyle.getBicyleAsCsvLine();
                bicyleFile.replaceLine(targetLine, replacementLine);
            }
        }
    }

    public void deleteBooking() {
        bookingFile.displayFile();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the booking number to delete, please!");
            String bookingId = sc.next();
            String targetLine = bookingFile.getLineById(bookingId);
            if (targetLine != null) {
                bookingFile.deleteLine(targetLine);
            }
        }
    }

    public void bookBicyle() {
        Booking booking = this.buildBooking();
        String line = booking.getBookingAsCsvLine();
        bookingFile.addLine(line);
    }
}
