package chapter9udemy.data_structure.queues;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        /*

        QUEUES (KOLEJKI) - FIFO (First In, First Out)
        Queues have 'head'- first element added and 'tail' - last element added.
        Specific methods:
        1. add(element)/offer(element) - add element to the tail of queue
        2. element() - check (not removes) an element on head of the queue
        3. peek() - similar to element() - show item current on head
        4. pool() -similar to remove()
        5. remove() - retrieve and remove first element from queue (head)

         */

        Queue<String> names = new LinkedList<>();
        names.add("Adaś");
        names.add("Kaja");
        names.add("Olga");
        names.add("Damian");
        names.add("Karol");
        names.add("Barbara");
        names.offer("Andrzej");
        names.offer("Zbigniew");

        for (String name : names)
            System.out.println(name);
        System.out.println("Which element will be removed after .remove() method? " + names.remove());
        System.out.println("Which element will be removed now, after .poll() method? " + names.poll());
        System.out.println("Which element is now a first element (on queue's head) - method .peek()? " + names.peek());
        System.out.println("Which element is now a first element (on queue's head) - method .element()? " + names.element());


    }
}
