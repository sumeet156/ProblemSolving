package basicsJava;

//Input a year and find whether it is a leap year or not.
// Yrs which are divisible by 4 and 400 not 100

import java.util.Scanner;

//public class LeapYear {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Year:");
//        int year = input.nextInt();
//        if ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) )
//            System.out.println("It's a Leap Year");
//        else {
//            System.out.println("Not a Leap Year");
//        }
//    }
//}

// Methods form

public class LeapYear {
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (isLeapYear(year)) {
            System.out.println("Leap Year Bhai");
        } else System.out.println("Not a Leap Year");
    }
}
