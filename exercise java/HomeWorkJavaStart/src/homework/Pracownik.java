package homework;

//klasa Pracownik ma przechowywać 4 pola: imię, nazwisko, wiek i staż pracy pracownika.

public class Pracownik {
	
	// Pola:
	
	String imie;
	String nazwisko;
	int wiek;
	double staz;
	
	//Konstruktor domyślny:
	
	public Pracownik (){
		
	}
	
	
	
	//Metody:
	
	public void danePracownika () {
		
		System.out.println("Imię: "+imie+", Nazwisko: "+nazwisko+", Wiek: "+wiek+" Staż pracy: "+staz+".");
	}

}
