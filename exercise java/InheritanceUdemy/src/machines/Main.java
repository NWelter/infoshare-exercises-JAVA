package machines;

public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine(6);

        machine.start();
        machine.stop();

        Car car = new Car(19);
        car.start();
        car.wipeWindshield();
        car.stop();

        Person person = new Person("John");
        person.greed();
        machine.showInfo();
        ;
        person.showInfo();

        //we can add reference to any object, which implements interface Info:
        Info info = person;
        Info info2 = new Machine(12);
        info.showInfo();
        info2.showInfo();

        //exercises about down- and upcasting

        machine.start();
        Camera camera = new Camera(12);
        camera.start();
        camera.snap();

        //1. UPCASTING:

        Machine machine2 = new Camera(11); //polymorphism
        Machine machine3 = camera; //upcasted Camera class to Machine class (level up)
        machine3.start(); //run method corresponded with Camera class
        // error: machine3.snap(); cause .snap(); is not available to object machine3

        //2. DOWNCASTING (resolves the problem above)

        Machine machine4 = new Camera(10);
        Camera camera1 = (Camera) machine4;
        camera1.start();
        camera1.snap();

        //Doesn't work -- RUNTIME ERROR:

        /*
        Exception in thread "main" java.lang.ClassCastException:
        machines.Machine cannot be cast to machines.Camera at machines
         */

        Machine machine5 = new Machine(8);
        Camera camera2 = (Camera) machine5;
        camera2.start();
        camera2.snap();


    }
}
