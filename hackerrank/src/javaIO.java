import java.util.*;

/*
nextInt() & nextDouble() leave '\n' → use in.nextLine() to clear buffer
nextLine() reads full sentence (useful for multi-word strings)
 */

public class javaIO {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        double d = in.nextDouble();
        in.nextLine();
        String s = in.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        in.close();
    }
}
