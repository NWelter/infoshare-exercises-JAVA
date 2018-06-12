package override;

public class Car extends Vehicle {

    //call constructor from super class (Vehicle)

    public Car() {
        super();
    }


    public void startEngine() {
        super.startEngine();
        System.out.println("Force driver to fasten seat belts.");
    }
}
