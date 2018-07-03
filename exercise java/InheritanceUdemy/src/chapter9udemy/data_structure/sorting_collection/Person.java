package chapter9udemy.data_structure.sorting_collection;

public class Person implements Comparable<Person> {
    private String name;
    public Person(String name){
        this.name =name;
    }
    @Override
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(Person o) {

//        return name.compareTo(o.name);

        //reverse alphabetical order is possible with '-' sign:
//        return  -name.compareTo(o.name);

        //or we could compare and sort by length of String name:

        int length1 = name.length();
        int length2 = o.name.length();

        if (length1>length2){
            return 1;
        }
        if (length1<length2){
            return -1;
        }
        else
            //IMPORTANT! if we leave 'return 0' then method will not show name with the same length as compared to
            //this line of code below sorts names with the same length alphabetical
            return name.compareTo(o.name);

    }
}
