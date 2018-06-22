package chapter8udemy;

public class TeachingAssistant extends Staff implements Salary {


    private String officeHours;
    private int numberOfCourses;

    public TeachingAssistant(String firstName, String lastName, String phoneNumber,
                             String email, String address, String department,
                             String officeHours, int numberOfCourses) {

        super(firstName, lastName, phoneNumber, email, address, department);
        this.officeHours = officeHours;
        this.numberOfCourses = numberOfCourses;
    }


    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    @Override
    public double salary() {
        double base = 130.0;
        double coefficient = 4.5;

        return base * coefficient;
    }

    @Override

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("Office hours: ").append(getOfficeHours()).append("\n")
                .append("Number of courses: ").append(getNumberOfCourses()).append("\n");
        return stringBuilder.toString();
    }
}
