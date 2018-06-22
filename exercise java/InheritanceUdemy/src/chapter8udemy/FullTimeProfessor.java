package chapter8udemy;

public class FullTimeProfessor extends Staff implements Salary{

    private int officeNumber;
    private String officeHours;
    private int numberOfCourses;
    private String officePhone;

    public FullTimeProfessor(String firstName, String lastName, String phoneNumber,
                             String email, String address, String department,
                             int officeNumber, String officeHours, int numberOfCourses, String officePhone) {

        super(firstName, lastName, phoneNumber, email, address, department);
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
        this.numberOfCourses = numberOfCourses;
        this.officePhone = officePhone;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
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

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    @Override
    public double salary() {
        double coefficient = 4.5; //współczynnik
        double base = 265.5;

        if (getNumberOfCourses() > 1) {
            for (int i = 1; i < getNumberOfCourses(); i++) {
                coefficient += 0.5;
            }
        }
        return coefficient * base;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("Office number: ").append(getOfficeNumber()).append("\n")
                .append("Office hours: ").append(getOfficeHours()).append("\n")
                .append("Number of lectures: ").append(getNumberOfCourses()).append("\n")
                .append("Office phone: ").append(getOfficePhone()).append("\n");
        return stringBuilder.toString();
    }


}
