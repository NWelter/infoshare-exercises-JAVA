
/* 
dziala wg założeń,
poprawiono błędy
 */


import java.util.Scanner;

public class Homework22{

  public static void main(String[] args){

    Scanner in = new Scanner (System.in);

    //deklaracja zmiennych

    String imie = "X";
    int wg = 5;
    int tablica [] = {1,8,5,4,6};
    char komenda;
    int tablica_nowa [] = new int [5];
    boolean tab_uzytkownika = false;
    int wynik =0;
    //zapetlanie
    do{
    //menu powitalne

      System.out.println("MENU PROGRAMU");
      System.out.println("Podaj imie: wcisnij 1");
      System.out.println("Zadeklaruj wartosc graniczna: wcisnij 2");
      System.out.println("Wprowadz dane do tablicy: wcisnij 3");
      System.out.println("Wyswietl wynik: wcisnij 4");
      System.out.println("Wyjscie z programu: wcisnij \"q\"");

    //pobieranie danych od użytkownika

      komenda = in.next().charAt(0);

    //switch
      switch(komenda){

        case '1':
    //deklaracja drugiego scannera dla Stringów
        Scanner in2 = new Scanner (System.in);
        imie = in2.nextLine();
        break;
    //wporawadzanie nowej wartosci granicznej
        case '2':
        System.out.println("Podaj wartosc: ");
        wg = in.nextInt();
        break;

      //wprowadzanie danych do tablicy
        case '3':
        tab_uzytkownika=true;
        System.out.println("Podaj 5 liczb:");
        for (int i =0; i<5; i++){
          int a = i+1;
          System.out.println("Liczba "+a+":");
          tablica_nowa [i] = in.nextInt();
        }
        break;

      // obliczanie wyniku na podstawie T/F tablica_nowa
        case '4':
        {
          if (tab_uzytkownika == true){
            wynik =0;
            for(int i=0; i<5; i++){

              if(tablica_nowa [i]>wg){

                wynik = wynik + tablica_nowa [i];
              }else 
              wynik = wynik - tablica_nowa [i];

            }

          } else {

            for(int i=0; i<5; i++){

              if(tablica [i]>wg){

                wynik = wynik + tablica [i];
              }else 
              wynik = wynik - tablica [i];
            }
          }

          System.out.println("Czesc "+imie+"! Podales wartosc graniczna "+wg+". Wynik operacji to: " +wynik+".");
          System.out.println();
          break;
        }
        
        case 'q':

        System.out.println("Koniec programu!");
        System.exit(0);
        break;

        default:
        System.out.println("Nie ma takiej opcji!");
      }
    }while(!(komenda=='q'));
  }
}
