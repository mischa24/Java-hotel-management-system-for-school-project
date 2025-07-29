public class DiscountManager {
    
    public static double applyDiscount(double subtotal, int nights) {
        double discounted = subtotal;
        
        // Έκπτωση 10% αν μείνει πάνω από 5 φορές
        if (nights > 5) {
            discounted *= 0.90;
            System.out.println("> Applied 10% discount for long stay!");
        }
        
        //Έξτρα έκπτωση αν το ποσό ξεπερνά τα 100€
        if (discounted > 100) {
            discounted *= 0.95;
            System.out.println("> Applied extra 5% discount for big spend!");
        }
        
        return discounted;
    }
}    