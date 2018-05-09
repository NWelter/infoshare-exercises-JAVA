
public class Main {

	public static void main(String[] args) {

		// tworzenie obiektu klasy Greeter
		Greeter object1 = new Greeter("Natalia");

		object1.greetNewFriend();

		// zmienna typu String, ktora korzysta z metody pass i danych obiektu1:
		String imie = object1.passGreeting();
		System.out.println(imie);

	}
}
