//Strumienie Wejścia/Wyjścia

  /* 
    Do pobierania danych od użytkownika służy strumień wejścia System.in
     i związana z nim klasa Scanner, którą należy wczesniej zaimportować:
  */
import java.util.Scanner;
 

 public class Wejscie{
    public static void main (String [] args){

      //deklaracja zmiennej przechowującej imię:

      String imie;

      //tworzenie obiektu typu Scanner:

      Scanner odczyt; //deklaracja

      odczyt = new Scanner(System.in); //tworzenie obiektu

      /*
      Lepiej zapisać w 1 linii:

      Scanner odczyt = new Scanner(System.in);

      lub (jak często na zajęciach):

      Scanner in = new Scanner(System.in);
       */

      System.out.println("Podaj swoje imie: ");

      //przypisanie metody do naszej zmiennej:

      imie = odczyt.nextLine();

      System.out.println("Witaj "+imie);

      /* 
      metoda .nextLine(); jest używana do zmiennych typu String- odbiera od
      użytkownika ciąg znaków zakończonych enterem
      Inne, często używane metody to:
      - nextInt() - przyjmuje liczby całkowite;
      - nextDouble() - przyjmuje liczby zmiennoprzecinkowe
      UWAGA! separator zalezy od ustawien VM w danym kraju (kropka lub przecinek)
      możemy to ustawić za pomocą metody useLocale(Locale)
      */


      //zadanie: pobierz typy double i przeprowadz operacje matematyczne

      double a, b, suma, roznica, iloczyn, iloraz;

      //deklaracja obiektu typu Scanner:

      Scanner in = new Scanner(System.in);

      //pobieranie zmiennych od uzytkownika typu double

      System.out.println("Podaj pierwszą liczbę dziesiętną (a): ");
      a = in.nextDouble(); //w tym przypadku separatorem jest przecinek!
      System.out.println("Podaj drugą liczbę dziesiętną (b): ");
      b = in.nextDouble();
      suma = a+b;
      roznica = a-b;
      iloczyn = a*b;
      iloraz = a/b;

      System.out.println("Suma liczb wynosi: "+suma+"\n Różnica a-b wynosi: "+roznica+"\n Iloczyn wynosi: "+iloczyn+"\n iloraz a/b wynosi: "+iloraz);





    }
  }