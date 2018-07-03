package chapter9udemy.data_structure.sorting_collection;

public class ObjectToSort {
    private int id;
    private String name;

    public ObjectToSort(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " name: " + name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
