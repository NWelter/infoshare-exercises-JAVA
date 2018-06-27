package machines;

public class Camera extends Machine {

    public Camera(int id) {
        super(id);
    }

    @Override
    public void start (){

        System.out.println("Camera started.");
    }

    public void snap(){
        System.out.println("Photo taken.");
    }
}
