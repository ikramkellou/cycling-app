import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Session session = new Session();

        int option = 0;
        while (option != 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1 - Modifier le prix de location d'un vélo.");
            System.out.println("2 - Supprimer une location.");
            System.out.println("3 - Supprimer un vélo.");
            System.out.println("4 - Supprimer un client.");
            System.out.println("5 - Réserver un vélo.");
            System.out.println("6 - Quitter.");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    session.updateBicycle();
                    break;
                case 2:
                    session.deleteBooking();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    session.bookBicyle();
                    break;
                case 6:
                    break;
                default:
                    break;
            }
            sc.close();
            // System.out.print("\033\143");
        }

    }
}
