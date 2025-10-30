package basicsJava;
import java.util.Scanner;

public class DecimalToBinary {
    public static class DecimalToBinary {
        public static void main(String [] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a decimal number(n): ");

            int n = in.nextInt();
            String binary = "";

            while (n > 0){
                int rem = n % 2;
                binary = rem + binary;  // prepend remainder if we do appending like: binary += rem; the rem will not get reversed from bottom to top (Remainder)
                n = n/2;
            }
            System.out.println("Binary number: " + binary);
        }
    }
}
