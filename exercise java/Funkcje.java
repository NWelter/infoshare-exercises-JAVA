//import statyczny klasy Math:

import static java.lang.Math.*; //* = wszystkie metody Math

public class Funkcje{
  public static void main (String [] args){

    double liczba = 9;
    int b =3;
    double pi = PI;
    double pierwiastek = sqrt(liczba);//nie musimy juz wpisywac nazwy klasy!
    double potega = pow(liczba, b);
    System.out.println("Pierwiastek z "+liczba+" wynosi: "+pierwiastek);
    System.out.println("Liczba "+liczba+" podniesiona do potegi "+b+" wynosi: "+potega);
    System.out.println("Pi wynosi "+pi);

    //zadanie-prosty kalkulator:

    int c = -5;
    int d = 6;

    potega = pow(c,d);
    int bezwzgledna = abs(c);
    pierwiastek = sqrt(pow(c,d));

    System.out.println("Liczba "+c+" podniesiona do potegi "+d+" wynosi "+potega);
    System.out.println("Wartosc bezwzgledna liczby "+c+" wynosi "+bezwzgledna);
    System.out.println("Pierwiastek kwadratowy z -5 podniesionej do potegi 6 wynosi "+pierwiastek);

    //operacje na 3-cyfrowych zmiennych int:

    c = 324;
    d = 111;

    potega = pow(c,d);
    bezwzgledna = abs(c);
    pierwiastek = sqrt(pow(c,d));

    System.out.println("Liczba "+c+" podniesiona do potegi "+d+" wynosi "+potega);
    System.out.println("Wartosc bezwzgledna liczby "+c+" wynosi "+bezwzgledna);
    System.out.println("Pierwiastek kwadratowy z 324 podniesionej do potegi 111 wynosi "+pierwiastek);

    //wyniki sa wyświetlane w zapisie naukowym

  }
}