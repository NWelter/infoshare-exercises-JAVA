package loops;

public class DrawX {

	/*
	 * ZADANIE 6. 
	 * Napisz metodę, która będzie przyjmować jako parametr dowolną liczbę całkowitą. 
	 * W ciele metody wyświetl do konsoli ciąg liczb od 0 aż do  liczby przekazanej jako parametr. 
	 * Jeśli użytkownik przekaże liczbę ujemną, to powinien w konsoli wyświetlić się komunikat: “Błąd! 
	 * Podałeś ujemną liczbę!”.
	 * 
	 * Przykład: Gdy metoda przyjmie liczbę 4, to w konsoli powinien pojawić się ciąg „01234”. 
	 * Gdy metoda przyjmie liczbę -4, to w konsoli powinien pojawić się komunikat błędu.
	 */

	public void printXs(int xs) {

		if (xs < 0) {

			System.out.println("Podales ujemna liczbe!");

		} else {

			for (int i = 0; i <= xs; i++) {
				System.out.println(i);

			}

		}
	}

	/*
	 * ZADANIE 5. 
	 * Napisz metodę, która będzie przyjmować jako parametr dowolną
	 * liczbę całkowitą. W ciele metody wyświetl do konsoli ciąg znaków ‘X’. 
	 * Długość ciągu znaków ma być równa przekazanemu do metody parametrowi.
	 * 
	 * Przykład: 
	 * Gdy metoda przyjmie liczbę 4, to w konsoli powinien pojawić się ciąg „XXXX” (w jednej linii).
	 */

	public void printXXX(int x) {

		if (x < 0) {

			System.out.println("Podaj liczbę większą od 0!");

		} else {

			for (int i = 0; i < x; i++)
				System.out.print("X");
		}
		System.out.println();
	}

	/*
	 * ZADANIE 8. 
	 * Napisz metodę, która będzie przyjmować jako parametr dowolną liczbę całkowitą. 
	 * W zależności od tej cyfry, wyświetl w konsoli kwadrat złożony ze znaków ‘X’. 
	 * Długość kwadratu ma być zależna od parametru, który został przekazany przez użytkownika. 
	 * 
	 * Przykład: 
	 * Jeśli użytkownik przekazał liczbę 4, to w konsoli powinien zostać wyświetlony kwadrat: 
	 * XXXX 
	 * XXXX 
	 * XXXX
	 * XXXX
	 */

	public void printXsquare(int a) {

		for (int i = 0; i < a; i++) {
			System.out.println();

			for (int j = 0; j < a; j++)

				System.out.print("X");

		}
		System.out.println();
	}
	
	/* ZADANIE 9.
	 * Napisz metodę, która będzie przyjmować jako parametr dowolną liczbę
	 * całkowitą. W zależności od tej cyfry, wyświetl w konsoli trójkąt prostokątny
	 * równoramienny złożony ze znaków ‘X’. 
	 * Długość ramienia trójkąta ma być zależna od parametru, który został przekazany przez użytkownika.
	 * 
	 * Przykład: 
	 * Jeśli użytkownik przekazał liczbę 4, to w konsoli powinien zostać wyświetlony
	 * trójkąt: 
	 * X 
	 * XX 
	 * XXX 
	 * XXXX
	 */

	public void printXtriangle(int b) {
		for (int i = 0; i < b; i++) {
			System.out.println();

			for (int j = 0; j < i; j++)

				System.out.print("X");

		}
		System.out.println();

	}
}
