package machines;

public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine();

        machine.start();
        machine.stop();

        Car car = new Car();
        car.start();
        car.wipeWindshield();
        car.stop();



    }
}
