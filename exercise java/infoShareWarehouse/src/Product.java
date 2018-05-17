public class Product {

    //Pola klasy:

    String name;
    int amount;
    double vatRate;
    double grossPricePerUnit;

    //Konstruktor

    Product(String name, int amount, double vatRate, double grossPricePerUnit) {

        this.name = name;
        this.amount = amount;
        this.vatRate = vatRate;
        this.grossPricePerUnit = grossPricePerUnit;

    }

    //Metody

    //obliczanie ceny netto
    public double calculateNetPricePerUnit() {

        double netPrice = grossPricePerUnit - (grossPricePerUnit * (1 - vatRate));
        return netPrice;

    }

    //obliczanie całkowitej wartości towaru brutto
    public double calculateTotalGrossValue() {

        double grossValue = grossPricePerUnit * amount;
        return grossValue;

    }
}
