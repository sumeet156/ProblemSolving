package basicsJava;

import java.util.Scanner;

public class LCM_HCF {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter num1: ");
//        int num1 = in.nextInt();
//        System.out.print("Enter num2: ");
//        int num2 = in.nextInt();
//
//        int a = num1;
//        int b = num2;
//
////        Find HCF using Euclid's Algorithm
//        while (num2 != 0) {
//            int rem = num1 % num2;
//            num1 = num2;
//            num2 = rem;
//        }
//        int hcf = num1;
//        int lcm = (a * b) / hcf;
//
//        System.out.println("HCF is: " + hcf);
//        System.out.println("LCM is: " + lcm);
//    }

    /*Method Solution*/

    public static void findHcfAndLcm(int num1, int num2){
        int a = num1;
        int b = num2;

        while (num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int hcf = num1;
        int lcm = (a * b) / hcf;

        System.out.println("HCF is: " + hcf);
        System.out.println("LCM is: " + lcm);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num2: ");
        int num2 = in.nextInt();
        findHcfAndLcm(num1, num2);
    }
}
