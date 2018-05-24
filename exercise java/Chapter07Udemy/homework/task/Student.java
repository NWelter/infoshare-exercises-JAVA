package task;

import java.util.Scanner;

/*
 * 	QUIZ TASK 1.
 * 
 * Create a class Student which will contains the following fields:
 * - first name
 * - last name
 * - date of birth
 * - address
 * - phone number
 * - e-mail
 * - student ID number
 * - GPA for semester 1
 * - GPA for semester 2
 * 
 * Implement all getters and setter, as well as the constructors.
 * 
 * Implement the following methods:
 * 1. gpa which calculates average grade of gpa1 i gpa2
 * 2. isValidGrade which checks if grade is between 'A' and 'F'
 * 3. isValidID which checks if student ID number is between 10000 and 99999
 * 4. studentInfo which print out all the informations about student
 * 5. enroll student
 * 
 * 
 */
public class Student {

	// FIELDS:

	// good practice is to set String type of variable for phone number (not int)
	private String firstName, lastName, dateOfBirth, address, phoneNumber, email;
	private int studentIdNumber;
	private char semestr1GPA, semestr2GPA;

	// CONSTRUCTORS:

	// with default values
	public Student() {

		this.firstName = "Jan";
		this.lastName = "Kowalski";
		this.dateOfBirth = "01.01.1991";
		this.address = "ul. Wiejska 8, 20-000 Warszawa";
		this.phoneNumber = "888 888 888";
		this.email = "test@test.pl";
		this.studentIdNumber = 10000;
		this.semestr1GPA = 'F';
		this.semestr2GPA = 'F';

	}

	public Student(String firstName, String lastName, String dateOfBirth, String address, String phoneNumber,
			String email, int studentIdNumber, char semestr1GPA, char semestr2GPA) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.studentIdNumber = studentIdNumber;
		this.semestr1GPA = semestr1GPA;
		this.semestr2GPA = semestr2GPA;
	}

	// Getters and setters - very simply way is PPM and Source/Generate getters and
	// setters:

	public String getFirstName() {

		return firstName;

	}

	public void setFirstName(String name) {

		firstName = name;
	}

	public String getLastName() {

		return lastName;

	}

	public void setLastName(String name) {

		lastName = name;
	}

	public String getDateOfBirth() {

		return dateOfBirth;
	}

	public void setDateOfBirth(String date) {

		dateOfBirth = date;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String adress) {

		this.address = adress;
	}

	public String getPhonenumber() {

		return phoneNumber;
	}

	public void setPhonenumber(String number) {

		phoneNumber = number;
	}

	public String getEmail() {

		return email;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public int getStudentIdNumber() {

		return studentIdNumber;
	}

	public void setStudentIdNumber(int id) {
		
		//we validate input with isValidID();
		if(isValidID(studentIdNumber))
		studentIdNumber = id;
		else
			studentIdNumber = 0;

	}

	public char getSemestr1GPA() {

		return semestr1GPA;
	}

	public void setSemestr1GPA(char grade) {

		// we validate input value with boolean isValidGrade()
		if (isValidGrade(semestr1GPA))
			semestr1GPA = grade;
		else
			semestr1GPA = 'F';// set default value
	}

	public char getSemestr2GPA() {

		return semestr2GPA;
	}

	public void setSemestr2GPA(char grade) {

		// we validate input with boolean isValidGrade()

		if (isValidGrade(semestr2GPA))
			semestr2GPA = grade;
		else
			semestr2GPA = 'F'; // set default value
	}

	// METHODS:

	/*
	 * Calculate the average GPA grade of the two semesters.
	 * This method is from tutorial and has some issue:
	 * average number of 'D'(value 68 in ASCII) +'F'(value 70 in ASCII) is 'E' (69)
	 * but 'E' is not valid grade!
	 */
	
	
	public char gpa(int semestr1GPA, int semestr2GPA) {
		
		/*
		 * Math.floor() - This function maps a number to the nearest lowest integer. 
		 * For example 4.9 is mapped to 4. 
		 * It works on negative numbers too: -3.1 maps to -4.
		 */
		
		char gpa = (char) Math.floor((semestr1GPA+semestr2GPA)/2.0);
		if(isValidGrade(gpa))
			return gpa;
		else
			return gpa='X';

		 
	}

	// check if student's id is between 10000 and 99999:
	public boolean isValidID(int studentIdNumber) {

		if (studentIdNumber >= 10000 && studentIdNumber <= 99999) {
			return true;

		} else
			return false;

	}

	public boolean isValidGrade(char gpa) {

		// grade in U.S. are: A, B, C, D, F (without E!)

		// we can use char signs with relational operators cause all chars have own
		// ASCII numbers
		if (gpa >= 'A' && gpa <= 'F' && gpa != 'E')
			return true;

		else
			return false;
	}

	// print out the student information with object fields...:
	public void studentInfo() {

		System.out.println("----STUDENT INFORMATION----");
		System.out.println("Student first name: " + firstName + "\nlast name: " + lastName + "\nadress: " + address
				+ "\nphone number: " + phoneNumber + "\ndate of birth: " + dateOfBirth + "\ne-mail: " + email + "\nID: "
				+ studentIdNumber + "\nsemestr I. GPA: " + semestr1GPA + "\nsemestr II. GPA: " + semestr2GPA);
	}

	// ...or by using getters!:

	public void studentInfoByGetters() {

		System.out.println("----STUDENT INFORMATION----");
		System.out.println("Student first name: " + getFirstName() + "\nlast name: " + getLastName() + "\nadress: "
				+ getAddress() + "\nphone number: " + getPhonenumber() + "\ndate of birth: " + getDateOfBirth()
				+ "\ne-mail: " + getEmail() + "\nID: " + getStudentIdNumber() + "\nsemestr I. GPA: " + getSemestr1GPA()
				+ "\nsemestr II. GPA: " + getSemestr2GPA()+"\nGPA: "+gpa(getSemestr1GPA(), getSemestr2GPA()));

	}
	
	public void enroll() {
		
		//we use Scanner and setters to input and set parameters 
		
		Scanner in = new Scanner (System.in);
		System.out.println("First name: ");
		String firstName = in.nextLine();
		setFirstName(firstName);
		System.out.println("Last name: ");
		String lastName = in.nextLine();
		setLastName(lastName);
		System.out.println("Date of birth: ");
		String birth = in.nextLine();
		setDateOfBirth(birth);
		System.out.println("Address: ");
		String adress = in.nextLine();
		setAddress(adress);
		System.out.println("Phone number: ");
		String phone = in.nextLine();
		setPhonenumber(phone);
		System.out.println("E-mail address: ");
		String email = in.nextLine();
		setEmail(email);
		System.out.println("Student ID number: ");
		int id = in.nextInt();
		setStudentIdNumber(id);
		System.out.println("Semester I GPA: ");
		char gpa1 = in.next().charAt(0);
		setSemestr1GPA(gpa1);
		System.out.println("Semester II GPA: ");
		char gpa2 = in.next().charAt(0);
		setSemestr2GPA(gpa2);
		
		//close Scanner object:
		in.close();
		
	}

}
