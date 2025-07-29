public class Invoice {
    private Reservation reservation;

    public Invoice(Reservation reservation) {
        this.reservation = reservation;
    }

    public void printReceipt() {
        System.out.println("\n--- INVOICE / RECEIPT ---");
        System.out.println("Customer: " + reservation.getCustomer().getName());
        System.out.println("Phone: " + reservation.getCustomer().getPhone());
        System.out.println("Room Number: " + reservation.getRoom().getRoomNumber());
        System.out.println("Price per Night: " + reservation.getRoom().getPricePerNight());
        System.out.println("Nights: " + reservation.getNights());
        System.out.println("Extra Charges: " + reservation.getExtraCharges());
        
        double subtotal = reservation.calculateSubtotal();
        double discounted = reservation.calculateDiscountedTotal();
        double vat = reservation.calculateVAT();
        double finalTotal = reservation.calculateFinalTotal();

        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("After Discount: %.2f\n", discounted);
        System.out.printf("VAT (13%%): %.2f\n", vat);
        System.out.printf("Final Total: %.2f\n", finalTotal);
    }
}
