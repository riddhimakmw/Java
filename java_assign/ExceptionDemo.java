// ExceptionDemo.java

public class ExceptionDemo {
@SuppressWarnings("null")
    public static void main(String[] args) {

        // Single try-catch
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }

        // Multiple catch blocks
        try {
            int[] arr = new int[5];
            arr[10] = 50;
            String s = null;
            s.length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }

        // Nested try-catch
        try {
            System.out.println("Outer try block");
            try {
                int[] nums = {1, 2, 3};
                System.out.println(nums[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e.getMessage());
                System.out.println(5 / 0);
            }
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}