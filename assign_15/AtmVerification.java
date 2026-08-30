import java.util.Scanner;

class InvalidPINException extends Exception {
    public InvalidPINException(String message) {
        super(message);
    }
}

public class AtmVerification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPIN = 1234;

        try {
            System.out.print("Enter ATM PIN: ");
            int pin = sc.nextInt();

            if (pin != correctPIN) {
                throw new InvalidPINException("Invalid PIN!");
            }

            System.out.println("PIN Verified Successfully.");
        }
        catch (InvalidPINException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        finally {
            System.out.println("PIN verification process completed.");
        }

        sc.close();
    }
}
