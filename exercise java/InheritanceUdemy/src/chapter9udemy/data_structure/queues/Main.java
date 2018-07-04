package chapter9udemy.data_structure.queues;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        /*

        QUEUES (KOLEJKI) - FIFO (First In, First Out)
        Queues have 'head'- first element added and 'tail' - last element added.
        Specific methods:
        1. add(element)/or offer(element) - add element to the tail of queue(add() (may throws exceptions)
        2. element() - check (not removes) an element on head of the queue (may throws exceptions)
        3. peek() - similar to element() - show item current on head
        4. pool() -similar to remove()
        5. remove() - retrieve and remove first element from queue (head)(may throws exceptions)

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


        //BlockingQueue has own capacity:
        Queue<Integer> integers = new ArrayBlockingQueue<>(3);

        integers.add(3);
        integers.add(30);
        integers.add(37);
        //when we will put more items than is allowed (3), then method throws Exception(IllegalStateException: Queue full)
        //we use try-catch
        try {
            integers.add(3);
        } catch (IllegalStateException e) {
            //(we should use LOGGER better than sout)
            System.out.println("Tried to add more than 3 elements to the queue");
        }

        //when we will remove more items than are in queue, then method throws Exception (NoSuchElementException):
        integers.remove();
        integers.remove();
        integers.remove();

        try {
            integers.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Tried to remove more elements than are in queue");
        }
        //method element() throws now NoSuchElementException

        try {
            System.out.println("Head of queue is: "+integers.element());
        } catch (NoSuchElementException e) {

            System.out.println("Queue is empty");
        }
        //similar method peek() print out 'null' in this case:
        System.out.println(integers.peek());

        //Another type of queues is a Heap (sterta) - PriorityQueue

        Queue<Integer> heapIntegers = new PriorityQueue<>();
        heapIntegers.add(12);
        heapIntegers.add(120);
        heapIntegers.add(1);
        heapIntegers.add(-7);
        heapIntegers.add(2);
        heapIntegers.add(1223);
        heapIntegers.offer(56);

        //in heaps items are sorted by specified or default comparator

        for(Integer x:heapIntegers){
            System.out.println(x);
        }
        System.out.println(heapIntegers.element()+" "+heapIntegers.peek());

        while (!heapIntegers.isEmpty()){
            System.out.println(heapIntegers.poll());
        }


    }
}
