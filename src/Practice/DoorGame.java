package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door.  \n1- for door one\n2- foor door two\n3- foor door three");
		doorChoice = input.nextInt();
		
		
		if(doorChoice == 1)
		{	
		result = "pile of gold";
		}
		else if(doorChoice == 2)
		{
			result = "Donkey";
		}
		
		else if(doorChoice == 3 ) 
		{
			result = "Long fas food line";
		}
		
		else 
		{
				result = "Nothing that was not a choice";
		}
			
			displayMessage(result);
	}
public static void displayMessage(String result) {
	System.out.println("you won " + result);
	
}
}
