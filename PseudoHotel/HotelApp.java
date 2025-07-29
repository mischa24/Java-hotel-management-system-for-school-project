import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        List<Reservation> reservations = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "George", "Receptionist"));
        employees.add(new Employee(2, "Maria", "Manager"));

        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*        WELCOME TO KOUTSAKIS HOTEL         *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");

        while (running) {
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1. Manage Reservations");
            System.out.println("2. Manage Services");
            System.out.println("3. Show Hotel Statistics");
            System.out.println("4. Manage Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println("\n-- RESERVATION MANAGER --");
                    ReservationManager.run(scanner, reservations);
                    break;
                case 2:
                    System.out.println("\n-- SERVICES MANAGER --");
                    ServicesManager.run(scanner);
                    break;
                case 3:
                    StatsManager.printStatistics(reservations);
                    break;
                case 4:
                    System.out.println("\n-- EMPLOYEES --");
                    for (Employee e : employees) {
                        e.showEmployeeDetails();
                    }
                    break;
                case 5:
                    System.out.println("\nThank you for using Koutsakis Hotel System. Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
