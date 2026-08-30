// ATM.java
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000.0;

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new ArithmeticException("Insufficient balance for this withdrawal.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}