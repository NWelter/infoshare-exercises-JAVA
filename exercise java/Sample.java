//przy tworzeniu z terminala nalezy pamiętać o imporcie bibliotek z klasami
import java.util.Scanner;

public class Sample{
	public static void main(String[] args){
//pierwsze wyjscie: Hello, World!
		System.out.println("Hello, World!");
//ustalanie wejscie: System.in- klasa Scanner zaimportowana z java.util
		Scanner in = new Scanner(System.in);
		System.out.println("Jak masz na imie?");
//dane wejsciowe typu String - funkcja nextLine do String
		String imie = in.nextLine();
		System.out.println ("Ile masz lat?");
//dane wejsciowe typu int - funkcja nextInt do int
		int wiek = in.nextInt();
//konkatenacja String + int
		System.out.println("Witaj "+imie+"!"+" Masz "+wiek+" lat.");
// wyswietlanie cudzyslowia
		System.out.println("\"Witaj "+imie+"!"+" Masz "+wiek+" lat.\"");

		
	}
}