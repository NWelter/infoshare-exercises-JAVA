package staticmethod;

public class MainClass {
    public static void main(String[] args) {

        //static field is use for whole class, not for instance of class:
        Thing.description = "I am an one thing";

        Thing.showInfo();

        System.out.println("Before creating objects count is: "+Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects count is: "+Thing.count);

        thing1.name = "Bob";
        thing2.name = "Jane";
        thing1.showName();
        thing2.showName();

        //example of static method and final variable:
        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
