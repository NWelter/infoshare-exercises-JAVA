package chapter8udemy;

public class Registry extends Staff implements Salary{


    private int workingHours;
    private String officePhone;
    private int officeNumber;

    public Registry(String firstName, String lastName, String phoneNumber,
                    String email, String address, String department, int workingHours, String officePhone, int officeNumber) {
        super(firstName, lastName, phoneNumber, email, address, department);
        this.workingHours = workingHours;
        this.officePhone = officePhone;
        this.officeNumber = officeNumber;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }

    @Override
    public double salary() {
        double base = 24.5;
        return base * getWorkingHours();
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("Office phone: ").append(getOfficePhone()).append("\n")
                .append("Office number: ").append(getOfficeNumber()).append("\n")
                .append("Working hours: ").append(getWorkingHours()).append("\n");
        return stringBuilder.toString();
    }
}

