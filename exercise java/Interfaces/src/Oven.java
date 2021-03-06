public class Oven implements BackingOven, RoastingOven {

    private int temperature;
    private int time;

    //override interface's methods

    @Override

    //method from BackingOven interface
    public void bakeBread(){
        temperature = 200;
        time = 90;
        turnOn();

    }

    @Override

    //method from BackingOven interface
    public void bakeCookies(){
        temperature = 180;
        time = 45;
        turnOn();
    }

    @Override

    //method from RoastingOven interface
    public void roastChicken(){
        temperature = 190;
        time = 120;
        turnOn();
    }

    private void turnOn(){

        System.out.println(String.format("Start. Heat up to %s and work for %d minutes", temperature, time));
    }


}
