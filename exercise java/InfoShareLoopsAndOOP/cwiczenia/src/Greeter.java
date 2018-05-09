public class Greeter {
	/*ZADANIE 1.
	 * Stwórz nową klasę o nazwie Greeter. 
	 * W tej klasie utwórz metodę greet(), która będzie wyświetlać komunikat do konsoli „Hello world!”. 
	 * Następnie zrefaktoruj klasę HelloWorld tak, żeby wykorzystywała nowoutworzoną klasę i metodę.
	 * 
	 * ZADANIE 2.
	 * Zmodyfikuj kod z ćwiczenia 1. tak, żeby wyświetlał komunikat „Hello” oraz imię 
	 * przekazane do metody greet() jako parametr typu String (np. „Hello Adrian!”).
	 * 
	 * ZADANIE 3.
	 * Dodaj do klasy Greeter pole typu String o nazwie name. 
	 * Następnie dodaj metodę o nazwie greetNewFriend(), 
	 * która będzie wyświetlać do konsoli komunikat „Hello” oraz imię 
	 * przekazane przy tworzeniu obiektu Greeter (np. „Hello Adrian!”).
	 * 
	 * ZADANIE 4.
	 * Dodaj do klasy Greeter metodę o nazwie passGreeting(), która będzie zwracać zmienną typu String.
	 * W metodzie tej przekaż użytkownikowi komunikat „Hello” + imię użytkownika (bez drukowania do konsoli). 
	 * Następnie w metodzie main() w klasie HelloWorld wykorzystaj tę metodę do wyświetlenia w konsoli 
	 * przekazanego komunikatu.
	 */

	private String name;

	// tworzenie konstruktora:
	public Greeter(String name) {

	// sposob ze slowem this
		this.name = name;

		/*
		 * Drugi sposob:
		 * public Greeter (String name1) 
		 * { name = name1; }
		 * 
		 */

	}

	public void greetNewFriend() {

		System.out.println("Hello " + name + "!");
	}

	// metoda zwracajaca zmienna typu String:

	public String passGreeting() {

	// zmienna 'name' bedzie wykorzystywana ta z kontruktora:

		return "Hello " + name + "!";

	}

}
