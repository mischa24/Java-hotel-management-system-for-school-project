import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicesManager {
    private List<Service> availableServices;

    public ServicesManager() {
        availableServices = new ArrayList<>();
        // Προσθέτουμε default υπηρεσίες
        availableServices.add(new Service("Breakfast", 10));
        availableServices.add(new Service("Spa", 30));
        availableServices.add(new Service("Parking", 5));
        availableServices.add(new Service("Airport Shuttle", 25));
    }

    public void printAvailableServices() {
        System.out.println("\n--- Available Hotel Services ---");
        int index = 1;
        for (Service s : availableServices) {
            System.out.println(index + ". " + s.toString());
            index++;
        }
    }

    public double selectAndCalculateServices(Scanner scanner) {
        double total = 0;
        System.out.print("\nDo you want to add extra services? (Y/N): ");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("N")) {
            return 0;
        }

        while (true) {
            printAvailableServices();
            System.out.print("Select service number (or 0 to finish): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (choice == 0) {
                break;
            }
            if (choice >= 1 && choice <= availableServices.size()) {
                Service selected = availableServices.get(choice - 1);
                total += selected.getPrice();
                System.out.println("Added: " + selected.getName() + " (€" + selected.getPrice() + ")");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        return total;
    }

    // ⭐️ ΝΕΟ – Αυτή είναι η run() για HotelApp!
    public static void run(Scanner scanner) {
        ServicesManager manager = new ServicesManager();
        System.out.println("\nWelcome to Services Management!");

        double total = manager.selectAndCalculateServices(scanner);
        System.out.println("\nTotal cost of selected services: €" + String.format("%.2f", total));
    }
}
