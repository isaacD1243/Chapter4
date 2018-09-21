package Practice;

import java.util.Scanner;

public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		String result = null;
		int chestChoice;
		int bookChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door.  \n1- for door one\n2- foor door two\n3- foor door three");
		doorChoice = input.nextInt();
		
		
		if(doorChoice == 1)
		{	
			System.out.println("Door 1 good choice choose among the following Chests.");
			System.out.println("1- For Chest One/n2 Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
				result = "pile of gold";
			}
			else if(chestChoice ==2) 
			{
				result = "EMPTY Hahahahahahahahahaha";
			}
			else if(doorChoice == 999) {
				System.out.println("You enter a special room wiht 3 books on the table, there are"
						+ "words on hte cover. Do you choose Book 1, Book 2, or Book 3?");
				bookChoice =input.nextInt();
				if(bookChoice == 1) 
				{
					result = "Long terible book you have to read!";
				}
				else if (bookChoice == 2) 
				{
					result = "You DIEEE!";
				}
				else if (bookChoice == 3) 
				{
					result = "Also Death!";
				}
			}
			else 
			{
				result = "just kidding, i said 1 or 2!, now die!";
			}
		
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
