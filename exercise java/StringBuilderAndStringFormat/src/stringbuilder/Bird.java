package stringbuilder;

public class Bird  {
    private String name;
    private int id;


    public Bird (String name, int id){
       this.name = name;
       this.id = id;
    }

    @Override
    public String toString(){

        return String.format("%-4d: %s", id, name);

    }
}
