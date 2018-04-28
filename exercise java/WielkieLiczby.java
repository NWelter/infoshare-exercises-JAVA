
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
      add(); subtract(); -UWAGA! nie 'subStract'! multiply(); divide();

      */

      //deklaracja zmiennej int
      BigInteger wielka2 = BigInteger.valueOf(1237923802);
      System.out.println(wielka2);

      //deklaracja zmiennej zmiennoprzecinkowej
      BigDecimal wielka_dec = BigDecimal.valueOf(123.459382);
      System.out.println(wielka_dec);

      //operacje matematyczne - dodawanie a.add(b);

      BigInteger suma = wielka.add(wielka2);
      System.out.println("Suma "+suma);
      //drugi poprawny zapis:
      System.out.println("Suma "+suma.toString());

      //Przykładowe zadania:

      BigInteger wielkaLiczba = new BigInteger("938217621726189202812801021");
      BigInteger wielkaLiczba2 = new BigInteger("09283873277287287126182192");
      BigInteger ujemna = new BigInteger("-18271726812718");
      int exponent = 3;

      //suma:
      BigInteger suma_liczb = wielkaLiczba.add(wielkaLiczba2);

      //różnica
      BigInteger roznica_liczb = wielkaLiczba.subtract(wielkaLiczba2);

      //mnozenie

      BigInteger iloczyn_liczb = wielkaLiczba.multiply(wielkaLiczba2);

      //potega

      BigInteger potega_3 = wielkaLiczba.pow(exponent);

      //wartosc bezwzgledna -> sposób zapisu!

      BigInteger absolute = wielkaLiczba2.abs();
      BigInteger absolute2 = ujemna.abs();

      System.out.println("Liczba 1: "+wielkaLiczba);
      System.out.println("Liczba 2: "+wielkaLiczba2);
      System.out.println("Liczba 3: "+ujemna);
      System.out.println("Suma wynosi: "+suma_liczb+",\n roznica wynosi "+roznica_liczb+", \n iloczyn wynosi "+iloczyn_liczb);
      System.out.println(wielkaLiczba+" do potegi 3 wynosi "+potega_3);
      System.out.println("wartosc bezwzgledna liczby 2. wynosi: "+absolute);
      System.out.println("wartosc bezwzgledna liczby 3. wynosi: "+absolute2);









    }
  }