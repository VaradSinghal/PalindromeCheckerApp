import java.util.Stack;

class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare with original string
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;

    public static boolean isPalindrome(String input) {

        // Normalize string
        String normalized = input
                .toLowerCase()               // ignore case
                .replaceAll("\\s+", "");     // remove spaces

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters
        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(VERSION);
        System.out.println("====================================");

        String input = "madam";

        // Create service object
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");

        String input = "Never Odd Or Even";

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node createLinkedList(String str) {
        Node head = null, tail = null;

        for (char c : str.toCharArray()) {
            Node newNode = new Node(c);

            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        return head;
    }

    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle using fast and slow pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        Node firstHalf = head;
        Node secondHalf = prev;

        // Compare halves
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        Node head = createLinkedList(input);

        if (isPalindrome(head)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }
}