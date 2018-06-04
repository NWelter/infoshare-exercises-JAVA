package staticmethod;

public class Thing {
    //fields

    String name;
    static String description;
    int id;

    //final variable must be initialize:
    static final int LUCKY_NUMBER = 7;

    //static variable:
    static int count;

    //constructor with static parameters:

    Thing() {

        id = count;
        count++; //any instance of class will have different number when constructor will be call
        //It's a good way to assign an unique ID to all objects
    }

    //methods:

    //1.non-static
    public void showName() {
        //in non-static method we can use static fields
        System.out.println("Object id: "+id+"\t"+description + ": " + name);
    }

    //static
    public static void showInfo() {
        //in static method we CAN'T use non-static fields!
        System.out.println(description);

        //won't work: sout(name) cause variable 'name' is not static!

    }
}
