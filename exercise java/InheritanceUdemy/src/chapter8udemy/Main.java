package chapter8udemy;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Anna", "Buda", "53323433",
                "buda@anna.pl", "Krańcowa 8, Lublin", "Wykładowca");
        staff.info();
        staff.setPhoneNumber("22387332");
        staff.info();


    }
}
