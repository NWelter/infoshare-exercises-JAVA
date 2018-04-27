//dynamiczne alokowanie pamieci

import java.util.Scanner;


public class Wskaznik{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		//deklaracja wymiaru tablicy

		int w = 0;
		System.out.println("Jaki wymiar tablicy? ");
		w = in.nextInt();

		//dynamiczna alokacja pamięci
		int tablica_liczb [] = new int [w];

		//zmienna pomocnicza dla uzytkownika
		int a;

		//pobieranie danych od uzytkownika
		for(int i=0; i<w; i++){
			a= i+1;

			System.out.println("Podaj liczbe nr "+a+":");
			tablica_liczb [i]= in.nextInt();
		}
		//sumowanie

		int suma = 0;

		for (int i=0; i<w; i++) {

			suma = suma + tablica_liczb [i];

		}
		//wyswietlanie wyniku

		System.out.println("Suma liczb wynosi: "+suma);
		
	}
}