package chapter8udemy;

public class PartTimeProfessor extends Staff {

    private int numberOfLectures;

    public PartTimeProfessor(String firstName, String lastName, String phoneNumber,
                             String email, String address, String department, int numberOfLectures) {

        super(firstName, lastName, phoneNumber, email, address, department);
        this.numberOfLectures = numberOfLectures;
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        this.numberOfLectures = numberOfLectures;
    }

    public double calculateCoefficient (){

        return getNumberOfLectures()*1.5;
    }

    @Override

    public String toString(){

        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append("Number of lectures: ").append(getNumberOfLectures()).append("\n");
        return stringBuilder.toString();
    }

}
