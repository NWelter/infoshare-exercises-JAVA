package task;

public class Student {

	// FIELDS:

	private String firstName, lastName, dateOfBirth, adress, phoneNumber, email;
	private int studentIdNumber;
	private double semestr1GPA, semestr2GPA;

	// CONSTRUCTORS:

	public Student() {

	}

	public Student(String firstName, String lastName, String dateOfBirth, String adress, String phoneNumber,
			String email, int studentIdNumber, double semestr1GPA, double semestr2GPA) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.studentIdNumber = studentIdNumber;
		this.semestr1GPA = semestr1GPA;
		this.semestr2GPA = semestr2GPA;
	}

	// Getters and setters:

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String name) {

		firstName = name;
	}

	public String getLasttName() {

		return lastName;

	}

	public void setLastName(String name) {

		lastName = name;
	}
	
	public String getDateOfBirth () {
		
		return dateOfBirth;
	}
	
	public void setDateOfBirth (String date) {
		
		dateOfBirth = date;
	}
	
	public String getAdress () {
		
		return adress;
	}
	
	public void setAdress(String adress) {
		
		this.adress = adress;
	}
	
	public String getPhonenumber () {
		
		return phoneNumber;
	}
	
	public void setPhonenumber (String number) {
		
		phoneNumber = number;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail (String email) {
		
		this.email = email;
	}
	
	public int getStudentIdNumber() {
		
		return studentIdNumber;
	}
	
	public void setStudentIdNumber (int id) {
		
		studentIdNumber = id;
		
	}
	
	public double getSemestr1GPA () {
		
		return semestr1GPA;
	}
	
	public void setSemestr1GPA (double average) {
		
		semestr1GPA = average;
	}
	public double getSemestr2GPA () {
		
		return semestr2GPA;
	}
	
	public void setSemestr2GPA (double average) {
		
		semestr2GPA = average;
	}
	
	//METHODS:
	
	//calculate the average grade of the two semesters GPA
	public double gpa () {
		
		return (semestr1GPA + semestr2GPA)/2;
	}
	
	//check if student's id is between 10000 and 99999:
	public boolean isValidID() {
		boolean validId = false;
		
		if(studentIdNumber>=10000 && studentIdNumber <= 99999) {
			validId = true;
			
		}
		return validId;
	}
	
	//print out the student information:
	public void studentInfo() {
		
		System.out.println("Student first name: "+firstName+"\nlast name: "+lastName+"\nadress: "+adress+
				"\nphone number: "+phoneNumber+"\ndate of birth: "+dateOfBirth+"\ne-mail: "+email+
				"\nID: "+studentIdNumber+"\nsemestr I. GPA: "+semestr1GPA+"\nsemestr II. GPA: "+semestr2GPA);
	}
	
	
	
	
	
}
