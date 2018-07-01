package chapter9udemy.data_structure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ////I. ARRAY LIST ////
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
        System.out.println("Does list contain a value 121? " + listInteger.contains(121) + "\n");

        //remove elements from list - method remove(), can take different parameters (method overloading)-index or value:
        listInteger.remove(1);
        /*
        PROBLEM: When we put an int in parameter, then it's interpreting as index of value which will be remove.
        But what if we want remove a current value (ex. 121)?
        We must make cast to object class (Integer) - see an example below:
         */
        listInteger.remove((Integer) 121);
        for (Integer value : listInteger) {
            System.out.print(value + " ");

        }
        //find if element is present in arraylist with method contain(searching value)-return boolean value;
        System.out.println("\nDoes list contain a value 121?: " + listInteger.contains(121) + "\n");
        //find index of searching element in arraylist:
        System.out.println("Index of 17 is: " + listInteger.indexOf(17));

        //we can combine this methods together to remove an element without casting to Integer:
        listInteger.remove(listInteger.indexOf(5));

        //// II. ITERATORS ////

        /*
        There are a couple of Iterator's methods common for all data structures:
        1. hasNext(); -return boolean value if there is a next element (T) or not (F) in a data container,
        2. next(); - return next element of collection - if next element not exist, then method throws an Exception,
        3. remove(); - remove an element from collection,
        4. iterator(); - return iterator which points to the first element found inside a data container
        5. isEmpty(); - return boolean value - true if the container is empty, false otherwise;
        6. clear(); - remove all elements from the collection
         */
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        //fill list with simply 'for i' loop:
        for (int i = 0; i < 6; i++) {
            integerArrayList.add(i);
        }

        //print out this elements using methods from Iterator class:
        System.out.println("\nPrint elements of the integerArrayList: ");

        for (Iterator<Integer> i = integerArrayList.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }
        /*
        Explain a code above:
        - Iterator <Integer>: cause we use an object type (Iterator) not primitive (int), from list of Integer
        - method iterator() starts with first element found in integerArrayList (it's similar to initialise i=0)
        - i.hasNext() - boolean condition, loop works until value of hasNext() is true
        - iterator i++ is not necessary, cause we use method i.next() to search (and print) next element of the list
         */

        System.out.println("\nAfter clear the list:");

        integerArrayList.clear();

        if (integerArrayList.isEmpty()) {
            System.out.println("List is empty!");
        } else {
            for (Iterator<Integer> i = integerArrayList.iterator(); i.hasNext(); ) {
                System.out.print(i.next() + " ");
            }
        }

        ////III. LINKED LISTS ////

        /*
        It's similar to Array List.
        Main differences:
        - Linked List handles the duplicate elements
        - We could add some elements both at the end and front of list as well
        - Linked List has own methods for add/remove elements from the front and the end of list:
        --- addFirst();/removeFirst();
        --- addLast();/removeLast();
        - uses more memory than Array List

        ? How it works?
        We have element (stored in RAM memory address)
        and pointers, which point to the next elements from the linked list:

        e-element
        p-pointer

        RAM
        [e1 p1] [**some other stuff**][***][e2 p2][***][e3 p3]
        p1 points to the memory address of element2
        p2 points to the memory location of element3

        In traditional array it's look like this:
        RAM
        [e1][e2][e3][e4]
        (+) it is faster and uses less memory
        (-) we cannot dynamically grow this array! we must declare a size of traditional array in advance!
         */

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("Hello there! ");
        stringLinkedList.add("How is it going? ");
        stringLinkedList.add("Keep it smile! ");
        stringLinkedList.add("Good luck!");
        System.out.println("\nPrint out my Linked List:");
        System.out.println(stringLinkedList);
        //adding elements to the front/end of list:
        stringLinkedList.addFirst("I add something to the front of list");
        stringLinkedList.addLast("I add something to the end of list");
        System.out.println(stringLinkedList);
        //adding elements to the specific position on list (int index, String element):
        stringLinkedList.add(3, "I jump to the position of index 3");
        System.out.println(stringLinkedList);
        stringLinkedList.add(1, "New, fresh begin");
        stringLinkedList.removeFirst();
        System.out.println(stringLinkedList);
        System.out.println(stringLinkedList.getFirst());
        System.out.println("Print out elements, which contain word 'it': ");

        for (String element : stringLinkedList) {
            if (element.contains(" it ")) {
                System.out.println(element);
            }
        }

        if (stringLinkedList.contains("Good luck!")) {
            System.out.println("It's lucky list.");
        }

        //get index of element:
        System.out.println(stringLinkedList.indexOf("How is it going? "));
        //change element:
        stringLinkedList.set(2,"Bad luck!");
        System.out.println(stringLinkedList.get(2));


    }
}
