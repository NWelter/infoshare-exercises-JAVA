package chapter9udemy.data_structure.sets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ////I. SETS ////
        /*
        - They cannot contain duplicate items (see example below).
        - Sets have most methods like Lists, only duplication is prohibited.
        - Two sets are equals when contain the same elements.
        - We have 3 kinds of Set:
        A. HashSet
        B. LinkedHashSet - elements are sorted in order you added them in
        C. TreeSet -sort in natural order
         */

        ////A. HashSet ////

        LinkedList<String> stringLinkedList = new LinkedList<>();
        stringLinkedList.add("red");
        stringLinkedList.add("blue");
        stringLinkedList.add("red");
        stringLinkedList.add("red");
        stringLinkedList.add("black");
        stringLinkedList.add("black");
        stringLinkedList.add("green");
        stringLinkedList.add("yellow");
        stringLinkedList.add("violet");

        System.out.println("Elements in LinkedList: ");
        for (String element : stringLinkedList)
            System.out.print(element + " ");

        System.out.println("\n\nThe same elements add on HashSet: ");

        Set<String> stringHashSet = new HashSet<>(stringLinkedList);

        //!IMPORTANT!
        // put our linkedList as parameter on HashSet's constructor is an easier way than adding the same elements separately:
//        stringHashSet.add("red");
//        stringHashSet.add("blue");
//        stringHashSet.add("red");
//        stringHashSet.add("red");
//        stringHashSet.add("black");
//        stringHashSet.add("black");
        for (String element : stringHashSet)
            System.out.print(element + " ");
        //in HashSet duplicate values are truncated(they gone):
        System.out.println("\n\nSize of HashSet is: " + stringHashSet.size());
        System.out.println("\nAdd new element to the HashSet:");
        stringHashSet.add("green");
        for (String element : stringHashSet)
            System.out.print(element + " ");
        System.out.println("\n\nSize of HashSet is: " + stringHashSet.size());
        //Elements are stored in hash table and aren't adding at the end of HashSet (an order depends on item's hash value)

        if (!stringHashSet.isEmpty()) {
            if (stringHashSet.contains("black"))
                stringHashSet.remove("black");
        }
        System.out.println("\nDoes HashSet contains string 'black'? " + stringHashSet.contains("black"));

        //Find out what is a hash code value of current element (we need methods from Iterator class):
        Iterator setIterator = stringHashSet.iterator();
        System.out.println("\nHashCode values of elements in HashSet: ");
        while (setIterator.hasNext())
            System.out.print(setIterator.next().hashCode() + " ");

        //clear hashSet:
        stringHashSet.clear();
        System.out.println("\nIs current hashSet empty? " + stringHashSet.isEmpty());

        ////B. LinkedHashSet ////

        Set<String> stringLinkedHashSet = new LinkedHashSet<>(stringLinkedList);
        System.out.println("\nElements of LinkedHashSet (added from stringLinkedList): \n" + stringLinkedHashSet);

        ////C. TreeSet ////
        Set<String> stringTreeSet = new TreeSet<>(stringLinkedList);
        System.out.println("\nElements of TreeSet (added from stringLinkedList): \n" + stringTreeSet);
        stringTreeSet.add("pink");
        stringTreeSet.add("brown");
        System.out.println("\nElements of TreeSet now: \n" + stringTreeSet);


        ////////INTERSECTION -we compare something in common////////

        //create new collection with items from LinkedList:
        Set<String> intersectionSet = new HashSet<>(stringTreeSet);
        System.out.println("\nElements of intersectionSet (add from stringTreeSet): \n" + intersectionSet);

        //method retainAll(compare collection) remove elements that are not contained in specified collection
        //only items that are in common are saved:
        intersectionSet.retainAll(stringLinkedList);
        System.out.println("\nElements of intersectionSet after method retainAll(stringLinkedList): \n" + intersectionSet);

        /////////DIFFERENCES /////////
        Set<String> differenceSet = new HashSet<>(stringTreeSet);
        //method removeAll(compare collection) - save only items that are unique in compare collections:
        differenceSet.removeAll(stringLinkedList);
        System.out.println("\nElements of differenceSet after method removeAll(stringLinkedList): \n" + differenceSet);


    }
}
