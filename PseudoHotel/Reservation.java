public class Reservation {
    private Customer customer;
    private Room room;
    private int nights;
    private double extraCharges;

    public Reservation(Customer customer, Room room, int nights, double extraCharges) {
        this.customer = customer;
        this.room = room;
        this.nights = nights;
        this.extraCharges = extraCharges;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public double getExtraCharges() {
        return extraCharges;
    }

    public double calculateSubtotal() {
        return (nights * room.getPricePerNight()) + extraCharges;
    }

    public double calculateDiscountedTotal() {
        double subtotal = calculateSubtotal();
        if (nights > 5) {
            subtotal = subtotal * 0.90;  // 10% έκπτωση
        }
        return subtotal;
    }

    public double calculateVAT() {
        return calculateDiscountedTotal() * 0.13;
    }

    public double calculateFinalTotal() {
        return calculateDiscountedTotal() + calculateVAT();
    }
}
