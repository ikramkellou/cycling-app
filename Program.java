import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Session session = new Session();

        session.writeClient();
        session.writeBicyle();
        session.writeBooking();
    }
}
