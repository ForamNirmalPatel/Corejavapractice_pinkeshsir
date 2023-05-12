package corejava;

import java.time.LocalDate;

public class StudentObje {

	public static void main(String[] args) {
		
		Student stud1 = new Student();
		
		stud1.setFirstName("Foram");
		stud1.setLastName("Patel");
		stud1.setRollNumber(65);
		stud1.setDateOfBirth(LocalDate.of(1999, 05, 06));
		
		
		Student stud2 = new Student();
		
		stud2.setFirstName("Nirmal");
        stud2.setLastName("Patel");
        stud2.setRollNumber(61);
        stud2.setDateOfBirth(LocalDate.of(1996, 01, 06));
        
        
        stud1.printStudentDetails();
        stud2.printStudentDetails();

	}

}
