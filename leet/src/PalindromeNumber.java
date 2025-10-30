import java.util.Scanner;

/*
1. If number < 0 -> not a palindrome.
2. Reverse the number using %10 and /10.
3. Compare reversed with original
4. Return true if equal.
*/

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        // Call the function to check palindrome
        boolean isPalindrome = isPalindrome(x);

        // Output
        System.out.println("Is Palindrome: " + isPalindrome);

        sc.close();
    }


    // Function to check if a number is palindrome
    public static boolean isPalindrome(int x) {
        // Step 1: Negative numbers are not palindrome
        if (x < 0) {
            return false;
        }

        int original = x; // store original number
        int reversed = 0; // to store reversed number

        // Step 2: Reverse the number
        while (x > 0) {
            int lastDigit = x % 10;        // extract last digit
            reversed = reversed * 10 + lastDigit; // build reversed number
            x = x / 10;                    // remove last digit
        }

        // Step 3: Compare reversed with original
        return original == reversed;
    }
}
