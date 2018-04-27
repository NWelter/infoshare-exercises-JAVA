/* ćwiczenia z kursu:

https://javastart.pl/baza-wiedzy/darmowy-kurs-java/podstawy-jezyka/pierwszy-program

*/

//1. Pierwszy program:

public class JavaStart{
  public static void main (String [] args){
  //Hello World! 
    System.out.print("Hello World");
    // 3 imiona  w kolejnych 3 liniach
    System.out.println("Natalia");
    System.out.println("Ilona");
    System.out.println("Grzegorz");

//2. Typy danych:

    //wyswietla 164: automatyczne dopasowanie char na int
    System.out.println('A'+'c');
    System.out.println(16/4);
    //wyswietli wynik w liczbach calkowitych (4)
    System.out.println(17/4);
    System.out.println(1.0*2.0);
    System.out.println(true);
    // znaki specjalne wypisujemy poprzedzajac je znakiem \
    System.out.println("backslash \\");

//3. Zmienne:

    int liczba1 = 5;
    int liczba2 = liczba1;
    /*
    Operacja przypisania liczba2=liczba1 jest jednorazowa.
    Pozniejsza zmiana wartosci liczba1 nie spowoduje zmiany
    wartosci liczba2! Patrz: przyklad poniżej.
    */
    System.out.println(liczba1+liczba2);

    double liczba3, liczba4;
    liczba3 = 3.3;
    liczba4 = 2.8;
    System.out.println(liczba3-liczba4);
    liczba1=12;
    System.out.println(liczba1+liczba2);

    //zmienne finalne - inicjuje się je tylko raz i nie mozna zmieniać wartości:

    final double liczbaPi = 3.14;

    //konkatenacia Stringów:
    String hello = "Witaj ";
    String person = "kursancie";
    String powitanie = hello+person;
    System.out.println(powitanie);
    /* metoda substring() - służy do wyciągania części Stringów
     wymaga podania 2 aegumentów typu int: 
    1. indeksu początkowego - od niego zaczyna wyświetlać substring np. 0 dla pierwszego znaku,
    2. indeksu końcowego - kończy wyświetlanie substringa na ind_końc -1
    */
    String ursa = person.substring(1,5);
    System.out.println(ursa);
    //ćwiczenia:
    String imie = "Natalia ";
    String nazwisko = "Welter ";
    String plec = "kobieta";
    String dane_osobowe = imie+nazwisko+plec;
    System.out.println(dane_osobowe);
    System.out.println(imie.substring(0,3)+imie.substring(7,8)+nazwisko.substring(0,3)+plec.substring(4,7));

//4. Operatory matematyczne i logiczne:

    /* działają podstawowe symbole matematyczne:
       +, -, *, /, % (modulo=reszta z dzielenia)
       obowiązuje kolejność działań, 
       używa się nawiasów okrągłych - szczególnie przy dzieleniu,
       by wynik dzielenia mieć z częścią dziesiętną 
       należy zadeklarowac chociaż jedną zmienna jako typ zmiennoprzecinkowy
       oraz zmienną przechowującą wynik jako double:
    */
       int a = 10;
       double b = 4.0;
       double c = a/b;
       System.out.println(c);

    //operatory skrótowe:
       a = 12;
       b = 5.0;
    a+=b; //a=a+b;
    System.out.println("a= "+a);
    a=12;
    a-=b; //a= a-b;
    System.out.println("a= "+a);
    a=12;
    a*=b; //a=a*b;
    System.out.println("a= "+a);
    a=12;
    a/=b; //a=a/b; wyswietli 2, bo a jest typu int
    System.out.println("a= "+a);
    a=12;
    a%=b; //a=a%b;
    System.out.println("a= "+a);
    a=12;

    /*operatory inkrementacji(++)/dekrementacji(--):
    A. PREFIKSOWE (++i) - zwiększają/zmniejszają wartość PRZED przypisaniem
    B. POSTFIXOWE (i++) - zwiększają/zmniejszają wartość PO przypisaniu
    Przykłady postfixowe:
    */
    a=5;
    b=11;
    c=a+b++; //c=a+b, a pozniej b=b+1;
    System.out.println("postfix c = "+c);
    System.out.println("postfix b = "+b);

    c=(a++)+b; //c=a+b; a później a=a+1; mozna zapisać c=a+++b;
    System.out.println("postfix c = "+c);
    System.out.println("postfix a = "+a);
    /*
    Zapis c=a+++b; to to samo co c=(a++)+b; ALE NIE c=a+(++b);!
     --> inkrementacja jest wykonywana przed dodawaniem,

     Przykłady prefixowe:
    */

     a=5;
     b=11;
    c=a+(++b); //najpierw b=b+1; pozniej c=a+b;
    System.out.println("prefix c = "+c);


    c = ++a+b; //najpierw a=a+1; pozniej c=a+b;
    System.out.println(" prefix a = "+a);
    System.out.println("prefix c = "+c);

    /*
    Operatory porównawcze i logiczne:
    ==, !=, <=, >=, <, >,
    && - koniunkcja
    || - alternatywa
    Zwracają wartość typu boolean: true lub false

    *Operator trójargumentowy 
    warunek?wyrażenie1:wyrażenie2;
    (jeżeli warunek zwróci true to wykona się wyrażenie1,
    w przeciwnym wypadku wyrażenie2)
    */
    a=10;
    b=4;
    boolean awieksza = a>b; //= true
    boolean rowne = a==b; //= false
    boolean koniunkcja = (a<b)&&(a!=b); //= false bo 1 warunek nieprawdziwy
    boolean alternatywa = (a<b)||(a!=b); //= true bo 1 warunek jest true

    System.out.println(awieksza);
    System.out.println(rowne);
    System.out.println(koniunkcja);
    System.out.println(alternatywa);

    /*
    Do porównania łańcuchów (Stringów) i innych typów obiektowych
    używa się metody equals(); a nie znaku '=='! Operator '==' w przypadku typów obiektowych
    porównuje referencje, a nie faktyczne obiekty.
    Przyklad:
    */
    String ja = "Natalia";
    String ona = "Kasia";
    String ty = "Natalia";
    boolean porownanie1 = ja.equals(ona);
    boolean porownanie2 = ja.equals(ty);

    System.out.println("ja.equals(ona): "+porownanie1);
    System.out.println("jaequals(ty): "+porownanie2);

    boolean porownanie3 = ja==ty;
    System.out.println("ja==ty: "+porownanie3);
    /*uwaga! haczyk! Powinno być 'false' a jest 'true'!
    Nie używac na co dzień do porównania Stringów
    bo może wywołać cięzkie do wykrycia błedy.
    VM zorientuje się, ze oba łańcuchy sa identyczne i odwołują się 
    do tej samej referencji (miejsca w pamięci)
    */



  }
}
