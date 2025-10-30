import java.util.Scanner;

/*
1️. printf() → allows formatted printing
2️. %-15s → string left-aligned in 15 spaces
3️. %03d → integer right-aligned, 3 digits, padded with 0s
4️. %n → newline (better than \n for cross-platform)
5. Practice formatting: helps in table-like console outputs
*/

public class OutputFormatting {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("================================");
        for (int i=0;i<3;i++){
            String s1=in.next();
            int x=in.nextInt();
            System.out.printf("%-15s%03d%n", s1,x);
        }
        System.out.println("================================");
        in.close();
    }
}
