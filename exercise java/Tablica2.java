import java.util.Scanner;


public class Tablica2{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		//deklarowanie tablicy

		int tablica_liczb [] = new int [5];

		//pobieranie danych

		int a;

		for (int i=0; i<5; i++){
			a= i+1;

			System.out.println("Podaj liczbe nr "+a+":");
			tablica_liczb [i]= in.nextInt();
		}
		
		//sumowanie

		int suma = 0;

		for (int i=0; i<5; i++) {

			suma = suma + tablica_liczb [i];

		}

		// wyswietlanie wyniku

		System.out.println("Suma liczb wynosi: "+suma);
		




	}
}