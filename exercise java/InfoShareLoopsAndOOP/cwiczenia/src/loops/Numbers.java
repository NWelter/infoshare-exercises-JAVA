package loops;

/*
 ZADANIE 7.
 Napisz metodę, która będzie przyjmowała jako parametr dowolną liczbę całkowitą. 
 W zależności od parametru, metoda ta ma wyświetlać do konsoli komunikaty kolejno dla każdej liczby
 od 1 do liczby przekazanej jako parametr. 
 Komunikaty, które mają zostać wyświetlone to:
- „PARZYSTA”, jeśli aktualnie sprawdzana liczba jest liczbą parzystą;
- „NIEPARZYSTA”, jeśli aktualnie sprawdzana liczba jest liczbą nieparzystą;
- oraz „PODZIELNA PRZEZ 5”, jeśli aktualnie sprawdzana liczba jest liczbą podzielną przez 5
 (dla tej liczby nie może już pokazywać się komunikat czy jest parzysta czy nie).
 */

public class Numbers {

	public void number(int num) {

		for (int i = 1; i <= num; i++) {

			if (i % 5 == 0) {

				System.out.println("PODZIELNA PRZEZ 5");

			} else if (i % 2 == 0) {

				System.out.println("PARZYSTA");
			}

			else {
				System.out.println("NIEPARZYSTA");
			}

		}
	}
}
