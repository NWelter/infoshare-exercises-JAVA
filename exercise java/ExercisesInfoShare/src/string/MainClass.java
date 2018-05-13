package string;

public class MainClass {
    public static void main(String[] args) {

        String text1 = "  Anna ma psa.     ";

        // 1. TRIM - usuwa znaki białe (white spaces) na początku i końcu łańcucha String

        String text2 = text1.trim();
        System.out.println("Przed trim: "+text1);
        System.out.println("Po trim: "+text2);

        // 2. TO UPPER CASE - zamienia na wielkie litery

        String text3 = text2.toUpperCase();
        System.out.println("toUpperCase: "+text3);

        // 3. TO LOWER CASE - zamienia na małe litery

        text1 = "Anna Ma Kota i Psa";
        text2 = text1.toLowerCase();
        System.out.println(text1);
        System.out.println("toLowerCase: "+text2);

        // 4. IS EMPTY - typ boolean, sprawdza czy wartość String == null

        text1 = ""; //== null
        text2 = "  text  ";

        boolean pusty = text1.isEmpty();
        boolean pusty2 = text2.isEmpty();
        System.out.println("Czy text1 jest pusty? "+pusty);
        System.out.println("Czy text2 jest pusty? "+pusty2);

        // 5. LENGTH - typ int, przechowuje liczbę znaków łańcucha String

        text1 = " Anna kot i pies sa paczka   ";
        int ile = text1.length();
        System.out.println(text1);
        System.out.println("Powyzszy tekst ma: "+ile+" znakow.");
        text2 = text1.trim();
        ile = text2.length();
        System.out.println("Powyższy tekst po .trim(); ma: "+ile+" znakow.");

        // 6. CHAR AT - typ char, podaje znak przypisany konkretnemu indeksowi (znaki białe też są indeksowane)

        char ktora = text2.charAt(1);
        System.out.println("Znak o indeksie '1' po .trim(); to: "+ktora);

        // 7. TO CHAR ARRAY - typ char [], wrzuca wszystkie znaki z łańcucha String do tablicy char

        String text4 = "jakis lancuch znakow  z bialymi znakami";

        char [] array1 = text4.toCharArray();

        //wyświetlanie standardowo pętlą for
        System.out.println("\n"+text4+"\n Po metodzie .toCharArray(); \n");

        for (int i = 0; i < array1.length; i++)
            System.out.println(array1[i]);

        // 8. SUBSTRING - zmienna typu String, zwraca wybrany fragment ciągu łańcucha String

        String text5 = text4.substring(1,4); // <= i > (zawiera indeks '1' ale nie zawiera indeksu '4')
        System.out.println(".substring(1,4); to: "+text5);

        // 9. SUBSEQUENCE - typ obiektowy CharSequence, zwraca sekwencję znaków char

        CharSequence seq1 = text4.subSequence(1,4);
        System.out.println("Sekwencja znaków od indeksu 1 do 4: "+seq1);

        // 10. SPLIT - dzieli łańcuch String na fragmenty w zależności od zadanego warunku, zwraca String []

        //Przykład 1.
        String text6 = "dlugi tekst niepodzielony";
        System.out.println(text6);
        String [] arraySplit = text6.split(" ");//w nawiasie reguły (warunki) dzielenia - tu spacje

        for (int i = 0; i< arraySplit.length; i++) {
            System.out.println(arraySplit[i]);
        }

        //Przykład 2.
        String text7 = " dlu gi  tekst  dzie lony  spacj ami gdzie   popad nie ";
        System.out.println(text7);
        String [] arraySplit2 = text7.split(" ");

        for (int i = 0; i< arraySplit2.length; i++) {
            System.out.println(arraySplit2[i]);
            int [] ileZnakow = new int [100];
                 ileZnakow[i] = arraySplit2[i].length();
            System.out.println("Ten fragment ma: "+ileZnakow[i]+" znaków.");
        }

        //Przykład 3.
        String text8 = "\n tek4st z cy98frami9roznymi";
        System.out.println(text8);
        String [] arraySplit3 = text8.split("[0-9]");//RegEx - jak napotka jakąś cyfrę z tego zakresu to podzieli

        for (int i = 0; i <arraySplit3.length; i++)
            System.out.println(arraySplit3[i]);

        //Przykład 4.
        String text9 = "Java 8 i co";
        System.out.println("\n"+text9);
        System.out.println("Podzielony na maksymalnie 4 elementy:");
        String [] arraySplit4 = text9.split("",4); //limit - maksymalna liczba elementów tablicy


        for (int i = 0; i <arraySplit4.length ; i++) {

            System.out.println(arraySplit4[i]);
        }

        // 11. REPLACE

        /*
        Zamienia ciąg znaków łańcucha String innym
        Funkcja dwu-argumentowa (1.co zamieniamy? 2.na co zamieniamy?).
        .replaceFirst(); - zamienia tylko pierwszą napotkaną,
        .replaceAll(); - zamienia wszystkie znaki/Stringi/wyrażenia regularne (regex np. [0-9]),
        .replace(); - zamienia tylko znaki/Stringi,
         */

        System.out.println(text8);

        String zamien = text8.replaceAll("[0-9]", "!");
        System.out.println("Po zamianie wszystkich cyfr na '!' .replaceAll(); \n"+zamien);

        //12. MATCHES
        /*
        Deklarujemy zmienne typu boolean.
        Sprawdza czy dany łańcuch String pasuje do wzorca (cały String musi pasować/nie pasować).
        Jako argument przyjmuje wyrażenia regularne (RegEx).
         */

        boolean match = text9.matches("Java 8 i co");
        System.out.println("Czy pasuje? "+match);
        boolean match2 = text9.matches("Java [0-9] i co");
        System.out.println("Czy pasuje? "+match2);
        boolean mtch3 = text5.matches(text5);
        System.out.println("Czy pasuje? "+mtch3);
        boolean match3 = text9.matches("Java");
        System.out.println("Czy pasuje? "+match3);

        //13. INDEX OF - zmienne typu int, przeszukuje ciąg znaków Stringa i wyrzuca pierwszy znaleziony,  pasujący do deklaracji

        int i1 = text9.indexOf("a");
        int i2 = text9.lastIndexOf("a"); //ostatni pasujący indeks
        System.out.println(text9);
        System.out.println("pierwsze 'a' ma indeks: "+i1);
        System.out.println("ostatnie 'a' wystepuje pod indeksem: "+i2);

        // 14. EQUALS - typ boolean, porównuje wartość Stringów

        boolean eq1 = text9.equals("Java 8 i co");
        System.out.println("Czy tekst: "+text9+" \nma taką samą wartość jak 'Java 8 i co'? "+eq1);
        eq1 = text9.equals("JAVA 8 I CO");
        System.out.println("Czy tekst: "+text9+" \nma taką samą wartość jak 'JAVA 8 I CO'? "+eq1);


        //ignoruje wielkosc liter:
        boolean eq2 = text9.equalsIgnoreCase("JAVA 8 I CO");
        System.out.println("Czy tekst: "+text9+" \nma taką samą wartość jak 'JAVA 8 I CO' z .equalsIgnoreCase();? "+eq2);

        // 15. CONCAT -konkatenacja = łączenie Stringów, bardziej wydajne niż "+" w 'sout'

        String conc = "Java";
        String conc2 = conc.concat(" 8");
        System.out.println("Concat: "+conc2);

        // 16. STARTS WITH - typ boolean, sprawdza, czy dany ciąg zaczyna się od określonej sekwencji

        boolean b1 = text9.startsWith("Ja");
        System.out.println("\n"+text9);
        System.out.println("Czy zaczyna się od 'Ja'? "+b1);

        //wersja z zaznaczeniem indeksu od ktorego przeszukuje

        boolean b2 = text9.startsWith("ava", 1);
        System.out.println("Czy zawiera ciąg 'ava' licząc od indeksu 1? "+b2);

        //17. ENDS WITH - typ boolean, sprawdza, czy dany ciąg kończy się określoną sekwencją

        boolean b3 = conc2.endsWith(" 8");
        System.out.println(conc2);
        System.out.println("Czy kończy się '8'? "+b3);

        // 18. CONTAINS - typ boolean, sprawdza czy zawiera dany ciąg znaków

        boolean b4 = text9.contains("i c");
        System.out.println("\n"+text9);
        System.out.println("Czy zawiera 'i c'? "+b4);

        //19. GET BYTES - zamienia String na tablicę bajtów, deklarujemy byte []

        byte [] byteArray = text9.getBytes();
        System.out.println("\nBajty łańcucha znaków '"+text9+"' wg ASCII: ");

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);

        }

        //20. COMPARE TO

        /*
        Przechowuje wartości typu int.
        Porównuje wartość danego ciągu znaków z drugim, wg wartości z tablicy ASCII.
        Bierze pod uwagę pierwsze znaki, jeśli są takie same to następne itp.
        Jeśli wartość pierwszego jest mniejsza to int < 0.
         */

        String alpha = "oF";
        String alpha2 = "oZ";
        int in1 = alpha.compareTo(alpha2);
        System.out.println("\nWartość porównania 'oF' z 'oZ' to: "+in1);








    }
}
