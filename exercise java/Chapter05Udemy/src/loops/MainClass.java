package loops;

import java.util.Scanner;

public class MainClass {
	
	public static void main (String [] args) {
		
//FOR LOOP
		
		/* STRUCTURE OF 'FOR' LOOP:
		 * for (initialization; termination; increment/decrement){
		 * statement(s);
		 * }
		 */
		
	//**Example of RISK of initialization variable OUT OF loop (is not good idea):
		
		int i = 0;
		
		for(; i<5; i++) {
			System.out.println("int i was initialized out of loop. Value of i is: "+i);
		}
		
		//Now we create another loop:
		
		//i = 0;
		
		for(; i<10; i++) {
			
			System.out.println("Another loop. Value of i is: "+i);
		}
		
		//We see that i = 4 after first loop. Variable must be reset before second loop.
		
	//**Example of infinitive 'for' loop:
		
		 //for ( ; ; ) 
		
		int k = 0;
		for (;;) {
			
			if (k == 10)
			break; //break - to terminate the loop when condition is true
			System.out.println(k);
			k++;
		}
		
		System.out.println("After the loop the value of k is: "+k);
		
	//Application of 'continue':
		
		for (int j=1; j<=10; j++) {
			
			if (j % 2 != 0) // condition for odd number (liczby nieparzyste)
			continue;			
			/*
			 * if condition is true (j == odd number) loop is 'continue':
			 * lines of code below are skipping 
			 * and program jumps to next iteration of loop
			 */
			System.out.println(j);//only even numbers (l. parzyste) are print out		 
		
		}
		
//WHILE LOOP
		
	//**Example of infinitive 'while' loop:
		
		// while (true)
		
	//Main different between 'while' loop and 'do while' loop:
		
		//1. While loop
		
		int howManyTimes = 0;
		
		System.out.println("Before the while loop, value of howManyTimes is: "+howManyTimes);
		
		while (howManyTimes <0) //loop is not executed -> condition is false
			howManyTimes++;
		System.out.println("After the while loop, value of howManyTimes is: "+howManyTimes+"\n");
		
		//2. Do-while loop
		
		System.out.println("Before the do-while loop, value of howManyTimes is: "+howManyTimes);
		
		do { // loop will be executed at least once
			
			howManyTimes++;
			
		} while (howManyTimes <0);
		
		System.out.println("After the do-while loop, value of howManyTimes is: "+howManyTimes+"\n");
		
//Examples:
		//a. for loop:
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Enter your number: ");
		
		int number = reader.nextInt();
		int sum = 0;
		
		for (i=0; i<=number; i++) 			
			sum +=i; //another way: sum = sum + i;	
		
		System.out.println("After 'for' loop sum is: "+sum+"\n");
		
		//b. while loop:
		
		sum = 0;
		i = 0;
		
		while(i<=number) {
			sum+=i;
			i++;
		}
		System.out.println("After 'while' loop sum is: "+sum+"\n");
		
		//c. do-while loop
		
		sum = 0;
		i = 0;
		
		do {
			
			sum +=i;
			i++;
			
		} while(i<=number);
		
		System.out.println("After 'do-while' loop sum is: "+sum+"\n");
		
		/*
		 * QUIZ TASK 1.
		 * Write a program that will print the Fibonacci sequence up to a number entered by an user.
		 * Program has to prompt the user to enter how many Fibonacci numbers they want to be printed out
		 * and print those numbers.
		 */
			
		System.out.println("Enter how many numbers of the Fibonacci sequence you want to print out: ");
		
		int fib1 = 0, fib2 = 1;
		
		int fibonacci = reader.nextInt();
		
		sum = 0;
		
		for(i=0; i<fibonacci; i++) {
			
			System.out.print(" "+fib1+" ");
			
			sum = fib1+fib2;
			fib1=fib2;
			fib2=sum;
			
		}
		
		/*
		 * SOLUTION for Quiz Task 1. FROM TUTORIAL:
		 *  int fib1 = 0, fib2 = 1;
		 *  sum = 0;
		 *  int fibonacci = reader.nextInt();
		 *  
		 *  System.out.print("First "+fibonacci+" numbers of the Fibonacci sequence are: "
		 *  						+fib1+" "+fib2+" ");
		 *  for(i=3; i<=fibonacci; i++) -> i=3 cause we have already first and second fibonacci's number (0 nad 1)
		 *  {
		 *  sum = fib1 + fib2;
		 *  fib1 = fib2;
		 *  fib2 = sum;
		 *  System.out.print(sum+" ");
		 *  }
		 *  
		 */
		
		/*
		 * QUIZ TASK 2. 
		 * Write a program that will prompt the user to enter a number and then count how many
		 * digits that number has. For example, if the user enters 1234, your program should
		 * output: "The number entered has 4 digits".
		 */
		
		System.out.println("\n Enter an integer: ");
		
		int yourNumber = reader.nextInt();
		int decimal = 10;
		
		if (yourNumber>=0) {
		
		for( i = 1; i< yourNumber; i++) {
			
			if(decimal>=yourNumber) 	
				break;	
			decimal*=10;
			
			}
		
		System.out.println("Your number has "+i+" digit(s)");
		
		//condition for negative numbers
		} else {
			
			decimal = -10;
			
			for( i = 1; i> yourNumber; i++) {
				
				if(decimal<yourNumber) 	
					break;	
				decimal*=10;
				
				}
			
		System.out.println("Your number has "+i+" digit(s)");
		}
		
		/*
		 * SOLUTION for Quiz Task 2. Simplified way (but only for positive numbers):
		 * 
		 * int yourNumber = reader.nextInt();
		 * int counter = 0;
		 * 
		 * while (yourNumber > 0){
		   yourNumber /= 10; -> yourNumber is an integer, decimal point has been truncated
		   counter++;
		 * }
		 * System.out.println("Your number has "+i+" digit(s)");
		 * 
		 */
		
		/*
		 * QUIZ TASK 3.
		 * Write a program that will prompt the user to enter a number and then print out the reverse of it.
		 * For example, if the user enters 1234, your program should output: "The reversed number is 4321".
		 */
		
		//Solution for Quiz Task 3 from tutorial:
		
		System.out.println("Enter your number: ");		
		number = reader.nextInt();
		int reverseNumber = 0;
		
		do {
			int temporary = number % 10;
			reverseNumber = reverseNumber * 10 + temporary;
			number  /=  10; //decimal point has been truncated
					
		} while (number>0);
		
		System.out.println("Reversed order is: "+reverseNumber);
		
		
		}
		
			
		

		
		
	}


