package task;

public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student("Natalia", "Welter", "08.05.1986", "Wyżynna 13/37 Lublin", "7799273", "nata@wp.pl", 28732, 'A', 'A');
		student.studentInfo();
		System.out.println(student.isValidID(student.getStudentIdNumber()));
		student.studentInfoByGetters();
		
		
		Student studentEnroll = new Student();
		studentEnroll.enroll();
		studentEnroll.studentInfoByGetters();
		
		
		
	}

}
