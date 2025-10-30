package femClass;

//Write a method that count the number of words in a String and prints them individually on new lines.
//String as Object
// StringBuilder
// Jumbled Words

public class TextProcessor {

    public static void main(String[] args) {
//        countwords("I love Java");
//        reverseString("Hello World");
        addSpaces("HeyWorld!It'sMeSumeet");

    }

    public static void countwords(String text){
        String[] words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words",numberOfWords);
        System.out.println(message);

        for (String word: words){
            System.out.println(word);
        }
    }



//    StringBuilder:Used to create a mutable String that can be modified
/*
 A mutable (changeable) sequence of characters used for creating and modifying strings without creating new objects each time.

  Mutable → You can change its content without creating a new object.
  Faster than String for repeated modifications (e.g., loops, concatenation).
  Not thread-safe (use StringBuffer if you need thread safety).

Syntax:
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");      // Add text
    sb.insert(5, ",");        // Insert at index
    sb.replace(0, 5, "Hi");   // Replace range
    sb.delete(2, 4);          // Delete range
    sb.reverse();             // Reverse string
    System.out.println(sb);   // Output depends on above operations

Analogy:Like a whiteboard — you can erase, add, and change text on it without replacing the entire board,
unlike String, which is like a printed sheet that can’t be changed once printed.
*/


    public static void  reverseString(String text){
//        String as Array of char
        for (int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }

    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for (int i=0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}


/*
Text Blocks in Java → A feature (introduced in Java 15) that lets you write multi-line strings more cleanly using triple quotes """ without needing \n for new lines or + for concatenation.

Key Points:
  Starts and ends with """.
  Preserves formatting and line breaks.
  Great for JSON, HTML, SQL, or long messages.

Example:
String html = """
    <html>
        <body>
            <h1>Hello, World!</h1>
        </body>
    </html>
    """;

System.out.println(html);

Analogy:
Like writing on a big notepad where you can format text exactly as you want, instead of squeezing it all into one cramped line with escape characters.
*/
