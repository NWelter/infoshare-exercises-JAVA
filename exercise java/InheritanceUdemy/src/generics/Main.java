package generics;

import machines.Camera;
import machines.Car;
import machines.Machine;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //I. ARRAY LIST

        ////Before Java 5 (without generic type) ////

        ArrayList list = new ArrayList();
        list.add("banana");
        list.add("apple");
        list.add("kiwi");
        //we must downcast cause method .get() is from Object class
        String fruit = (String) list.get(1);//index starts from 0
        System.out.println(fruit);//"apple"

        ////Modern style - parametrised classes (generic classes)////

        ArrayList<String> listGeneric = new ArrayList<>();//<--from Java 7 we don't need repeat type of parameter in brackets
        listGeneric.add("dog");
        listGeneric.add("hamster");
        listGeneric.add("fish");
        //now we don't need to downcast cause we declared type of parameter in diamond/angle brackets <>
        String animal = listGeneric.get(2);
        System.out.println(animal);

        //When we need to declare more than one type of argument:

        HashMap<Integer, String> hashMap = new HashMap<>();

        ////ArrayList with Wildcards ////

        //A. simply list with String class parameter:

        ArrayList<String> listString = new ArrayList<>();
        listString.add("first string");
        listString.add("second string");
        listString.add("Another");
        //call static method showList();
        System.out.println("Show list of strings:");
        showList(listString);

        //B. list with Machine class parameter:
        ArrayList<Machine> listMachine = new ArrayList<>();
        System.out.println("Show list of machines:");
        listMachine.add(new Machine(5));
        listMachine.add(new Machine(7));
        showMachineList(listMachine);

        //C. List with subclasses/child classes - we use wildcard ('?' -unknown type):
        ArrayList<Camera> listCamera = new ArrayList<Camera>();
        System.out.println("Show list of cameras");
        listCamera.add(new Camera(1));
        listCamera.add(new Camera(11));
        showCameraList(listCamera);
        System.out.println("We could use showCameraList() method for Machine class:");
        showCameraList(listMachine);
        System.out.println("...and for String list:");
        showCameraList(listString);

        //D. We could UPPER BOUNDED WILDCARD -see method below (nr 4.)
        ArrayList<Machine> listUpperBounded = new ArrayList<>();
        System.out.println("We could use showUpperBoundedList() method for all Machine's extend classes:");
        listUpperBounded.add(new Machine(1));
        listUpperBounded.add(new Camera(4));
        listUpperBounded.add(new Car(15));
        showUpperBoundedList(listUpperBounded);


    }

    //1.method for String list:
    public static void showList(ArrayList<String> list) {
        //for each loop:
        for (String value : list) {
            System.out.println(value);
        }

    }
    //2.method for Machine list:

    public static void showMachineList(ArrayList<Machine> list) {
        //for each loop:
        for (Machine value : list) {
            System.out.println(value);
        }
    }
    //3.method for Camera subclasses list:
    public static void showCameraList (ArrayList<?> list){
        //we must change 'Machine' to 'Object' now, cause it's parent class for all objects
//        for (Machine value:list){
        for(Object value:list){
            System.out.println(value);
        }
    }
    //4.method with upper bounded wildcard - this method works for Machine class and all subclasses
    public static void showUpperBoundedList (ArrayList<? extends Machine>list){
        for (Machine value:list){
            System.out.println(value);
        }
    }
    /*
    For example we have 3 lists classes: <Integer>, <Double> and <Number>.
    When we declare <? extends Number> in method -it will work for Number, Integer and Double objects.
    Form <Number> only is more restrictive and works ONLY for Number.
     */
}
