package chapter8udemy;

//import from another packages in project:
import machines.Machine;
import machines.Car;

public class Main {
    public static void main(String[] args) {

        //create object from another package (machines)-only for practice import:

        Machine machine = new Machine();
        Car car = new Car();
        machine.stop();
        car.wipeWindshield();

        //PROPER SOURCE CODE:

        Staff staff = new Staff("Anna", "Buda", "53323433",
                "buda@anna.pl", "Krańcowa 8, Lublin", "Biochemistry");
        System.out.println(staff.toString());
        staff.setPhoneNumber("22387332");
        System.out.println(staff.toString());

        PartTimeProfessor partTimeProfessor = new PartTimeProfessor("Andrzej","Kot","4448855",
                "andrzej@kot.pl", "Tartaczna 2, Świdnik", "Biotechnology", 7);

        System.out.println(partTimeProfessor.toString());

        FullTimeProfessor fullTimeProfessor = new FullTimeProfessor("Barbara","Baraniak", "81766222",
                "barb@ra.pl", "Lotnicza 13, Świdnik", "Food Chemistry",
                331, "8-12", 5, "81 234 234");

        System.out.println(fullTimeProfessor.toString());

        System.out.println("Part-time professor's salary is "
                +partTimeProfessor.salary(partTimeProfessor.calculateCoefficient()));

        System.out.println("Full time professor's salary is: "
        +fullTimeProfessor.salary(fullTimeProfessor.getNumberOfCourses()));


    }
}
