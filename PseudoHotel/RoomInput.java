import java.util.Scanner;

public class RoomInput {

    public static Room readRoom(Scanner scanner) {
        System.out.println("\n--- Room Information ---");

        System.out.print("Room Number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();  // consume newline

        // Επιλογή τύπου δωματίου με μενού
        System.out.println("Select Room Type:");
        System.out.println("1. SINGLE");
        System.out.println("2. DOUBLE");
        System.out.println("3. SUITE");
        System.out.print("Enter choice (1-3): ");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();

        RoomType type;
        switch (typeChoice) {
            case 1:
                type = RoomType.SINGLE;
                break;
            case 2:
                type = RoomType.DOUBLE;
                break;
            case 3:
                type = RoomType.SUITE;
                break;
            default:
                System.out.println("Invalid choice! Defaulting to SINGLE.");
                type = RoomType.SINGLE;
        }

        System.out.print("Room Floor: ");
        int floor = scanner.nextInt();

        System.out.print("Price per Night: ");
        double pricePerNight = scanner.nextDouble();

        System.out.print("Smoking? (true/false): ");
        boolean smoking = scanner.nextBoolean();
        scanner.nextLine();

        return new Room(roomNumber, type, floor, pricePerNight, smoking);
    }
}
