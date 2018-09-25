package Exercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
		int parkCost = 150000;
		int golfCost = 170000;
		int lakeCost = 210000;
		int quit =0;
		String result = null;
		
		
		Scanner input = new Scanner(System.in);
		
		do {
		System.out.println("Chose a view for your new condo. \n1- parkview \n2- golfcourseview \n3- "
				+ "lakeview.");
		userChoice = input.nextInt();
		
		if(userChoice == 1) 
		{
			result = "Park View For $" + parkCost + " ! "; 
		}
		else if(userChoice == 2) 
		{
			result = "Golf Course View For $" + golfCost + " ! ";
		}
		else if(userChoice == 3) 
		{
			result = "Lave View For $" + lakeCost + " ! ";
		}
		displayMessage(result);
		System.out.println("are you sure you want" + userChoice + "\n1 -Yes \n2- no");
		}while(1 != quit);
		
	}
public static void displayMessage(String result) {
	System.out.println(result);
}
}
