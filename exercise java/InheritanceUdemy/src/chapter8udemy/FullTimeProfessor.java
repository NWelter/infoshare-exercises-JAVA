package chapter8udemy;

public class FullTimeProfessor extends Staff {

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


}
