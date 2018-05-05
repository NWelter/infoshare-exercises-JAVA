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
		
	}

}
