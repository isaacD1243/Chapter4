package GameZone;

import java.util.Scanner;

public class RandomGuess2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		
		String result = null;
		
		computerSecret = (int)(Math.random()* 10 + 1);
		
				Scanner input = new Scanner(System.in);
		
		
		int quit;
		do {
		System.out.println("Pick a number any number aslong as its no higher than 10! >> ");
		userGuess = input.nextInt();
		
		if (userGuess < computerSecret) {
			result = "This number is higher";
			
		}
		else if (userGuess > computerSecret) 
		{
			result = "The number is lower";
			
		}
		else if (userGuess == computerSecret) {
			result = "You Win!";
			
		}
		displayMessage(result);
		System.out.println("do you want to quit 1 for yes 2 for no. >>");
		quit = input.nextInt();
		}while(1 != quit);
	}
		
public static void displayMessage(String result) {
	System.out.println(result);
}
}
