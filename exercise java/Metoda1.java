import java.util.Scanner;

//wstęp do tworzenia prostych metod

public class Metoda1{

    public static void main(String[] args) {

        int a=10;
        int b=24;
        int wynik = Dodaj(a,b);
        System.out.println(wynik);
    }


    /*
    Utworzenie metody sumującej liczby.
    Ciało metody pod funkcją Main.
    Metoda używa argumentów typu int i zwraca wartość int. 
    */


    public static int Dodaj(int a,int b){
        int suma = a+b;
        return suma;
    }

}
