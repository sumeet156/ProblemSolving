package femClass;

//About Objects: objects are structures which contain data and behaviors.
/*
Objects: Real-world entities represented in code; they have state (variables) and behavior (methods).
Analogy: A car object has properties like color & speed (state) and actions like drive() & brake() (behavior).
*/

/*
Getter & Setter → Special methods to read (get) or update (set) an object’s private variables.
*/

/*
Encapsulation → Wrapping data (variables) and methods into a single unit (class) and restricting direct access to data using private fields with getters & setters.
Analogy: A capsule medicine — the outer shell hides the ingredients, and you only interact with it through a safe, controlled interface.
*/

/*
Constructors in Java → Special methods that run automatically when an object is created, used to initialize its variables. They have the same name as the class and no return type.
Analogy: Like a welcome kit in a hotel — the moment you check in (create an object), you automatically get essentials (initial values) without asking.
*/

public class Rectangle {
    private double length;
    private double width;
    private int sides = 4;

    public Rectangle(){
        setLength(0);
        setWidth(0);   //this.width = 0;
    }

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double calculatePerimeter(){
        return (2* length) + (2* width);
    }

    public double calculateArea(){
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width){
        this.width =width;
    }

    public int getSides(){
        return  sides;
    }

    public void setSides(int sides){
        this.sides = sides;
    }
}
