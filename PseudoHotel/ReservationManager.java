import java.util.List;
import java.util.Scanner;

public class ReservationManager {
    public static void run(Scanner scanner, List<Reservation> reservations) {
        // Welcome banner
        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*   WELCOME TO KOUTSAKIS HOTEL BOOKING APP   *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");
        System.out.println();
        System.out.println("Manage reservations easily and print detailed receipts!");
        System.out.println();

        // Ερώτηση αν θέλει να συνεχίσει
        System.out.print("Do you want to add reservations? (Y/N): ");
        String answer = scanner.nextLine().trim();

        if (answer.equalsIgnoreCase("N")) {
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("*     Thank you for using our system!       *");
            System.out.println("*               Goodbye!                     *");
            System.out.println("**********************************************");
            return;
        }

        // Αν απαντήσει Y → συνεχίζουμε κανονικά
        System.out.println();
        System.out.print("Enter number of reservations to add: ");
        int numberOfReservations = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Input loop for reservations
        for (int i = 0; i < numberOfReservations; i++) {
            System.out.println("\nReservation #" + (i + 1));

            // === Customer Info ===
            System.out.println("--- Customer Information ---");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            Customer customer = new Customer(name, phone, email, address);

            // === Room Info (χρήση RoomInput) ===
            Room room = RoomInput.readRoom(scanner);

            // === Stay Info ===
            System.out.println("--- Stay Information ---");
            System.out.print("Number of Nights: ");
            int nights = scanner.nextInt();
            scanner.nextLine();

            double subtotal = nights * room.getPricePerNight();

            // Apply discount
            double discounted = DiscountManager.applyDiscount(subtotal, nights);

            // VAT
            double vat = discounted * 0.13;
            double finalTotal = discounted + vat;

            // === Create Reservation ===
            Reservation reservation = new Reservation(customer, room, nights, discounted);
            reservations.add(reservation);

            System.out.println("\nReservation Added Successfully!");
            System.out.printf("Subtotal: €%.2f | Discounted: €%.2f | VAT: €%.2f | Final: €%.2f\n",
                    subtotal, discounted, vat, finalTotal);
        }

        // === Print all receipts ===
        System.out.println("\n--- ALL RESERVATIONS ---");
        for (Reservation r : reservations) {
            Invoice invoice = new Invoice(r);
            invoice.printReceipt();
        }
    }
}
