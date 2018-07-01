package chapter8udemy.inheritance.polymorphism;

//import from another packages in project:

import machines.Machine;
import machines.Car;

public class Main {
    public static void main(String[] args) {

        //create object from another package (machines)-only for practice import:

        Machine machine = new Machine(11);
        Car car = new Car(10);
        machine.stop();
        car.wipeWindshield();

        //PROPER SOURCE CODE:

//        we can't use Staff's object -Staff is now an abstract class:

//        Staff staff = new Staff("Anna", "Buda", "53323433",
//                "buda@anna.pl", "Krańcowa 8, Lublin", "Biochemistry");
//        System.out.println(staff.toString());
//        staff.setPhoneNumber("22387332");
//        System.out.println(staff.toString());

        PartTimeProfessor partTimeProfessor = new PartTimeProfessor("Andrzej", "Kot", "4448855",
                "andrzej@kot.pl", "Tartaczna 2, Świdnik", "Biotechnology", 7);

        System.out.println(partTimeProfessor.toString());

        FullTimeProfessor fullTimeProfessor = new FullTimeProfessor("Barbara", "Baraniak", "81766222",
                "barb@ra.pl", "Lotnicza 13, Świdnik", "Food Chemistry",
                331, "8-12", 5, "81 234 234");

        System.out.println(fullTimeProfessor.toString());

        System.out.println("Part-time professor's salary is "
                + partTimeProfessor.salary());

        System.out.println("Full time professor's salary is: "
                + fullTimeProfessor.salary());

        TeachingAssistant teachingAssistant = new TeachingAssistant("Roman", "Wąs","21232322","was@was.pl",
                "MAkowa 2 Lublin", "Microbiology", "8-13", 4);

        System.out.println(teachingAssistant.toString());
        System.out.println("Teaching assistant's salary is:"+ teachingAssistant.salary());

        Registry registry = new Registry("Anna","Wyka", "337633","a@pl.",
                "Majowa 2/4 Rzeszów","Biotechnology Institute", 120, "21 3372", 121);

        System.out.println(registry.toString());
        System.out.println("Registry's salary is: "+registry.salary());

        Finance finance = new Finance("Błażej", "Pol","4555666","bla@zej.pol",
                "Śrutowa 11 Świdnik", "Payment", 100, "34455", 113);

        System.out.println(finance.toString());
        System.out.println("Finance's salary is: "+finance.salary());

    }
}
