package exceptions;

public class Main {
    public static void main(String[] args) {

    try {
        int[] array = new int[5];
        System.out.println(array[4] + " " + array[5]);

    } catch (ArrayIndexOutOfBoundsException e){

        //(we should use Loggers)
        System.out.println("Index not exist in array!");


    }
    }
}
