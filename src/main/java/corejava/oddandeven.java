package corejava;

import java.util.Scanner;

public class oddandeven {

	public static void main(String[] args) {
		
	// Java Program to check whether the given number is even or odd
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Number");
		
		int num=s.nextInt();
		s.close();
		
		if(num % 2==0)
		{
			System.out.println("Number is Even");
		}
		
		else {
			System.out.println("Number is Odd");
		}

	}

}
