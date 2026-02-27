public class PalindromeCheckerApp {

    private static final String APP_NAME = "Palindrome Checker App";
    private static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("====================================");
        System.out.println("This application checks whether a given string is a palindrome.");
        System.out.println();

        System.out.println("System ready for palindrome validation...");
        System.out.println();

        // Hardcoded string
        String input = "madam";

        // Convert String to character array
        char[] characters = input.toCharArray();

        // Two-pointer approach
        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("\nProgram exited successfully.");
    }
}