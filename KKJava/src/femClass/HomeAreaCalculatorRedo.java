package femClass;
// don't have import Rectangle class because it's in the same Package

/*
Sending objects → You pass an object as an argument to a method.
Receiving objects→ The method accepts the object as a parameter.

Analogy: Like passing a parcel — you hand over the parcel (object) to someone (method),
they can use it, maybe modify it, and they might even give you a new parcel in return.
*/

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle room1 = calculator.getRoom();
        Rectangle room2 = calculator.getRoom();
        double totalArea = calculator.calculateAreaRoom(room1,room2);
        System.out.println("Area of both rooms:" + totalArea);
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of the Room:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the Room:");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public double calculateAreaRoom(Rectangle room1, Rectangle room2){
        return (room1.calculateArea() + room2.calculateArea());
    }
}


/*
Wrapper Class in Java → A class that “wraps” a primitive data type into an object so it can be used where objects are required (e.g., in collections).
Analogy: Like putting a gift inside a box — the gift (primitive) is still there, but now it’s packaged as an object for easier handling.

Examples:
int → Integer
char → Character
double → Double

Analogy:
Primitive → raw fruit.
Wrapper → fruit in a box.
String → a fruit salad — made up of multiple fruits (characters) combined and stored in a container (object).

String: It's neither Primitive nor Wrapper, it's an Object itself. Strings are immutable - once they are created, their value cannot change.
*/
