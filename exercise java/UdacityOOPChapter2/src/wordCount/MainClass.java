package wordCount;

/*
  A program will count words in plain text file.
 */

import java.io.File;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) throws Exception {

        File file = new File("alices adventures in wonderland.txt");

        Scanner in = new Scanner(file);
        int wordsCount = 0;

        while (in.hasNextLine()) {
            String line = in.nextLine();
            wordsCount += line.split(" ").length;
        }
        System.out.println("The file contains: " + wordsCount + " words.");

        //CATCHING EXCEPTIONS:

        /*
        Example 1 - Handle the situation by letting the user know what happened:

        try{
            openFile("somefile.txt");
            } catch(FileNotFoundException exception) {

            System.out.println("Cannot find that file");
            }

         Example 2 - just re-throw the exception:

         try{
               openFile("somefile.txt");
            } catch(FileNotFoundException exception) {
               throw exception;
            }

          Example 3. - Multiple catch statements:

          try{
                openFile("somefile.txt");
                array[index]++;
             } catch(FileNotFoundException exception) {
             } catch(IndexOutOfBoundsException exception) {
             }

           Example 4. - Catching all exceptions:

           try{
                openFile("somefile.txt");
                array[index]++;
              } catch(Exception exception) {
              }
        */


    }
}
