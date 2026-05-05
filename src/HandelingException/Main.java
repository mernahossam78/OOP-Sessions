package HandelingException;


/* Use try-catch when a piece of code might throw an exception (runtime error).
The code inside try is executed normally, and if an error occurs, execution jumps
 to catch to handle it.

The Exception object contains information about the error, such as the message,
which can be accessed using getMessage().

Note: It’s better to catch specific exceptions (like ArithmeticException)
instead of the general Exception class when possible.
 */
public class Main {
    public static void main(String[] args) {

        int number1 = 60;
        int number2 = 0;

        String name = "Merna";
        System.out.println(name);


        try {
            System.out.println(number1/number2);
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
        }

        System.out.println("Ahmed");
    }
}
