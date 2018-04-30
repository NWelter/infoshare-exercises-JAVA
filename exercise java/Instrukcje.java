import java.util.Scanner;

//import biblioteki do metody toLowerCase();
import java.io.*;



public class Instrukcje{
  public static void main (String [] args){

/* Cwiczenie 1. Pobierz w konsoli dwie liczby całkowite,
 następnie porównaj je i wyświetl stosowny komunikat z wynikiem.
*/

 int a, b;

 Scanner pobierz = new Scanner (System.in);

 System.out.println("Podaj pierwszą liczbę: ");
 a= pobierz.nextInt();
 System.out.println("Podaj drugą liczbę: ");
 b = pobierz.nextInt();

 if(a>b){
  System.out.println("Pierwsza liczba jest większa od drugiej \n");
} else if(a<b){
  System.out.println("Pierwsza liczba jest mniejsza od drugiej \n");
}else {
  System.out.println("Obie liczby są równe \n");
}

/* 
Napisz program, który pobierze od użytkownika imię i przechowa je w zmiennej. 
Następnie stwórz kilka warunków z różnymi imionami.
 Jeśli któreś z imion będzie pasowało wyświetl "Cześć jakieś_imię",
  gdy program nie znajdzie imienia wyświetl "Przykro mi, ale Cię nie znam".

*/
//deklaracja nowego obiektu typu Scanner dla Stringa
  Scanner in = new Scanner (System.in);

  System.out.println("Podaj swoje imie: ");

  String imie = in.nextLine();
//metoda toLowerCase(); by wielkość wprowadzanych liter nie miała znaczenia
  imie= imie.toLowerCase();

  switch(imie){
    case "natalia":
    System.out.println("Cześć, Natalia!");
    break;

    case "ewa":
    System.out.println("Cześć, Ewa!");
    break;

    case "anita":
    System.out.println("Cześć, Anita!");
    break;

    default:
    System.out.println("Przykro mi, ale Cię nie znam.");
  }

}
}