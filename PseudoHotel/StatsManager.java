import java.util.List;

public class StatsManager {

    public static double calculateTotalRevenue(List<Reservation> reservations) {
        double total = 0;
        for (Reservation r : reservations) {
            total += r.calculateFinalTotal();
        }
        return total;
    }

    public static double calculateAverageRevenue(List<Reservation> reservations) {
        if (reservations.isEmpty()) {
            return 0;
        }
        return calculateTotalRevenue(reservations) / reservations.size();
    }

    public static Reservation findTopPayingReservation(List<Reservation> reservations) {
        if (reservations.isEmpty()) {
            return null;
        }

        Reservation top = reservations.get(0);
        for (Reservation r : reservations) {
            if (r.calculateFinalTotal() > top.calculateFinalTotal()) {
                top = r;
            }
        }
        return top;
    }

    public static void printStatistics(List<Reservation> reservations) {
        System.out.println("\n=== HOTEL STATISTICS ===");
        double total = calculateTotalRevenue(reservations);
        double average = calculateAverageRevenue(reservations);
        System.out.printf("Total Revenue: €%.2f\n", total);
        System.out.printf("Average Revenue per Reservation: €%.2f\n", average);

        Reservation top = findTopPayingReservation(reservations);
        if (top != null) {
            System.out.println("\n-- Top Paying Customer --");
            System.out.println("Customer: " + top.getCustomer().getName());
            System.out.printf("Paid: €%.2f\n", top.calculateFinalTotal());
        } else {
            System.out.println("\nNo reservations yet.");
        }
    }
}
