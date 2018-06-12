package override;

public class Vehicle {

    //fields
    protected final int tankCapacity = 60;
    protected int fuelLevel = tankCapacity;
    private  int numberOfWheels;
    private String model;

    //constructors

    public Vehicle (){

    }
    public Vehicle (int numberOfWheels, String model){

        this.numberOfWheels = numberOfWheels;
        this.model = model;

    }



    public void startEngine() {
        System.out.println("Engine starts. Brum brum brum.");
    }


    //METHOD OVERLOADING:

    public void fillTank() {

        //Method first calculates how many litres can tank:

        int toFill = tankCapacity - fuelLevel;

        //...then call second version of method fillTank(); and gives an argument to it:

        fillTank(toFill);

    }

    public void fillTank(int toFill) {

        if (fuelLevel + toFill > tankCapacity)
            System.out.println("I can't fill tank with " + toFill + " litres");
        else {
            fuelLevel += toFill;
            System.out.println("I've filled tank with " + toFill + " litres");
        }

    }
}
