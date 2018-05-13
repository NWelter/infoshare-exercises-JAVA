package string;

public class MainClass {
    public static void main(String[] args) {

        String text1 = "  Anna ma psa.     ";

        // 1. TRIM

        String text2 = text1.trim();
        System.out.println("Przed trim: "+text1);
        System.out.println("Po trim: "+text2);

        //2. TO UPPER CASE

        String text3 = text2.toUpperCase();
        System.out.println(text3);

        //3. TO LOWER CASE

        text1 = "Anna Ma Kota i Psa";
        text2 = text1.toLowerCase();
        System.out.println(text1);
        System.out.println(text2);

        //4. IS EMPTY

        text1 = "";
        text2 = "  text  ";

        boolean pusty = text1.isEmpty();
        boolean pusty2 = text2.isEmpty();
        System.out.println(pusty);
        System.out.println(pusty2);

        //5. LENGTH

        text1 = " Anna kot i pies sa paczka   ";
        int ile = text1.length();
        System.out.println(text1);
        System.out.println("powyzszy tekst ma: "+ile+" znakow");
        text2 = text1.trim();
        ile = text2.length();
        System.out.println("tekst po trimie ma: "+ile+" znakow");

        // 6. CHAR AT

        char ktora = text1.charAt(1);
        System.out.println(ktora);

        //7. TO CHAR ARRAY

        String text4 = "jakis lancuch znakow  z bialymi znakami";

        char [] array1 = text4.toCharArray();

        for (int i = 0; i < array1.length; i++)
            System.out.println(array1[i]);

        // 8. SUBSTRING

        String text5 = text4.substring(1,4); // <= i >
        System.out.println(text5);

        // 9. SUBSEQUENCE

        CharSequence seq1 = text4.subSequence(1,4); //typ obiektowy
        System.out.println(seq1);

        // 10. SPLIT

        String text6 = "dlugi tekst dzielony";
        String [] arraySplit = text6.split(" ");

        for (int i = 0; i< arraySplit.length; i++) {
            System.out.println(arraySplit[i]);
        }

        String text7 = " dlu gi  tekst  dzie lony   ";
        String [] arraySplit2 = text7.split(" ");



        for (int i = 0; i< arraySplit2.length; i++) {
            System.out.println(arraySplit2[i]);
            int [] ileZnakow = new int [100];
                 ileZnakow[i] = arraySplit2[i].length();
            System.out.println(ileZnakow[i]);
        }

        String text8 = "tek4st z cy98frami9roznymi";
        String [] arraySplit3 = text8.split("[0-9]");

        for (int i = 0; i <arraySplit3.length; i++)
            System.out.println(arraySplit3[i]);

        String text9 = "Java 8 i co";
        String [] arraySplit4 = text9.split("",4);

        for (int i = 0; i <arraySplit4.length ; i++) {

            System.out.println(arraySplit4[i]);
        }

        // 11. REPLACE

        String zamien = text8.replaceAll("[0-9]", "!");
        System.out.println(zamien);

        //12. MATCHES

        boolean match = text9.matches("Java 8 i co");
        System.out.println(match);
        boolean match2 = text9.matches("Java [0-9] i co");
        System.out.println(match2);
        boolean mtch3 = text5.matches(text5);
        System.out.println(mtch3);
        boolean match3 = text9.matches("Java");
        System.out.println(match3);

        //13. INDEX OF

        int i1 = text9.indexOf("a");
        int i2 = text9.lastIndexOf("a");
        System.out.println("pierwsze a ma indeks: "+i1);
        System.out.println("ostatnie a wystepuje pod indeksem: "+i2);

        // 14. EQUALS

        boolean eq1 = text9.equals("Java 8 i co");
        System.out.println(eq1);

        //ignoruje wielkosc liter:
        boolean eq2 = text9.equalsIgnoreCase("JAVA 8 I CO");
        System.out.println(eq2);

        // 15. CONCAT

        String conc = "Java";
        String conc2 = conc.concat(" 8");
        System.out.println(conc2);

        // 16. STARTS WITH

        boolean b1 = text9.startsWith("Ja");
        System.out.println(b1);

        //wersja z zaznaczeniem indeksu od ktorego przeszukuje

        boolean b2 = text9.startsWith("ava", 1);
        System.out.println(b2);

        //17. ENDS WITH

        boolean b3 = conc2.endsWith(" 8");
        System.out.println(b3);

        // 18. CONTAINS

        boolean b4 = text9.contains("i c");
        System.out.println(b4);

        //19. GET BYTES

        byte [] byteArray = text9.getBytes();

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);

        }

        //20. COMPARE TO

        String alpha = "oF";
        String alpha2 = "oZ";
        int in1 = alpha.compareTo(alpha2);
        System.out.println(in1);








    }
}
