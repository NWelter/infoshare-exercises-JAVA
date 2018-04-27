import java.util.Scanner;

//instrukcje sterujące

public class Zadanie2{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		/*System.out.println("Podaj zmienna a:");
		int a = in.nextInt();
		System.out.println("Podaj zmienna b:");
		int b = in.nextInt();

		//instrukcja if-else:

		if(a<b){

			System.out.println("Zmienna a jest mniejsza niz b");
		}
		else{
			System.out.println("Zmienna a nie jest mniejsza niz b");
		}
		*/

		// instrukcja switch:

		System.out.println("Podaj pierwsza liczbe:");
		int a = in.nextInt();
		System.out.println("Podaj druga liczbe:");
		int b = in.nextInt();
		System.out.println("Podaj symbol dzialania:");
		char znak = in.next().charAt(0);



		switch (znak){
			case '+':
			int wynik = a+b;
			System.out.println("Twoje liczby to: "+a+" i "+b);
			System.out.println("Twoj wynik dodawania to: "+wynik);
			break;
			case '-':
			wynik = a-b;
			System.out.println("Twoje liczby to: "+a+" i "+b);
			System.out.println("Twoj wynik odejmowania to: "+wynik);
			break;
			case '*':
			wynik = a*b;
			System.out.println("Twoje liczby to: "+a+" i "+b);
			System.out.println("Twoj wynik mnozenia to: "+wynik);
			break;
			case '/':
			double dzielenie = (double)a/(double)b;
			System.out.println("Twoje liczby to: "+a+" i "+b);
			System.out.println("Twoj wynik dzielenia to: "+dzielenie);
			break;
			case '%':
			wynik = a%b;
			System.out.println("Twoje liczby to: "+a+" i "+b);
			System.out.println("Twoja reszta z dzielenia to: "+wynik);
			break;
			default:
			System.out.println("Nie ma takiej operacji");
		}

	}



}
