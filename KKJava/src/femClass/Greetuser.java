package femClass;

import java.util.Scanner;

//Methods: Blocks of code that perform a specific task, reusable when called.

/*
Methods in Java → Blocks of code that perform a specific task, reusable when called.
Analogy: Like a vending machine button — press it, it always gives you the same snack (task) without rewriting the process each time.

Method Overloading → Defining multiple methods with the same name but different parameter lists (type, number, or order of parameters).
Analogy: Like a Swiss Army knife — same tool name, but different blades for different jobs depending on what you need.
*/

public class Greetuser {
    public static void main(String[] args) {
        String name = getuserName();
        greetUser(name);
    }

    public static String getuserName(){
        System.out.println("Enter your Name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return  name;
    }

    public  static void greetUser (String name){
        System.out.println("Hi there! " + name);
    }
}


