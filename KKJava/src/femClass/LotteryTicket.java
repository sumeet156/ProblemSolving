package femClass;

//create a lottery Quick Pick Application that will generate a lottery ticket with 6 random numbers between 1-69

/*
Arrays:A container that holds a fixed number of elements of the same type, stored in contiguous memory locations.
Key Points:
  Index-based (starts at 0).
  Fixed size once created.
  It Can be of primitive or object types.

Analogy: Like a row of lockers &mdash; each locker (index) holds exactly one item of the same type, and the number of lockers is fixed when built.

Syntax:
int[] numbers = {10, 20, 30, 40};        // Declaration + initialization
String[] names = new String[3]; // Declaration with size
names[0] = "Alice";
*/

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private  static final int LENGTH = 6;  //it can't change because we used final
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
    int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<LENGTH; i++){
            int randomNumber;

            do{
               randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor){
        for(int value : array){
            if (value == numberToSearchFor) return true;
        }
        return false;
    }

    public static void printTicket(int[] array){
        Arrays.sort(array);
        for (int number: array){
            System.out.print(number+ " | ");
        }

//        another way to loop through array
//        for (int i=0; i<array.length; i++){
//            System.out.println(array[i] + " | ");
//        }
    }
}
