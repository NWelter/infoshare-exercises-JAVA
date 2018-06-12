public class MainClass {

    public static void main(String[] args) {

        //create Oven object with different interfaces

        Oven oven = new Oven();
        BackingOven backingOven = oven;
        RoastingOven roastingOven = oven;

        backingOven.bakeBread();
        backingOven.bakeCookies();

        roastingOven.roastChicken();



    }
}
