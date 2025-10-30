package basicsJava;
//Take two numbers and print the sum of both.

import java.util.Scanner;

public class SumTwo {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter Num1:");
//        int num1 = input.nextInt();
//        System.out.print("Enter Num2:");
//        int num2 = input.nextInt();
//        int Sum = num1 + num2;
//        System.out.println("Sum of two nums: "+ Sum);
//    }

    /*Methods solution*/
    public static void sum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of nums: "+ sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1:");
        int num1 = input.nextInt();
        System.out.print("Enter num2:");
        int num2 = input.nextInt();
        sum(num1, num2);
    }
}
