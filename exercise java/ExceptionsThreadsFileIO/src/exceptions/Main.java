package exceptions;

public class Main {
    public static void main(String[] args) {


        int[] array = new int[5];


        try {
            //1. Exception of index out of bounds:

            System.out.println(array[4] + " " + array[5]);

            //2. Exception of wrong arithmetic operation:

            System.out.println(5 / 0);

            //3. Exception of assign value on variable which doesn't exist (ArrayIndexOutOfBoundsException):
            array[5] = 27;

            //4. Exception of wrong type of stored variable (ArrayStoreException):
            Object[] arrayObject = new String[5];
            //int instead String
            arrayObject[0] = 11;

        /*
            We can catch many types of exception (in new block of code catch() )
            BUT only one will be executed!
            In the case below, program executes ArrayIndexOutOfBoundsException.
            When we want to print all exceptions, we must catch them in isolate blocks try-catch

         */
        } catch (ArrayIndexOutOfBoundsException e) {

            //(we should use Loggers)
            System.out.println("Index not exist in array!");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e.getCause());

        } catch (ArithmeticException a) {
            System.out.println(a.toString());
        } catch (ArrayStoreException e) {
            System.out.println(e.toString());
        }

        /*base class Exceptions and child classes have own methods like:
        -getMessage() - print out String variable about type of exception
        -getCause() - return throwable object
        -toString() - concatenation of getMessage and class' name

         */

        //since Java 7 we can pipe all Exceptions in one catch block (more readable)- handling multiple exceptions:

        try {
            System.out.println(5 / 0);
            array[5] = 27;
            Object[] arrayObject = new String[5];
            arrayObject[0] = 11;

        } catch (ArithmeticException | ArrayStoreException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Message from 'pipe' of exceptions: " + e.toString());
        } finally {
            System.out.println("This part of code is not necessary, it will be executed regardless of code in try-catch parts.");
        }

        //calling method factorial():

        try{
            System.out.println(factorial(15));
            System.out.println(factorial(-3));
        } catch (ArithmeticException e){
            System.out.println(e.toString());
        }

    }

    //Creating a static method to calculate a factorial (!n):

    public static int factorial(int n) {

        if (n < 0) {

            throw new ArithmeticException("Factorial of number less than 0 doesn't exist!");
        }
        if (n == 0 || n == 1) {

            return 1;
        }
        //declaring an initial variable to calculate factorial:
        int fact = 1;

        for (int i = 2; i <= n; i++) {

            fact *= i;
        }
        return fact;

    }

}
