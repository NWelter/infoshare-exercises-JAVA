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
		
		//first method calling:
		
		testing.displayHello();
		
		//second method calling:
		
		System.out.println("The sum is: "+testing.addTwoNumbers(3, 65.56));
		
		//third method calling:
		
		testing.greaterNumb(21, 43);
		testing.greaterNumb(11, 11);
		testing.greaterNumb(-2, -113);
		
		//fourth method calling:
		
		testing.printOut("Something will be printed out!");
		
		
		//calling getters and setters:
		
		GettersAndSetter testingvar = new GettersAndSetter();
		
		//values of num1 and num2 are null:
		System.out.println("The value of num1 is "+ testingvar.getNum1());
		System.out.println("The value of num2 is "+ testingvar.getNum2());
		
		//change the values:
		testingvar.setNum1(3.14);
		System.out.println("The value of num1 is "+ testingvar.getNum1());
		testingvar.setNum2(2.17);
		System.out.println("The value of num2 is "+ testingvar.getNum2());
		
	}

}
