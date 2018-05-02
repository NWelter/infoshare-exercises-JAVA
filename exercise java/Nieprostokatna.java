import java.util.Scanner;


public class Nieprostokatna{

  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);

        //deklaracja tablicy nieprostokatnej

    int tablica [][] = new int [3][];
    tablica [0]=new int [4];
    tablica [1]= new int [3];
    tablica [2]= new int [2];
    int a, b;

        //zastosowanie własności tablicy .length slużącej do określania jej długości


    for (int i=0; i< tablica.length; i++){

        	//przejrzystosc dzieki liniom odstepu

     System.out.println();
     System.out.println();

     for (int j=0; j<tablica[i].length; j++)
       {	a=i+1;
        b=j+1;
        System.out.println("Podaj wartosc nr " +b+" tablicy wiersza nr "+a);
        tablica [i][j]=in.nextInt();
      }
    }

        //wyświetlanie indeksów w kolejnych wierszach:

    for (int i=0; i< tablica.length; i++){
      System.out.println();
      for (int j=0; j<tablica[i].length; j++)
       {	a=i+1;
        b=j+1;
        System.out.print(" " +tablica[i][j]+" ");
        
      }
      System.out.println();
    } 

  }
}