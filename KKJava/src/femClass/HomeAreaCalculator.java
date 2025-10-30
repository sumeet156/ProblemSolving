package femClass;
// don't have import Rectangle class because it's in an same Package

/*
Instantiating Objects in Java → The process of creating an object from a class using the new keyword.
Analogy: A blueprint (class) is just a plan; instantiating is like actually building the house (object) so you can live in it.
*/


public class HomeAreaCalculator {
    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();   // obj created
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

        Rectangle room2 = new Rectangle(30,75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms:" + totalArea);
    }
}
