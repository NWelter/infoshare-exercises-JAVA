
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
    
    //menu powitalne

    System.out.println("MENU PROGRAMU");
    System.out.println("Podaj imie: wcisnij 1");
    System.out.println("Zadeklaruj wartosc graniczna: wcisnij 2");
    System.out.println("Wprowadz dane do tablicy: wcisnij 3");
    System.out.println("Wyswietl wynik: wcisnij 4");
    System.out.println("Wyjscie z programu: wcisnij \"q\"");

    do{

    //pobieranie danych od użytkownika

      komenda = in.next().charAt(0);

    //switch
      switch(komenda){

        case '1':
        System.out.println("\n Podaj swoje imie: \n");
    //deklaracja drugiego scannera dla Stringów
        Scanner in2 = new Scanner (System.in);
        imie = in2.nextLine();
        System.out.println("\n Wybierz kolejna opcje: ");
        break;
    //wporawadzanie nowej wartosci granicznej
        case '2':
        System.out.println("\n Podaj wartosc: \n");
        wg = in.nextInt();
        System.out.println("\n Wybierz kolejna opcje: ");
        break;

      //wprowadzanie danych do tablicy
        case '3':
        tab_uzytkownika=true;
        System.out.println("\n Podaj 5 liczb: \n");
        for (int i =0; i<5; i++){
          int a = i+1;
          System.out.println("\n Liczba "+a+": \n");
          tablica_nowa [i] = in.nextInt();
        }
        System.out.println("\n Wybierz kolejna opcje: ");
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

          System.out.println("\n Czesc "+imie+"! \n Podales wartosc graniczna "+wg+". \n Wynik operacji to: " +wynik+". \n");
          System.out.println("\n Wybierz kolejna opcje: ");
          break;
        }
        
        case 'q':

        System.out.println("\n Koniec programu!");
        System.exit(0);
        break;

        default:
        System.out.println("\n Nie ma takiej opcji!");
        System.out.println("\n Wybierz kolejna opcje: ");
      }
    }while(!(komenda=='q'));
  }
}
