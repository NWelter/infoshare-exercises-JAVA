//Konwersja i rzutowanie typów:

  /* Konwersja -> Rzutowanie niejawne
  Zasady:
  - jeśli jeden z operandów jest typu double, to drugi też zostanie zamieniony na double
  - jeżeli jeden jest float, to drugi też zostanie zamieniony na float
  - jeżeli jeden jest long, to drugi też zostanie zamieniony na long
  - gdy żadne z powyższych nie występuje, to oba typy zostaną zamienione na int
  (VM zamienia zmienne na najwyższy dostępny typ)
  */

  public class Konwersje{
    public static void main (String [] args){

      int a = 6;
      double b = 14.7;
      double c = b/a; //a przekonwertowane na typ double
      System.out.println(c);

      /* 
      UWAGA! Nie działa konwersja 'w dół':

      int a = 6;
      double b = 14.7;
      int c = b/a; 

      przy próbie deklaracji wyniku jako int, program się nie skompiluje:

      "error: incompatible types: possible lossy conversion from double to int"

      Jeżeli potrzebujemy zmienić typ double na int to musimy zastosować
      RZUTOWANIE (jawną konwersję):
      wymuszamy docelowy typ danych przez umieszczenie go w nawiasach okrągłych
      */

      //Przykład rzutowania:
      int d = 3;
      double e = 17.8;
      int f = (int)e/d;
      //UWAGA! Pamiętaj, że rzutowanie obcina część dziesiętną, a nie zaokrągla!
      System.out.println(f);

      //zaokrąglanie - funkcja Math.round();
      double z = e/d;
      System.out.println(z);
      System.out.println(Math.round(z));


      //ćwiczenie - rzutowanie char na int

      char litera = 'Z';//ASCII = 90
      int rzutowana = (int) litera;
      System.out.println(rzutowana);
      //wynik - wartość decymalna znaku z tablicy ASCII

  //Strumienie Wejścia/Wyjścia:






    }
  }