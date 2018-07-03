package chapter9udemy.data_structure.maps;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ///////MAPS ////////
        /*

        Maps need 2 things:
        1 - key
        2 - value
        !!! PRIMARY RULE !!!
        The key cannot be duplicated!
        We have 3 kinds of Map:
        1.HashMap - ordered by item's hashcode
        2.TreeMap - sorted keys by natural order (like alphabetical for string)
        3.LinkedHashMap - the same order like we put any element into the map

         */

        Map<Integer, String> postalCode = new HashMap<>();

        //we have some new methods in Map collections e.g. put():

        postalCode.put(37300, "Leżajsk");
        postalCode.put(20560, "Lublin");
        postalCode.put(20704, "Lublin");
        postalCode.put(37310, "Nowa Sarzyna");
        postalCode.put(90210, "Beverly Hills");
        postalCode.put(20632, "Lublin");
        postalCode.put(70213, "Konin");
        postalCode.put(10321, "Warszawa");

        //a key must be unique - when we use method put() for existing key, then old value will be replace with a new:
        postalCode.put(20632, "lublin");

        System.out.println(postalCode);
        System.out.println("Size of Map: "+postalCode.size());

        //methods containsKey(key)/containsValue(value)-boolean and get(key) to get value that is connected with key:

        if(postalCode.containsKey(37300))
            System.out.println("Key is 37300 and value is: "+postalCode.get(37300));

        if(postalCode.containsValue("Lublin"))
            //print out all values in postalCode:
            System.out.println(postalCode.values());
            //we can use for each loop to print all value items separately:
        System.out.println("\nPrint out values separately:");
        Collection<String> valueOfPostalCodes = postalCode.values();
        for (String value:valueOfPostalCodes){
            System.out.println(value);
        }
        //method remove(key) removes items form the map:

        postalCode.remove(20632);
        System.out.println(postalCode);

        //method remove() is overloaded and can take 2 parameters - (key, value).
        //Then remove elements ONLY IF a pair is correct!
        //The element below will be removed:
        postalCode.remove(37300, "Leżajsk");
        System.out.println(postalCode);
        //but this will not:
        postalCode.remove(37310, "sarzyna");
        System.out.println(postalCode);

        //We can also retrieve all keys stored in Map with method keySet():
        //We create a new variable from Set collection, which will store keys values:

        Set<Integer> setOfKeysValues = postalCode.keySet();
        System.out.println("\nAll keys values stored in postalCode: ");
        for (Integer keyValues: setOfKeysValues){
            System.out.print("\nPostal code "+keyValues+" is for "+postalCode.get(keyValues)+" ");
        }

        //we can add new values only if they don't exist: method putIfAbsent();
        postalCode.putIfAbsent(37300, "Leżajsk");
        postalCode.putIfAbsent(37310, "Nowa Sarzyna");//this will not be added, cause already exist
        System.out.println("\n"+postalCode);

        //we can replace value of current key with replace() method
        //method replace () is overloaded -takes 2 or 3 parameters:
        postalCode.replace(20704, "Łęczna");
        postalCode.replace(20560, "Lublin", "lublin");
        System.out.println(postalCode);

        ////// VERY USEFUL WAY TO PRINT OUT PAIRS OF KEYS AND VALUES ///////

        //we can iterate over Map thanks method (entrySet()) and interface Map.Entry - is a key and value combined into one class:
        System.out.println("\nKey and value of postal codes in HashMap with interface Map.Entry:");

        for (Map.Entry<Integer, String> entry : postalCode.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+": "+value);
        }

        //LinkedHashMap prints out elements in the same order they were put into Map.

        Map <Integer, String> postalCodeLinkedHashMap = new LinkedHashMap<>();
        
        postalCodeLinkedHashMap.put(37300, "Leżajsk");
        postalCodeLinkedHashMap.put(20560, "Lublin");
        postalCodeLinkedHashMap.put(20704, "Lublin");
        postalCodeLinkedHashMap.put(37310, "Nowa Sarzyna");
        postalCodeLinkedHashMap.put(90210, "Beverly Hills");
        postalCodeLinkedHashMap.put(20632, "Lublin");
        postalCodeLinkedHashMap.put(70213, "Konin");
        postalCodeLinkedHashMap.put(10321, "Warszawa");
        System.out.println("\nKey and value of postal codes in LinkedHashMap with interface Map.Entry:");

        for (Map.Entry<Integer, String> entry : postalCodeLinkedHashMap.entrySet()){
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+": "+value);
        }

        //compare ordering elements in different types of Map (method was created below):

        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("\nOrder of HashMap:");
        testMap(hashMap);
        System.out.println("\nOrder of LinkedHashMap:");
        testMap(linkedHashMap);
        System.out.println("\nOrder of TreeMap:");
        testMap(treeMap);


    }

    public static void testMap (Map <Integer, String> map){
        map.put(1, "Welter");
        map.put(221, "Kierepka");
        map.put(3, "Karwat");
        map.put(14, "Socha");
        map.put(5, "Król");
        map.put(69, "Welter");
        map.put(7, "Adamkiewicz");

        for (Integer key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+": "+value);
        }

        //second way:

//        for (Map.Entry<Integer, String> entry : map.entrySet()){
//            int key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+": "+value);
//        }
    }
}
