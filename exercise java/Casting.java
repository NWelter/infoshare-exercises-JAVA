public class Casting {
    public static void main(String[] args) {

    	int a = Integer.MAX_VALUE; 
    	//the max value of int = 2147483647:
        System.out.println(a);
        long c = a+1;
        //what will be print when we try to overflow int?
        System.out.println(c); // = -2147483648
        //the result will not be what we expect! 
        c = (long) a + 1; //casting before operation - now result is correct: 2147483648
        System.out.println(c); 

        /*
        EXPLAIN:

        When arithmetic is performed on integers, the result will always be an integer. 
        You can assign that result to a long, double, or float with automatic type conversion, 
        but having started as an int or long, the result will likely not be what you expect.

		Instead, at least one operand should be cast 
		or promoted to the final type BEFORE the operation takes place.

        */

        long bigNegativeNumber = Integer.MIN_VALUE-1;
        System.out.println(bigNegativeNumber); //inappropriate value: positive 2147483647

        long bigNegativeNumberCast = Integer.MIN_VALUE-1L; 
        System.out.println(bigNegativeNumberCast); //appropriate value: -2147483649


        /*
        CLASS CASTING
        if we have superclass Animal and subclass Cat (with own method meow()).
        If we want use a variable of type Animal to invoke a method available only to Cat class
        we use downcasting: CASTING FROM A SUPERCLASS TO A SUBCLASS:

        Animal animal = new Cat();
        We know that animal variable refers to the instance of Cat.
         And we want to invoke Cat’s meow() method on the animal. 
         But the compiler complains that meow() method doesn’t exist for the type Animal.

        To call meow() we should downcast animal to Cat:
        ((Cat) animal).meow(); -> cast operator


       */

    }
}
