package chapter9udemy.data_structure.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
        1.HashMap
        2.TreeMap
        3.LinkedHashMap

         */

        Map<Integer, String> postalCode = new HashMap<>();

        //we have some new methods in Map collections e.g. put():

        postalCode.put(37300, "Leżajsk");
        postalCode.put(20560, "Lublin");
        postalCode.put(20704, "Lublin");
        postalCode.put(37310, "Nowa Sarzyna");
        postalCode.put(90210, "Beverly Hills");
        postalCode.put(20632, "Lublin");

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



    }
}
