import java.util.Scanner;
/*
Wczytywanie i wyświetlanie tablicy o liczbie indeksów
zadeklarowanych przez użytkownika.
Wyświetlanie kolejnych indeksów w odpowiadających im rzędach.
 */

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int x, y;
        //deklarujemy tablice o rozmiarach zaleznych od uzytkownika

       System.out.println("Podaj liczbę wierszy:");
       x= in.nextInt();
       System.out.println("Podaj liczbę kolumn:");
       y= in.nextInt();
        int [][] tablica = new int [x][y];

       for (int i=0; i<x; i++){
           for (int j=0; j<y; j++){
               //wczytywanie:
               int k, m;
               //wiersze:
               k=i+1;
               //kolumny:
               m= j+1;
               System.out.println("Podaj element: "+k+", "+m);
               tablica[i][j]=in.nextInt();
           }
       }
        for (int i=0; i<x; i++){
           System.out.println();
            for (int j=0; j<y; j++){
                //wyswietlanie:
                int k, m;
                k=i+1;
                m= j+1;
                //wyświetlanie wyników w jednej linii:
                System.out.print(tablica[i][j]+" ");

            }
        }


    }
}
