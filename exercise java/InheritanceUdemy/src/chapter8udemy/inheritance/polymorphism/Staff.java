package chapter8udemy.inheritance.polymorphism;

public abstract class Staff {

    //fields
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String address;
    private String department;

    //constructor -but we can't create Staff object from an abstract class
    public Staff(String firstName, String lastName, String phoneNumber,
                 String email, String address, String department) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.department = department;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //other methods:


//    public void info (){
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("First name: ").append(getFirstName()).append("\n")
//                .append("Last name: ").append(getLastName()).append("\n")
//                .append("Phone number: ").append(getPhoneNumber()).append("\n")
//                .append("Address: ").append(getAddress()).append("\n")
//                .append("E-mail: ").append(getEmail()).append("\n")
//                .append("Department: ").append(getDepartment()).append("\n");
//        System.out.println(stringBuilder.toString());
//
//    }
    //method overriding

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("First name: ").append(getFirstName()).append("\n")
                .append("Last name: ").append(getLastName()).append("\n")
                .append("Phone number: ").append(getPhoneNumber()).append("\n")
                .append("Address: ").append(getAddress()).append("\n")
                .append("E-mail: ").append(getEmail()).append("\n")
                .append("Department: ").append(getDepartment()).append("\n");
        return stringBuilder.toString();

    }
    //method overloading:

    //method calculate salary for full-time professor

//    public double salary (int numberOfCourses){
//
//        double coefficient = 4.5; //współczynnik
//        double base = 265.5;
//
//        if (numberOfCourses>1){
//            for (int i = 1; i <numberOfCourses ; i++) {
//                coefficient += 0.5;
//            }
//        }
//        return coefficient*base;
//    }

    //method calculate salary for part-time professor
//    public double salary (double coefficient){
//
//        double base = 265.5;
//        return coefficient*base;
//    }

    //create an abstract method (they are not necessary):

//    we remove abstract class salary() and create a new interface, which implements this method:

//    public abstract double salary();

}
