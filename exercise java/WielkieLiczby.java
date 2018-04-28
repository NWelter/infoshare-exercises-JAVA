
// Wielkie Liczby:

  /*
  Służą do przechowywania ogromnych liczb i do precyzyjnych obliczeń np. w bankowości.
  Istenią dwie klasy:

  I. BigInteger - klasa dla wielkich liczb całkowitych.
  II. BigDecimal - klasa dla wielkich liczb zmiennoprzecinkowych.

  Obie klasy posiadają stałe, często wykorzystywane:
  - BigInteger.ONE / BigDecimal.ONE
  - BigInteger.ZERO / BigDEcimal.ZERO

  Minusy stosowania w tradycyjnych programach: 
  są to klasy obiektowe, przez co nie możemy przypisać bezposrednio
  wartosci BigInteger do wartości int.

  Aby utworzyć nową zmienną typu BigInteger/BigDecimal musimy najpierw
  utworzyć OBIEKT (oraz zaimportowac odpowiednią klasę w nagłówku):
  */

  import java.math.BigInteger; //nie mylić z klasą java.lang.Math!
  import java.math.BigDecimal;

  public class WielkieLiczby{
    public static void main (String [] args){
      //tworzenie obiektu:

      BigInteger wielka = new BigInteger("123123123454212121212121");
      System.out.println(wielka.toString());
      System.out.println(wielka);

      /*
      W powyższym przykładzie tworzymy zmienną typu String. 
      Pozwala nam to przechowywać praktycznie nieograniczone wielkie liczby.
      Jako, że jest to obiekt, to uzywamy metody ".toString()" by wyświetlić jej wartość!
      (ale wywolanie samej nazwy obiektu w Sout też zadziała, zapisy sa równoważne)
      
      Możemy również zadeklarować ją jako int/double i skorzystać wtedy z metody
      ".valueOf();" należy jednak pamiętać, że argument nie może przekroczyć
      wartości int lub double.

      Do operacji matematycznych na wielkich liczbach nie możemy używac standardowych operatorów.
      Należy użyć gotowych funkcji typu: 
      add(); substract(); multiply(); divide();

      */

      //deklaracja zmiennej int
      BigInteger wielka2 = BigInteger.valueOf(1237923802);
      System.out.println(wielka2);

      //deklaracja zmiennej zmiennoprzecinkowej
      BigDecimal wielka_dec = BigDecimal.valueOf(123.459382);
      System.out.println(wielka_dec);




    }
  }