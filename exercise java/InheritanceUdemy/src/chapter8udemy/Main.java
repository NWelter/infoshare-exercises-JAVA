package chapter8udemy;

public class Main {
    public static void main(String[] args) {
        Staff staff = new Staff("Anna", "Buda", "53323433",
                "buda@anna.pl", "Krańcowa 8, Lublin", "Biochemistry");
        staff.info();
        staff.setPhoneNumber("22387332");
        staff.info();

        PartTimeProfessor partTimeProfessor = new PartTimeProfessor("Andrzej","Kot","4448855",
                "andrzej@kot.pl", "Tartaczna 2, Świdnik", "Biotechnology", 7);

        partTimeProfessor.info();

        FullTimeProfessor fullTimeProfessor = new FullTimeProfessor("Barbara","Baraniak", "81766222",
                "barb@ra.pl", "Lotnicza 13, Świdnik", "Food Chemistry",
                331, "8-12", 5, "81 234 234");

        fullTimeProfessor.info();

        System.out.println("Part-time professor's salary is "
                +partTimeProfessor.salary(partTimeProfessor.calculateCoefficient()));

        System.out.println("Full time professor's salary is: "
        +fullTimeProfessor.salary(fullTimeProfessor.getNumberOfCourses()));


    }
}
