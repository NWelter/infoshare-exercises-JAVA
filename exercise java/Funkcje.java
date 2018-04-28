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


  }
}