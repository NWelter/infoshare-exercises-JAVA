import java.util.Scanner;


public class Tablica{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		//deklaracja tablicy przechowujacej nazwiska - 1 sposób
		String [] nazwiska1 = new String [5];
		

		//deklaracja tablicy przechowujacej naziwska - 2 sposób
		String nazwiska2 [] = new String [5];

		// wywolanie elementu tablicy: System.out.println(nazwiska2[3]);

		// tworzenie tablicy ze znana zawartoscia - rzadko sie stosuje w praktyce:

		String [] nazwiska= {"Welter", "Kierepka","Cebryk", "Turczyn", "Nawrocki"};

		//wczytywanie danych do tablicy z wykorzytsaniem petli for


		for (int i=0; i<5; i++){ //alterntywnie for(int i=0; i<=4; i++) to ten sam zapis co powyzej

			int a=i+1;
			System.out.println("Podaj nazwisko "+a);
			nazwiska2 [i] = in.nextLine();

		}

		//wyswietlanie wczytanych danych

		

		for (int i =0; i<5; i++){

			int a = i+1;
			System.out.println("Nazwisko nr "+a+": "+nazwiska2 [i]);
		}
		

		//wczytanie danych od najwyzszej wartosci

		for (int i=4; i>=0; i--){
			
			int a=i+1;
			System.out.println("Nazwisko nr "+a+": "+nazwiska2 [i]);
		}

		


		
	}
}
