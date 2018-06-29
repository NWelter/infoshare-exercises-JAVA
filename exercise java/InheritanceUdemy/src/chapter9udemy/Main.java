package chapter9udemy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ARRAYLIST
        //A simply example of ArrayList:

        ArrayList<Integer> listInteger = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            listInteger.add(i);
        }
        System.out.println("The AraryList has: " + listInteger.size() + " elements");

        //we can change a value of list's element with method set(); (index of element, a new value of element):

        listInteger.set(6, 121);
        //we have now {0,1,2,3,4,5,121,7}

        //or we can use method add() with another parameters (index, value)/method overloading:

        listInteger.add(2, 17);
        /*
        Differences between add(index,value) and set(index,value):
        ADD - add new element to list with this index, prior element moves to next index,
        in case above we have now {0,1, 17, 2, 3, 4, 5, 121}
         */

        //we can get a value of element with method get(index of element);
        System.out.println("A value of element with index 6 is: " + listInteger.get(6) + "\n");
        System.out.println("For i loop: \n");
        for (int i = 0; i < 7; i++) {
            System.out.print(listInteger.get(i) + " ");
        }

        System.out.println("\n\nFor each: loop: \n");
        //or for each loop:
        for (int value : listInteger) {
            System.out.print(value + " ");

        }
        System.out.println("\n");
        System.out.println("Does list contain a value 121? "+listInteger.contains(121)+"\n");

        //remove elements from list - method remove(), can take different parameters (method overloading)-index or value:
        listInteger.remove(1);
        /*
        PROBLEM: When we put an int in parameter, then it's interpreting as index of value which will be remove.
        But what if we want remove a current value (ex. 121)?
        We must make cast to object class (Integer) - see an example below:
         */
        listInteger.remove((Integer) 121);
        for (Integer value:listInteger) {
            System.out.print(value+" ");

        }
        //find if element is present in arraylist with method contain(searching value)-return boolean value;
        System.out.println("\nDoes list contain a value 121?: "+listInteger.contains(121)+"\n");
        //find index of searching element in arraylist:
        System.out.println("Index of 17 is: "+listInteger.indexOf(17));

        //we can combine this methods together to remove an element without casting to Integer:
        listInteger.remove(listInteger.indexOf(5));

    }
}
