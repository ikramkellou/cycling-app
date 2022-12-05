import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Session session = new Session();
        Scanner sc = new Scanner(System.in);

        int option = 0;
        while (option != 6) {

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
                    // TODO: implement session.deleteBicyle()
                    // same as session.deleteBooking()
                    break;
                case 4:
                    session.deleteClient();
                    // TODO: implement session.deleteClient()
                    // same as session.deleteBooking()
                    break;
                case 5:
                    session.bookBicyle();
                    break;
                case 6:
                    break;
                default:
                    break;
            }

            // System.out.print("\033\143");
        }
        sc.close();
    }
}
