package conditionals;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		//CONDITIONALS -> SELECTION STRUCTURE

		/*
		 * SELECTION STATEMENT - if, if/else if, else
		 * if - can be independent
		 * else - cannot
		 * MULTIPLE-CHOICE SELECTION - switch statement
		 */

		Scanner reader = new Scanner (System.in);
		System.out.println("Enter a number: ");

		double number = reader.nextDouble();

		if(number>0) {

			System.out.println("The number is positive.");

		} else if (number ==0) {

			System.out.println("The number is equal to 0.");

		} else {

			System.out.println("The number is negative.");

		}

		//nested if statement

		System.out.println("How old are you?");

		double age = reader.nextDouble();

		if(age>0) {

			if(age<18) {

				System.out.println("You are minor.");

			} else if (age>100) {

				System.out.println("You reach a great age! Congratulations!");

			}else {

				System.out.println("You are an adult.");
			}

		} else {

			System.out.println("Are you not born yet?!");

		}


		//another example of nested if statement:

		System.out.println("Enter a number (an integer): ");

		int num = reader.nextInt();

		if(num==0) {

			System.out.println("You've entered a zero.");

		} else if (num>0) {

			if(num<10) {

				System.out.println("Your number is less than 10.");

			} else if (num>=10 && num<=100) {

				System.out.println("Your number is between 10 and 100.");

			}else {

				System.out.println("Your number is greater than 100.");
			} 
		} else {

			if (num>-10){

				System.out.println("Your number is greater then -10 but less than zero.");

			} else if (num<=-10 && num>=-100) {

				System.out.println("Your number is between -10 and -100.");
			} else {

				System.out.println("Your number is less than -100.");
			}			

		}
		
//SWITCH STATEMENT:
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		
		char letter = in.next().charAt(0);
		
		switch (letter) {
		
		case 'A':
			
			System.out.println("Yo've entered letter A.");
			break;
			
		case 'B':
			
			System.out.println("Yo've entered letter B.");
			break;
			
		case 'C':
		{
			System.out.println("Yo've entered letter C.");
			System.out.println("More than 1 line of code must be in curly braces.");
			break;
		}
		default:
			
			System.out.println("Yo've not entered any of this letter: A, B, C.");

		}
		
	/*
	 * QUIZ TASK 1. Write a program that will print out grades based on the number
	 * of points a student got on the exam. The number of points is between 0 and 100.
	 * (The specific grading criteria was shown in tutorial.)
	 */
		
		System.out.println("Enter your number of points: ");
		
		int points = reader.nextInt();
		
		if (points>55 && points<=100) {
			if (points<=65)
				System.out.println("You got D");
			else if (points <=75) 
				System.out.println("You got C");
			 else if (points <=85) 
				System.out.println("You got B");
			 else 
				System.out.println("You got A! Congratulations!");
		} else  if (points>0 && points<=55)
			System.out.println("You got F");
		 else 
			System.out.println("Your point's number is invalid!");

		/*
		 * QUIZ TASK 2.
		 * Modify the previous code to implement the changes 
		 * in the grading scale (additional grades - specific criteria was shown in tutorial).
		 */
		
System.out.println("Enter your points: ");
		
		points = reader.nextInt();
		
		if (points>50 && points<=100) {
			
			if (points<=55)				
				System.out.println("You got D");
			 else if (points <=60) 				
				System.out.println("You got C-");				
			 else if (points <=65) 			
				System.out.println("You got C");			
			 else if (points <=70) 			
				System.out.println("You got C+");			
			 else if (points <=75) 			
				System.out.println("You got B-");			
			else if (points <=80) 			
				System.out.println("You got B");		
			 else if (points <=85) 		
				System.out.println("You got B+");
			 else if (points <=90) 			
				System.out.println("You got A-");		
			 else if (points <=95) 			
				System.out.println("You got A! Congratulations!");		
			 else 	
				System.out.println("You got A+! You're AMAZING!");	
		} else  if (points>0 && points<=50)
			System.out.println("You got F");
		 else 
			System.out.println("Your point's number is invalid!");
		
		/*
		 * QUIZ TASK 3: Implement comments based on the grade received and print it out.
		 */
		
		System.out.println("Enter your grade: ");
		
		char grade = in.next().charAt(0);
		/*
		 * In tutorial solution is another way to do this: 
		 * we initialize char grade ='F'; (not keyboard input)
		 * and change it values in every if-else statements from Quiz Task 1.
		 */
		
		switch (grade) {
		
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well done!");
			break;
		case 'C':
			System.out.println("Needs more work.");
			break;
		case 'D':
			System.out.println("You have passed the exam.");
			break;
		case 'F':
			System.out.println("You have failed the exam.");
			break;	
		default:
			System.out.println("Incorrect grade!");
				
		}
		
		/*
		 * QUIZ TASK 4: Write a program that will prompt the user to enter a number
		 * and then check whether the number is a prime or not.
		 */
		
		System.out.println("Enter your natural number: ");
		
		int number2 = reader.nextInt();
		
		if (number2>1) {
			
			if(number2==3)
				System.out.println("It's a prime number.");
			else if(number2%2==0 || number2%3==0)
				System.out.println("It's natural number but not a prime number.");
			else
				System.out.println("It's a prime number.");
			
		}else
			System.out.println("It's not a natural number!");

	}

}
