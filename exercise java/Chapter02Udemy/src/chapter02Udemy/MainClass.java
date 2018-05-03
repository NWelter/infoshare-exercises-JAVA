package chapter02Udemy;

public class MainClass {

	public static void main(String[] args) {
		
//RELATIONAL OPERATORS
		
		int a = 5;
		int b = 6;
		boolean test = a == b;
		 
		 System.out.println(a+" == "+b+" is "+test);
		 
		 test = a!=b;
		 
		 System.out.println(a+" != "+b+" is "+test);
		 
		 test = a>b; //a>=b;
		 
		 System.out.println(a+" > "+b+" is "+test);
		 
		 test = a<b; //a<=b;
		 
		 System.out.println(a+" < "+b+" is "+test);
		 
//LOGICAL OPERATORS
		 /*
		  * AND &&
		  * OR ||
		  * NOT !
		  */
		 
		 boolean one = true;
		 boolean two = false;
		 
		 System.out.println(one+" && "+two+" returns "+(one&&two));
		 System.out.println(one+" || "+two+" returns "+(one||two));
		 System.out.println("Negative: "+one+" && "+two+" returns "+!(one&&two));
		 System.out.println("Negative: "+one+" || "+two+" returns "+!(one||two));
		 
//ASSIGNMENT OPERATORS (OPERATORY PRZYPISANIA)	
		 /*
		   =
		  +=
		  -=
		  *=
		  /=
		  %=
		  
		  */
		 
		 int example = 1;
		 
		 example +=2;//example = example + 2;		 
		 System.out.println(example+" +=");
		 example -=2;
		 System.out.println(example+" -=");
		 example *=12;
		 System.out.println(example+" *=");
		 example /=3;
		 System.out.println(example+" /=");
		 example %=3; //the result is a remainder of divide example/3;
		 System.out.println(example+" %=");
		 
		 
//OPERATOR PRECEDENCE - PIERWSZEŃSTWO DZIAŁAŃ
		 
		 int c = 10;
		 int d = 20;
		 int e = 30;
		 
		 double result = c - c * d + e + c * e/2;
		 System.out.println(result);
		 result = c - c * d + (e + c) * e/2;
		 System.out.println(result);
		 result = (c - c) * d + (e + c) * e/2;
		 System.out.println(result);
		 
//Exercise 1.
		 /*
		  * 1. Write a line comment.
		  * 2. Write a block comment.
		  * 3. Declare an int variable myInt and initialize it to 1.
		  * 4. Declare a double variable myDouble and initialize it to 1.5.
		  * 5. Declare three char variables in one line:
		  *    mychar1, myChar2, myChar3. Initialize myChar1 and myChar3 to '1' and 'b' respectively.
		  * 6. Print out the sum of myInt and myDouble.
		  * 7. Compare myInt to 10. Is it greater, lesser or equal? Print out all results.
		  * 8. Add myInt to myChar1. Print out the result. 
		  * How would you explain the result?
		  */
		 
		 //Ad. 3.
		 int myInt = 1;
		 //Ad. 4.
		 double myDouble = 1.5;
		 //Ad. 5.
		 char myChar1 = '1', myChar2, myChar3 = 'b';
		 //Ad. 6.
		 System.out.println("Sum of myInt and myDouble is "+(myInt+myDouble));
		 
		 /*
		  * Writing sum without brackets leads to CONCATENATION like Strings/chars!
		  * System.out.println("myInt + myDouble = "+myInt+myDouble);
		  * RESULT IS 11.5 (1 1.5)
		  */
		 
		 //Ad. 7.
		 boolean compare = myInt>10;
		 System.out.println(myInt+" > 10 is "+compare);
		 compare = myInt<10;
		 System.out.println(myInt+" < 10 is "+compare);
		 compare = myInt==10;
		 System.out.println(myInt+" = 10 is "+compare);
		 
		 //The simplest way:
		 System.out.println("myInt > 10 = "+(myInt>10));
		 System.out.println("myInt < 10 = "+(myInt<10));
		 System.out.println("myInt == 10 = "+(myInt==10));

		 
		 
		 //Ad. 8.
		 
		 System.out.println("myInt + myChar1 = "+(myInt+myChar1));
		 //Result is 50 cause char '1' in ASCII Table has integer value = 49.

	}

}
