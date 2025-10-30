package femClass;

import java.util.Scanner;

// Variable Scope: variable scope is the region of code where a variable is accessible.
/* Analogy:
1. If your pass is for the kitchen (local variable in a method), you can only move around inside the kitchen — nowhere else.
2. If it’s for the whole house (instance variable), you can roam anywhere inside the house (object).
3. If it’s for all houses of that type (static variable), you can visit any house that belongs to that club (class).*/

/*
Types in Java:
1. Local scope – Inside a method/block; gone after it ends.
2. Instance scope – Tied to an object; exists while the object exists.
3. Static/Class scope – Shared across all objects of the class; exists for the program’s lifetime.
*/

public class InstantCreditCheck {
    static double requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        boolean qualified = isUserQualified(salary, creditScore);

        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) System.out.println("Congrats, You've been approved");
        else System.out.println("Sorry, you've been declined");
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        if (salary >= requiredSalary && creditScore >= requiredCreditScore){
            return true;
        }
        else return false;
    }

    public static double getSalary(){
        System.out.println("Enter your Salary");
        double salary = scanner.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your Credit Score");
        int creditScore = scanner.nextInt();
        return creditScore;
    }
}
