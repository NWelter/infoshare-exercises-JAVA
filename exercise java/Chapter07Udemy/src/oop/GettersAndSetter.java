package oop;

public class GettersAndSetter {


    /*  GETTERS AND SETTERS:
     *
     * They are methods which have access to private variables
     * (see private double num1, num2;)
     * and can get/set(change) a value of method.
     *
     * Nomenclature:
     * 1. getters methods start with 'get', they're THE SAME TYPE as variables.
     * 2. setters method start with 'set', they're void types with parameter value.
     */
    //FIELDS:
    private double num1, num2;

    //CONSTRUCTORS:



    //We MUST create default constructor IF we create another, custom one.

    //We can also call constructor inside* another one, with key word 'this' (see an example below)

    //*BE CAREFUL to don't create recursive loop (java error: recursive constructor invocation)

    //default
    public GettersAndSetter() {


    }

    //custom 1.
    public GettersAndSetter(double param1) {
        //call default constructor inside, it must be at the bottom:

        this ();

        num1 = param1;
    }

    //custom 2. - with key word 'this'
    public GettersAndSetter(double num1, double num2) {

        this(3.4); //call constructor custom 1.
        this.num1 = num1;
        this.num2 = num2;

    }

    //METHODS:

    //getters and setters MUST BE PUBLIC.
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum1(double a) {

        num1 = a;

    }

    /*
     * We can use 'a' cause it's only a local method's variable.
     * Parameter value must be the same type as in class field.
     */

    public void setNum2(double a) {

        num2 = a;
    }

}
