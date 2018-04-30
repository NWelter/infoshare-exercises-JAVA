import java.util.Scanner;

public class Petle{
  public static void main (String [] args)
  //wymagane by uzyc metody Thread.sleep();
  throws InterruptedException{

/* 
  Ćwiczenie 1. Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią.
  Następnie przy użyciu wyświetl na ekranie 
  Odliczanie z tekstem "Bomba wybuchnie za ... " 
  gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0. 
  Napisz program w 3 wersjach przy użyciu różnych pętli.
*/

  Scanner in = new Scanner(System.in);

  System.out.println("Podaj dodatnią liczbę całkowitą: ");
  int licznik = in.nextInt();

  //I. Pętla do-while:

  System.out.println("\nPierwszy sposób: \n");

  do{
    System.out.println("Bomba wybuchnie za: "+licznik);
    licznik--;
      //metoda opóźniająca wykonywanie dalszych obrotów (czas w milisekundach)
    Thread.sleep(500);
  }while(licznik>=0);

  System.out.println("\nBUUM!");

  //II. Pętla while:

  System.out.println("\nDrugi sposób: \n");

  System.out.println("Podaj dodatnią liczbę całkowitą: ");

    //deklarujemy nową wartość bo teraz licznik=0;
  licznik = in.nextInt();

  while (licznik>=0){
   System.out.println("Bomba wybuchnie za: "+licznik);
   licznik--;
   Thread.sleep(700);
 }
 System.out.println("\nKABUUM!\n");

  //III. Pętla for:

 System.out.println("\nTrzeci sposób: \n");
 System.out.println("Podaj dodatnią liczbę całkowitą: ");

    //deklarujemy nową wartość bo licznik=0;
 licznik = in.nextInt();

 for(int i=licznik; i>=0; i--){
  System.out.println("Bomba wybuchnie za: "+i);
  Thread.sleep(300);
}
System.out.println("\nBUUM!!! KABUUUM!!!\n");




}
}