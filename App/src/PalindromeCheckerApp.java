import java.util.Scanner;

public class PalindromeCheckerApp {

    /**
     * Main method - Entry point of the Java application.
     */
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
        System.out.println("====================================");

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        // Start time
        long startTime = System.nanoTime();

        boolean result = service.checkPalindrome(input);

        // End time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");

        sc.close();
    }
}

/**
 * Service class that contains palindrome checking logic
 */
class PalindromeService {

    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}