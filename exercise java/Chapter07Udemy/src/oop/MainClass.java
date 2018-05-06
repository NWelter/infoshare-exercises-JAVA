package oop;

public class MainClass {

	public static void main(String[] args) {
		
		//creating an object from AccessModifiers class:
		
		AccessModifiers testing = new AccessModifiers(); //AccessModifiers() is a CONSTRUCTOR
				
		//check access to the variables:
		
		System.out.println("Accessing the variable with the default modifier: "+testing.noSpec);
		System.out.println("Accessing the variable with the public modifier: "+testing.pubSpec);
		System.out.println("Accessing the variable with the protected modifier: "+testing.protSpec);
		
		/* This line has been not executed - variable is not visible:
		 * System.out.println("Accessing the variable with the private modifier: "+testing.privSpec);
		 */
		//change values of variables:
		
		testing.noSpec = 52;
		testing.pubSpec = 14;
		
		System.out.println("Accessing the variable with the default modifier: "+testing.noSpec);
		System.out.println("Accessing the variable with the public modifier: "+testing.pubSpec);
		
		testing.protSpec = 17;
		System.out.println("Accessing the variable with the protected modifier: "+testing.protSpec);
		
		//create another object with second constructor calling:
		
		AccessModifiers test = new AccessModifiers (10, 12, 14);
		
		
	}

}
