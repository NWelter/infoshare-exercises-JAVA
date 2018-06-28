package machines;

public class Machine implements Info{

    private int id;
    public Machine (int id){
        this.id =id;
        System.out.println("I am Machine constructor!");
    }

    public void start (){

        System.out.println("Machine started.");
    }

    public void stop (){
        System.out.println("Machine stopped.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: "+id);
    }

    @Override
    public String toString() {
        return "I am a machine!";
    }
}
