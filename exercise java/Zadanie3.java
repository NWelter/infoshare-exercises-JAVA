import java.util.Scanner;

//petle

public class Zadanie3{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);

		int a=10;
		int i=4;
		

		while(i<5){
			System.out.println("Zmienna a = "+a);
			a=a+3;
			i++;
		}
		

		a=10;
		i=4;

		do {
			System.out.println("Zmienna a = "+a);
			a=a+3;
			i++;

		} while (i<5);

//petla for
		a=0;

// deklaracja zmiennej licznika b to zmienna lokalna
		for (int b=0; b<5; b++){
		//b++;
			a=a+3;
			System.out.println("Zmienna a = "+a);

		}
	}
}



