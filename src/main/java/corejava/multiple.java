package corejava;

import java.util.Scanner;

public class multiple {

	public static void main(String[] args) {
		
	 // Java Program to checke whether the given integer is multiple of both 5 and 7	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int num=s.nextInt();
		s.close();
		
		if (num % 5==0 && num % 7==0)
		{
			System.out.println("Yes");
		}
		
		else {
			System.out.println("No");
		}
	}

}
