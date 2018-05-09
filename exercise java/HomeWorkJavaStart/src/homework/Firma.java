package homework;

public class Firma {

	public static void main(String[] args) {
		
	//Utwórz 3 obiekty przechowujące dane klasy Pracownik i wyświetl je.
		
		//Obiekt nr 1.
		
		Pracownik robotnik = new Pracownik();
		robotnik.imie = "Jan";
		robotnik.nazwisko = "Kowalski";
		robotnik.wiek = 33;
		robotnik.staz = 7.5;
				
		
		robotnik.danePracownika();
		
		//Obiekt nr 2.
		
		Pracownik kasjer = new Pracownik();
		
		kasjer.imie = "Andrzej";
		kasjer.nazwisko = "Kot";
		kasjer.wiek = 45;
		kasjer.staz = 2.5;
		
		kasjer.danePracownika();
		
		//Obiekt nr 3.
		
		Pracownik analityk = new Pracownik();
		
		analityk.imie = "Anna";
		analityk.nazwisko = "Baran";
		analityk.wiek = 27;
		analityk.staz = 1.5;
		
		analityk.danePracownika();
		System.out.println();
		
// Wersja z tablicami danych - utwórz obiekty i wczytaj/wyświetl dane za pomocą tablic:
		
		//tablice przechowujące wartości pól klasy Pracownik:		
		String [] imie = {"Bogumił", "Zbigniew", "Angelika", "Roman"};
		String [] nazwisko = {"Wąs", "Elektryk", "Kiełbasa", "Wesoły"};
		int [] wiek = { 57, 44, 21, 59};
		double [] staz = {20, 17.5, 3, 11};
		
		// tablica obiektów klasy pracownik
		Pracownik [] pracownicy = new Pracownik [4];
	
		
		//wczytywanie danych do tablicy:
		
		for ( int i =0; i<pracownicy.length; i++) {
			//tworzenie konstruktora dla każdego obiektu
			pracownicy[i] = new Pracownik ();
			
			pracownicy[i].imie = imie [i];
			pracownicy[i].nazwisko = nazwisko [i];
			pracownicy[i].wiek = wiek [i];
			pracownicy[i].staz = staz [i];
			
		}
		
		//wyswietlanie danych:
		
		for (int i = 0; i<pracownicy.length; i++) {
			
			//wykorzystujemy metodę klasy Pracownik do wyświetlania danych obiektów
			pracownicy[i].danePracownika();
		}
		
		
		
		
		
		

	}

}
