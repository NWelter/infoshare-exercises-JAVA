package arrays;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		//array declaration:
		
		int [] array = new int [3];
		
		array [0] = 109;
		
		//if we dont't declare variable value - default value of int array is '0'
		System.out.println(array[2]);
		
		//very important and useful properties is .length - display number of array's index
		
		System.out.println(array.length);
		
		//load data from user:
		
		Scanner reader = new Scanner (System.in);
				
		for (int i = 0; i<array.length; i++) {
					
			System.out.println("Enter next element: ");
			array[i] = reader.nextInt();
			
			}
		
		//print out index values:
		
		for (int i = 0; i < array.length; i++)
			
			System.out.print(" "+array[i]+" ");		
		
		
		/*
		   Structure of multidimensional array (2D array):
		 
		  		index [i][j]
		  		[i] - for rows, [j] - for columns:
		  		
			4 9 12 19	[0][0] [0][1] [0][2] [0][3]
			7 6 15  	[1][0] [1][1] [1][2]
			2 3 		[2][0] [2][1] 
			
		 */

		//2D-array declaration with assign contents
		
		int [][] array2D = { {4, 9, 12, 19}, {7, 6, 15}, {2, 3},};
		
		System.out.print("\n"+array2D[0][1]+"\n"); //= 9	
		
		for (int i = 0; i<array2D.length; i++) {
			
			System.out.println();	
			
			for(int j = 0; j<array2D[i].length; j++)
				
				System.out.print(array2D[i][j]+" ");	
			
		}
		
		/*
		 * QUIZ TASK 1.
		 * 
		 * Using arrays, write a program that will prompt the user to enter an integer
		 * and then the program should print out the digit with the biggest number of occurrences.
		 * For example, if the user enters 233443, the program should print out
		 * "The most occurring digit is 3". 
		 */
		
	//SOLUTION FROM THE TUTORIAL:
		
		System.out.println("\n Please enter your integer: ");
		
		Scanner in = new Scanner (System.in);
				
		
		int number = in.nextInt();
		
		int [] newArray = new int [10];
		
		 while(number != 0) {
			 
			 //change user's number to array's index digits
			 
			 newArray[number%10]++;
			 number /= 10; 
			 
		 }
			 /*
			  Explain: user enters 1256 -> number = 1256.
			  11256 % 10 = 6 -> newArray[6] (default value = 0) is now increment ++ (newArray[6] =1;)
			  number /10 = 1125 (number is int, decimal point is truncated)
			  1125 % 10 = 5 -> newArray[5]++ = 1;
			  1125/10 = 112
			  112 % 10 = 2 -> newArray[2]++ = 1;
			  112/10 = 11
			  11 % 10 = 1 -> newArray[1]++ = 1;
			  11/10 = 1
			  1 % 10 = 1 -> newArray[1]++ = 2; <- max value
			  1/10 = 0 <- while(false), stop the loop
			  */
			 
			 //Compare values of array's index and print out the results:
			 
			 //Create a new variables:
			 
			 int max = newArray[0];
			 int value = 0;
			 
			 for (int i = 1; i<newArray.length; i++) {
				 
				 if (newArray[i]>max) {
					 
					 max = newArray[i];
					 value = i;	 	 
					 
				/*			
				  Example (11256): 
				  newArray[1] has max value (2): increments have been applied twice
				  number of index [i] is equal to the most occurring digit
				 */							 
				 }
			 }
			 System.out.println("The most occuring digits is: "+value + " Number of occurences is: "+max);
				
		
		/*
		 * QUIZ TASK 2.
		 * You have an array of integers.
		 * Write a program that will move all zeros to the end of the array. 
		 * The order of other elements should remain the same.
		 * For example:
		 * arr = [ 0, 2, 5, 6, 0, 1] change to:
		 * arr = [ 2, 5, 6, 1, 0, 0] 
		 */
		
		
		//declaration size of array
		
		System.out.println("\n \n Enter number of array's elements: ");	
		int size = reader.nextInt();
		int [] array1 = new int [size];
		
		//load data from user
		
		for (int i = 0; i<array1.length; i++) {
			
			System.out.println("Enter next element: ");
			array1[i] = reader.nextInt();	
			}
		
		//Print out array's elements before sort it:
		
		System.out.println("\n Your array before sort it: ");
		System.out.println();
		
		for (int i = 0; i<array1.length; i++)
			
			System.out.print(" "+array1[i]+" ");
		
			
		//Sorting array with nested loop 'for':
		
		for (int i = 0; i<array1.length-1; i++) {
			
			for ( int j = 0; j < array1.length-1; j++) {
				
				if (array1[j] ==0) {
					
					int bufor = array1[j]; //bufor -> temporary variable to keep value of array[j] (0)
					array1[j] = array1[j+1]; //now [i] value is equal to next index
					array1[j+1] = bufor; // 0 is moved to next index
				}
			}
		}
			
		//print out result of sorting:
		System.out.println();
		System.out.println("\n Your array after sort it: ");
		System.out.println();
		
			for (int i = 0; i<array1.length; i++) {
				
				System.out.print(" "+array1[i]+" ");
			}
			
			
			
			
				
			
			
			
			
		}
		
		
	}


