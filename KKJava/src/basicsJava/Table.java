package basicsJava;
//Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Table {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        System.out.print("Enter Table no.: ");
//        int table = in.nextInt();
//        for (int i = 1; i <= 10; i++){
//            System.out.println(table + "x"+ i +"="+ (table*i));
////            int result = i * table;        // to print table answer direct
////            System.out.println(result);
//        }
//    }


    /*Method Solution*/
    public static void mul(int table){
        for (int i=1; i<=10; i++){
            System.out.println(table+ "x" + i + "=" +(table*i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Table No.: ");
        int table = in.nextInt();
        mul(table);
    }
}
