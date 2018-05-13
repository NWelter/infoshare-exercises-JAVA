package dataStructures;

import java.util.*;


public class MainClass {
    public static void main(String[] args) {

    // I. KOLEJKA

        //tworzenie kolejki typu String

        Queue <String> kolejka = new ArrayDeque<String>();

        //dodawanie elementu do kolejki:
        kolejka.add("jeden");

        //usuwanie elementu kolejki:
        kolejka.remove("jeden");

        kolejka.add("dwieście");
        kolejka.add("jeden");

        String s1 = kolejka.element();
        String s2 =  kolejka.peek();

        System.out.println(s1);
        System.out.println(s2);

        kolejka.add("osiem");
        kolejka.add("siedem");

        int i1 = kolejka.size();

        System.out.println("Rozmiar kolejki: "+i1);

        System.out.println(kolejka);

        boolean b = kolejka.isEmpty();

        System.out.println("czy jest pusta?: "+b);

        kolejka.remove();
        kolejka.remove();
        i1 = kolejka.size();
        System.out.println("Rozmiar kolejki po usuwaniu: "+i1);

        s1 = kolejka.element();
        System.out.println("ostatni element kolejki to: "+s1);
        kolejka.remove();
        kolejka.remove();
        s1 = kolejka.peek();
        System.out.println("ostatni element kolejki po usunięciu dwóch elementów to: "+s1);
        b = kolejka.isEmpty();
        System.out.println("czy jest pusta?: "+b);


     // II. LISTA

        List <String> lista = new ArrayList<String>();

        lista.add("jeden");
        lista.add("dwa");
        lista.add("trzy");
        lista.add("Monika");
        lista.add("cztery");
        lista.add("Andrzej");
        lista.add("Kasia");


        String elementListy = lista.get(0);

        String elementListy2 = lista.get(2);
        System.out.println("\n Nowa lista: "+lista);

        System.out.println(elementListy+", "+elementListy2);
        int listSize = lista.size();
        System.out.println("Rozmiar listy to: "+listSize);

        boolean pusta = lista.isEmpty();
        System.out.println("Czy lista jest pusta? "+pusta);

        //wyswietlanie elementow listy - podejscie tablicowe:

        for (int i = 0; i <lista.size(); i++) {
            System.out.println(lista.get(i));

        }

        //drugie podejscie - pętla for-each:

        System.out.println();

        for (String elem: lista){
            System.out.println(elem);
        }

     // III. ZBIORY

        //HashSet
        Set <String> zbior = new HashSet<String>();

        zbior.add("Dwa");
        zbior.add("Marysia");
        zbior.add("Gąska");
        zbior.add("Bogusia");
        zbior.add("Kuba");
        zbior.add("Bogusia");


        System.out.println();

        for (String elem: zbior)
            System.out.println(elem);

        //TreeSet - sortuje wyniki rosnąco wg tablicy ASCII
        Set<Integer> zbior2 = new TreeSet<Integer>();

        zbior2.add(1);
        zbior2.add(8);
        zbior2.add(6);
        zbior2.add(3);
        zbior2.add(2);
        zbior2.add(8);
        zbior2.add(7);
        zbior2.add(6);
        zbior2.add(6);

        int rozmiar = zbior2.size();
        System.out.println("Rozmiar TreeSet: "+rozmiar);

        //  pętla for each:

        for (int elem: zbior2)
            System.out.println(elem);

        System.out.println();


        //wyswietlanie zwykłą pętlą for:
        Iterator <Integer> iterator = zbior2.iterator();
        for (int i = 0; i <zbior2.size(); i++) {
            System.out.println(iterator.next());


        }

     // IV. MAPA

        Map <Integer, String> map = new HashMap<Integer, String>();

        //dodawanie elementów:

        map.put(1, "Natalia");
        map.put(2, "Ilona");
        map.put(3, "Waldemar");

        String element = map.get(2);

        int ile = map.size();

        System.out.println("\n Elementy mapy: "+map);

        boolean pustaMapa = map.isEmpty();
        System.out.println("Czy jest pusta: "+pustaMapa);

        boolean kluczMapy = map.containsKey(2);
        System.out.println("Czy ma klucz '1'? "+kluczMapy);

        boolean wartoscMapy = map.containsValue("Kasia");
        System.out.println("Czy ma wartość 'Kasia'? "+wartoscMapy);

        //nadpisanie wartosci o kluczu 1:

        map.put(1, "Kasia");
        System.out.println(map);

        wartoscMapy = map.containsValue("Kasia");
        System.out.println("Czy ma wartość 'Kasia'? "+wartoscMapy);

        //TreeMap - zadanie:

        Map <String, Integer> mapOceny = new TreeMap<String, Integer>();

        mapOceny.put("niedostateczny", 1);
        mapOceny.put("dopuszczający", 2);
        mapOceny.put("dostateczny", 3);
        mapOceny.put("dobry", 4);
        mapOceny.put("bardzo dobry", 5);
        mapOceny.put("celujący", 6);


        Scanner in = new Scanner (System.in);

        System.out.println("Jaką ocenę chcesz wyświetlić (słownie)?: ");
        String podaj = in.nextLine();
        String podajLower = podaj.toLowerCase();
        podajLower = podajLower.trim();

        int ocena = mapOceny.get(podajLower);
        System.out.println("\n Twoja ocena ma wartość: "+ocena);





















    }
}
