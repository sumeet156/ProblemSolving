import java.util.*;
//import java.util.Scanner;

/*
Task
In this challenge, you must read integers from stdin and then print them to stdout.
Each integer must be printed on a new line.

Scanner: java.util package is used, easy to use and parses input directly (good for beginners small programs)
BufferedReader: java.io (input/Output Stream used), faster input, read text only (better for large or competitive I/O)
*/

public class stdInOut {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();
    }
}

