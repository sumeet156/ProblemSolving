import java.util.Scanner;

public class PlusOne {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Enter the no. of Digits: ");
        int n = in.nextInt();

        if(n < 1 || n > 100){
            System.out.println("Digit length must between 1 to 100: ");
            return;
        }

        int [] digits = new int[n];
        System.out.println("Enter each digit(0-9): ");

        for (int i = 0; i < n; i++) {
            digits[i] = in.nextInt();
            if (digits[i] < 0 || digits[i] > 9) {
                System.out.println("Error: each digit must be between 0 and 9.");
                return;
            }
        }

        if (digits[0] == 0 && n > 1) {
            System.out.println("Error: number cannot have leading zeros.");
            return;
        }

        int[] result = plusOne(digits);

        System.out.print("Result: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        in.close();
    }


    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
