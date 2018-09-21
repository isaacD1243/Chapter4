package Exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		x = input.nextInt();
		if(0 == x%2) 
		{
			System.out.println("The answer is even");
		}
		else if (x == 1) 
		{
			result = "the answer is odd";
		}
		displayMessage(result);
		
				
	}
public static void displayMessage(String result) {
	System.out.println(result);
}
}
