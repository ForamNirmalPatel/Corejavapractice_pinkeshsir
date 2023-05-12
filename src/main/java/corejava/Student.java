package corejava;

import java.time.LocalDate;

public class Student {
	
	    private String firstName;
	    private String lastName;
	    private int rollNumber;
	    private LocalDate dateOfBirth;

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

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public LocalDate getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(LocalDate dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public void printStudentDetails() {
	    	System.out.println("FirstName: " + getFirstName() + "\n" + "LastName: " + getLastName() + "\n" + 
                    "RollNumber: " + getRollNumber() + "\n" + "Date Of Birth: " + getDateOfBirth() + "\n");
	    }
	    
	
}
