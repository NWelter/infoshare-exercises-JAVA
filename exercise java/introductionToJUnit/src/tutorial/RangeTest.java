package tutorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/*
!!! Create Test classes in 'src' directory is NOT GOOD PRACTICE!!!
Don't do that!
You should creating new, separate directory ex. 'test'.
 */




public class RangeTest {

    //create private instance
    private Range range;

    //annotation @Before to create method which initialize instance before all test units:
    @Before

    public void setUp(){
        range = new Range (10, 20);
    }


    @Test

    public void is15inRange(){

        Assert.assertTrue(range.isInRange(15));
    }

    public void is5inThisRange(){
        Assert.assertFalse(range.isInRange(5));
    }


    //test if exception will be thrown for constructor with wrong arguments
    @Test (expected = IllegalArgumentException.class)
    public void shouldThrownExceptionWithWrongArguments (){
        new Range (20,10);

    }


    //another way to test instance with wrong arguments:
    @Test
    public void shouldIdHaveProperErrorMessage(){
        try {
            //instance with wrong arguments
            new Range(20,10);

            //static method Assert.fail(); - fail test when exception won't be thrown
            fail("Exception wasn't thrown!");
        }
        catch (IllegalArgumentException exception){

            //assertEquals (String, String from IllegalArgumentException message)
            assertEquals("lowerBound is bigger than upperBound!", exception.getMessage());
        }

    }
}