package dataStructures;

import java.util.*;


public class MainClass {
    public static void main(String[] args) {

        // I. KOLEJKA - klasa java.util.Queue; kolejka jest domyślnie typem FIFO (First In, First Out)

        //tworzenie kolejki typu String

        Queue<String> kolejka = new ArrayDeque<String>();

        /*
        ArrayDeque jest bardziej uniwersalna, może być FIFO/LIFO,
        można wrzucać do niej wartości 'null'.
        PriorityQueue - typ FIFO, nie ma możliwości wrzucania do niej wartości 'null'.

        STOS - Stack (trochę przestarzałe API, lepiej korzystać z ArrayDeque), typ LIFO

         */


        //dodawanie elementu do kolejki:
        kolejka.add("jeden");

        //usuwanie elementu kolejki:
        kolejka.remove("jeden");

        kolejka.add("dwieście");
        kolejka.add("jeden");

        //podgląd elementu kolejki (2 sposoby), element nie może być 'null' (wyświetli błąd)
        String s1 = kolejka.element();

        //gdy kolejka jest pusta to dzieki 'peek' wyświetli nam 'null'
        String s2 = kolejka.peek();

        System.out.println(s1);
        System.out.println(s2);

        kolejka.add("osiem");
        kolejka.add("siedem");

        //rozmiar kolejki (deklarujemy jako int):
        int i1 = kolejka.size();

        System.out.println("Rozmiar kolejki: " + i1);

        //wyświetli nam wszystkie elementy kolejki:
        System.out.println(kolejka);

        //sprawdza czy kolejka jest pusta (true), typ boolean
        boolean b = kolejka.isEmpty();

        System.out.println("czy jest pusta?: " + b);

        kolejka.remove();
        kolejka.remove();
        i1 = kolejka.size();
        System.out.println("Rozmiar kolejki po usuwaniu: " + i1);

        s1 = kolejka.element();
        System.out.println("ostatni element kolejki to: " + s1);
        kolejka.remove();
        kolejka.remove();
        s1 = kolejka.peek();
        System.out.println("ostatni element kolejki po usunięciu dwóch elementów to: " + s1);
        b = kolejka.isEmpty();
        System.out.println("czy jest pusta?: " + b);


        // II. LISTA - klasa java.util.List

        /*
        Każdy element listy ma informacje tylko o tym, gdzie jest sąsiedni element.
        Wyróżniamy 3 rodzaje obiektów:
        1. ArrayList - najbardziej uniwersalny, elementy są indeksowane jak w tablicy (tylko nawiasy okrągłe)
        2. LinkedList - lista wiązana
        3. Vector - przestarzały, istnieje od początku Javy (Zaleca się zastępowanie go ArrayList)
         */
        //Klasa + <typ> + nazwa obiektu = rodzaj konstruktora <typ> ();
        List<String> lista = new ArrayList<String>();

        //dodawanie elementów typu String do listy
        lista.add("jeden");
        lista.add("dwa");
        lista.add("trzy");
        lista.add("Monika");
        lista.add("cztery");
        lista.add("Andrzej");
        lista.add("Kasia");

        //przechowywanie elementu listy (deklarowana zmienna String, metoda .get(nr indeksu danego elementu);)
        String elementListy = lista.get(0);

        String elementListy2 = lista.get(2);

        //wyświetlanie wszystkich elementów listy
        System.out.println("\n Nowa lista: " + lista);

        //wyświetlanie elementów listy z indeksem 0 i 2
        System.out.println(elementListy + ", " + elementListy2);

        //rozmiar listy, zmienna typu int
        int listSize = lista.size();
        System.out.println("Rozmiar listy to: " + listSize);

        //sprawdzanie czy lista jest pusta (true), typ boolean
        boolean pusta = lista.isEmpty();
        System.out.println("Czy lista jest pusta? " + pusta);

        //wyswietlanie elementow listy - podejście tablicowe:

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));

        }

        //drugie podejscie - pętla FOR EACH (o wiele lepsza i przejrzysta):

        /*
        BUDOWA PĘTLI FOR EACH (== "dla każdego kolejnego elementu kolekcji/tablicy"):
        for(typ_deklarowanej_zmiennej (taki jak typ przechowywanych wartości) nasza_nazwa_zmiennej:nazwa_listy(zakres))
            sout(nasza_nazwa_zmiennej);
         */

        System.out.println();

        for (String elem : lista) {
            System.out.println(elem);
        }

        // III. ZBIORY - java.util.Set;
        /*
        Kolekcje do przechowywania UNIKALNYCH elementów.
        Wyróżniamy 3 podstawowe klasy:
        1. HashSet - zbiór nieposortowanych elementów, ich kolejność może ulec zmianie.
        2. LinkedHashSet - dziedziczy po HashSet, indeksy są uporządkowane
        3. TreeSet - przechowuje elementy posortowane wg logicznego porządku (nie mamy wpływu na typ sortowania).
         */

        //HashSet - tworzenie zbioru przechowującego Stringi
        Set<String> zbior = new HashSet<String>();

        zbior.add("Dwa");
        zbior.add("Marysia");
        zbior.add("Gąska");
        zbior.add("Bogusia");
        zbior.add("Kuba");
        zbior.add("Bogusia");


        System.out.println();

        //wyświetlanie elementów HashSetu (wyświetli tylko unikalne elementy)

        for (String elem : zbior)
            System.out.println(elem);

        /*
        TreeSet - sortuje wyniki rosnąco wg tablicy ASCII,
        nie przyjmuje typów prostych w deklaracji
        (muszą być one obiektowe np. Integer zamiast int)
         */
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
        System.out.println("Rozmiar TreeSet: " + rozmiar);

        //  pętla for each do wyświetlania elementów:

        for (int elem : zbior2)
            System.out.println(elem);

        System.out.println();


        //wyswietlanie zwykłą pętlą for - wymaga użycia obiektu typu Iterator i metody .iterator():
        Iterator<Integer> iterator = zbior2.iterator();
        for (int i = 0; i < zbior2.size(); i++) {
            System.out.println(iterator.next());//wyświetlanie kolejnych elementów metodą .next();


        }

        // IV. MAPA - klasa java.util.Map

        /*
        Mechanizm działania zbliżony do wskaźników w C++.
        Można o niej myśleć jako o dwóch tablicach przechowujących pary powiązanych wartości: KLUCZ -PARAMETR.
        Klucze muszą być unikalne w każdej mapie.
        1 klucz - 1 wartość.

        Mapy stosowane są przy przekazywaniu parametrów za pomocą metod HTTP GET oraz POST,
        oraz bardzo popularnym formacie JSON (JavaScript Object Notation).

        W mapach wyróżniamy 4 klasy:
        1. HashMap - nieposortowana, kolejność iteracji kluczy może się zmieniać
        2. LinkedHashMap - dziedziczy po HashMapie, kolejność kluczy jest determinowana (przypadkowa ale STAŁA)
        3. TreeMap - elementy posortowane wg naturalnych parametrów, kolejność kluczy jest POSORTOWANA I STAŁA
        4. HashTable - ma znaczenie historyczne

         */


        //deklaracja mapy, przyjmuje 2 typy generyczne <1. Klucz, 2. Wartość powiązana>. Muszą być Obiektowe.
        Map<Integer, String> map = new HashMap<Integer, String>();

        //dodawanie elementów (tu różnica: 'put' a nie 'add'):

        map.put(1, "Natalia");
        map.put(2, "Ilona");
        map.put(3, "Waldemar");

        //przechowywanie elementu mapy, na podstawie powiązanego klucza (argument funkcji .get();):
        String element = map.get(2);
        System.out.println("Element mapy o kluczu '2' to: "+element);

        //rozmiar mapy
        int ile = map.size();
        System.out.println("Mapa zawiera "+ile+" elementów.");

        //wyświetlanie wszytskich par klucz-wartość mapy:
        System.out.println("\n Elementy mapy: " + map);

        //sprawdzanie czy mapa zawiera elementy:
        boolean pustaMapa = map.isEmpty();
        System.out.println("Czy jest pusta: " + pustaMapa);

        //sprawdzanie czy mapa zawiera dany klucz:
        boolean kluczMapy = map.containsKey(2);
        System.out.println("Czy ma klucz '2'? " + kluczMapy);

        //sprawdzanie czy mapa zawiera daną wartość:
        boolean wartoscMapy = map.containsValue("Kasia");
        System.out.println("Czy ma wartość 'Kasia'? " + wartoscMapy);

        //nadpisanie wartosci o kluczu 1:

        map.put(1, "Kasia");
        System.out.println(map);

        wartoscMapy = map.containsValue("Kasia");
        System.out.println("Czy ma wartość 'Kasia'? " + wartoscMapy);

        //TreeMap:

        /*
        Zadanie 1.
        Stwórz Treemap przechowujący oceny (słowne jako klucz i liczbowe jako wartość).
        Użytkownik po podaniu oceny słownie powinien dostać wyświetloną jej wartość liczbową.
         */

        //tworzenie kolekcji TreeMap, klucz -String, wartość -Integer
        Map<String, Integer> mapOceny = new TreeMap<String, Integer>();

        mapOceny.put("niedostateczny", 1);
        mapOceny.put("dopuszczający", 2);
        mapOceny.put("dostateczny", 3);
        mapOceny.put("dobry", 4);
        mapOceny.put("bardzo dobry", 5);
        mapOceny.put("celujący", 6);

        //Tworzenie obiektu typu Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Jaką ocenę (słownie) chcesz wyświetlić?: ");
        String podaj = in.nextLine();
        //zabezpieczenie przed wielkimi literami i spacjami na początku/końcu
        String podajLower = podaj.toLowerCase();
        podajLower = podajLower.trim();

        //deklaracja zmiennej przechowującej wartość typu int dla danego klucza
        int ocena = mapOceny.get(podajLower);
        System.out.println("\n Twoja ocena ma wartość: " + ocena);


    }
}
