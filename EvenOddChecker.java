import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Determine if even or odd
        String result = checkEvenOdd(number);

        // Display result
        System.out.println(number + " is an " + result + " number.");

        scanner.close();
    }

    // Method to check if a number is even or odd
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
