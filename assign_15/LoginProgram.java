import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class LoginProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "admin123";

        try {
            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                throw new InvalidPasswordException("Invalid Password!");
            }

            System.out.println("Login Successful.");
        } catch (InvalidPasswordException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Login process completed.");
        }

        sc.close();
    }
}