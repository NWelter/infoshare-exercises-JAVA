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
        machine.showInfo();;
        person.showInfo();

        //we can add reference to any object, which implements interface Info:
        Info info = person;
        Info info2 = new Machine(12);
        info.showInfo();
        info2.showInfo();





    }
}
