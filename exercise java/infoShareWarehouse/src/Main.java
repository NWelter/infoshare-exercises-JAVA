/*
    Aplikacja została stworzona podczas "Warsztatów z podstaw programowania w Javie",
    organizowanych przez infoShare Academy w Lublinie, dnia 16.05.2018 r.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Aplikacja do zarządzania magazynem");

        //Deklaracja zmiennych - "rzeczowniki"

        //double netPricePerKilo = grossPricePerKilo*(1-vatRate);

        Product product = new Product("Jabłka Ligol", 500, 0.05, 1.6);

        double netPricePerKilo = product.calculateNetPricePerUnit();

        System.out.println("Nazwa produktu: " + product.name);


        //Metody (Logika) - wywołanie z klasy Product:

        showWarehouseState(product.name, product.amount, product.grossPricePerUnit, netPricePerKilo);

        //wywołanie metody wyświetlającej Menu Programu
        showMenu();

        //wczytanie danych od użytkownika

        Scanner in = new Scanner(System.in);
        String choice = in.nextLine();

        //warunek wyboru - metoda .equals(); dla String

        if (choice.equals("1")) {
            double allProductsGrossPrice = product.calculateTotalGrossValue();
            System.out.println("Cena brutto wszystkich towarów wynosi: " + allProductsGrossPrice);


        } else if (choice.equals("2")) {

            System.out.println("Podaj liczbę dni: ");
            int days = in.nextInt();
            double rentalCost = calculateColdStoreRentalCost(days);
            System.out.println("Koszt wynajęcia chłodni wyniesie: " + rentalCost);

        }


    }

    //Definiowanie metody - "czasowniki":

    //metoda wyświetlająca Stan Magazynu
    public static void showWarehouseState(String name, int kilograms, double grossKilo, double netKilo) {

        System.out.println("STAN MAGAZYNU:");
        System.out.println(name + ", \nilość: " + kilograms + ", \ncena brutto: " + grossKilo + " zł, \ncena netto: " + netKilo + " zł");


    }

    //metoda wyświeltająca Menu Programu
    public static void showMenu() {

        System.out.println("\nWybierz opcję:");
        System.out.println("1 - oblicz cenę brutto wszystkich towaróœ");
        System.out.println("2 - oblicz koszt wynajmu chłodni");


    }

    //metoda obliczająca całkowitą wartość towaru
    public static double calculateAllProductGrossPrice(int kilograms, double grossPricePerUnit) {

        double AllProductsGrossPrice = kilograms * grossPricePerUnit;

        return AllProductsGrossPrice;
    }

    //metoda obliczajaca cene wynajmu chlodni - koszt wynajmu zmniejsza się o 1% każdego dnia
    public static double calculateColdStoreRentalCost(int days) {


        double dailyCost = 800; //wyjściowa cena najmu
        double discount = 0.01; //rabat
        double rentalCost = 0; //początkowy koszt wynajmu dla days==0

        //pętla obliczajaca calkowity koszt wynajmu chlodni z dziennym rabatem -1%

        for (int i = 0; i < days; i++) {

            rentalCost = rentalCost + dailyCost;
            dailyCost = dailyCost * (1 - discount);

        }

        return rentalCost;

    }
}


