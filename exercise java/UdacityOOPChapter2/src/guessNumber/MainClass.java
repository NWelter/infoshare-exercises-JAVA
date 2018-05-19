package guessNumber;
/*
The computer will generate a random number between 1 and 100.
 An user will try to find out what that number is.
The user gets 10 guesses to win this game.
 */

import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) {

        /*declare a variable for random number:
         double Math.random(); method -> casting to (int)
         multiply by 100 and add 1 (because Math.random() generate floating point number between 0 and 1
         */

        int randomNumber = (int) (Math.random() * 100) + 1;

        //create a variable to check if guessIt is equals to randomNumber
        boolean guessIt = false;
        //System.out.println(randomNumber);

        System.out.println("I have randomly chosen a number between 1 and 100. \nTry to guess it:");
        Scanner in = new Scanner(System.in);


        //create a loop which will count from 10 to 0
        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + ". guess(es) left. Chose again: ");
            int userNumber = in.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("It's greater than " + userNumber + " guess.");
            } else if (userNumber > randomNumber) {
                System.out.println("It's less than " + userNumber + " guess.");
            } else {
                //then guessIt is true and we break a loop:
                guessIt = true;
                break;
            }

        }

        if (guessIt) {
            System.out.println("Excellent! You win!");
        } else
            System.out.println("Game over! You lose! \nThe number was: " + randomNumber);


    }
}
