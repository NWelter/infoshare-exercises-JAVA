package chapter9udemy.data_structure.sorting_collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Methods to sort items in a collection:

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("snake");
        animals.add("bear");
        animals.add("dog");
        animals.add("fish");
        animals.add("camel");
        animals.add("giraffe");
        animals.add("elephant");
        animals.add("donkey");

        //method from class Collections to sort(list) by alphabetical (for String) order:
        Collections.sort(animals);

        for (String animal : animals) {
            System.out.println(animal);
        }

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(1);
        numbers.add(120);
        numbers.add(12);
        numbers.add(32);
        numbers.add(-89);
        numbers.add(1000);

        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }

//        if we need sort our String elements by string's length we can use an @Override method compare(String s1, String s2)
//        from created class StringLengthComparator which implements Comparator:

        System.out.println("After method which compare String length: ");
        Collections.sort(animals, new StringLengthComparator());
        for (String animal : animals) {
            System.out.println(animal);
        }

        //// SORTING INTEGER VALUES IN REVERSE ORDER WITH IMPLEMENTS AN ANONYMOUS CLASS////

        System.out.println("Print out elements from <Integer>ArrayList in reverse order(from the biggest number):");

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });
        for (int number : numbers) {
            System.out.println(number);
        }

        /////////SORTING OBJECTS//////////

        List<ObjectToSort> objectToSorts = new ArrayList<>();
        objectToSorts.add(new ObjectToSort(12, "Natalia"));
        objectToSorts.add(new ObjectToSort(1, "Adrian"));
        objectToSorts.add(new ObjectToSort(120, "Wojtek"));
        objectToSorts.add(new ObjectToSort(8, "Ilona"));

        //we can't use method Collections.sort() in a basic way, cause objects don't have 'natural order' implementation:

//        Collections.sort(objectToSorts);

        //we must add Comparator with own method implementation to compare objects e.g. by ID:

        Collections.sort(objectToSorts, new Comparator<ObjectToSort>() {
            @Override
            public int compare(ObjectToSort o1, ObjectToSort o2) {
//                int num1 = o1.getId();
//                int num2 = o2.getId();
//                if(num1>num2){
//                    return 1;
//                }
//                if(num1<num2){
//                    return -1;
//                }
                //better:
                if (o1.getId() > o2.getId()) {
                    return 1;
                }
                if (o1.getId() < o2.getId()) {
                    return -1;
                }
                return 0;
            }
        });

        for (ObjectToSort object : objectToSorts) {
            System.out.println(object);

        }

    }
}
