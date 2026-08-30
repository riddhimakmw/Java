// OnlineShopping.java
import java.util.Scanner;

public class OnlineShopping {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pricePerUnit = 250.0;

        System.out.print("Enter quantity of the product: ");
        int quantity = sc.nextInt();

        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("Quantity must be greater than zero.");
            }
            double totalCost = quantity * pricePerUnit;
            System.out.println("Order placed successfully. Total cost: " + totalCost);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid quantity: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}