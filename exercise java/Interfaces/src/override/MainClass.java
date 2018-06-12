package override;

public class MainClass {
    public static void main(String[] args) {

        Car car = new Car();
        Vehicle vehicle = new Vehicle();
        SUV suv = new SUV();
        System.out.println("instance of Vehicle:");
        vehicle.startEngine();
        System.out.println("instance of Car:");
        car.startEngine();
        System.out.println("instance of SUV:");
        suv.startEngine();


    }
}
