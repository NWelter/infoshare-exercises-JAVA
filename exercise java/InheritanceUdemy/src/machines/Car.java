package machines;

public class Car extends Machine {

    public Car(int id) {
        super(id);
    }

    @Override
    public void start() {
        System.out.println("Car started.");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    public void wipeWindshield (){
        System.out.println("Wiping windshield.");

    }
}
