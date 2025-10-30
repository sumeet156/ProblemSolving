package basicsJava;
//Keep taking numbers as inputs till the user enters ‘x’ after that print sum of all.

import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter a Number (or 'x' to stop): ");
            String input = in.next();
            if (input.equals("x")) {
                break; // exit loop
            }
            int number = Integer.parseInt(input);
            sum += number;
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}
