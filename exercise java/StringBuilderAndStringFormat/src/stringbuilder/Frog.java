package stringbuilder;

public class Frog {

    private String name;
    private int id;

    public Frog (String name, int id) {

        this.name = name;
        this.id = id;
        System.out.println("I am Frog constructor");
    }

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(name).append(", ID: ").append(id);

        return stringBuilder.toString();
    }
}
