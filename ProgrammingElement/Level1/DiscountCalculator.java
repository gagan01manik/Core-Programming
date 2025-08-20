import java.util.Scanner;

class DiscountCalculator {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter total course fee (INR): ");
        double courseFee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

   
        double discountAmount = courseFee * discountPercent / 100;
        double finalPrice = courseFee - discountAmount;

    
        System.out.println("The discount amount is INR " + discountAmount +
                           " and final discounted fee is INR " + finalPrice);

        
        input.close();
    }
}
