package Practice;

import java.util.Scanner;

public class AgeGame 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int usersAge;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12) 
		{
			result = "You are a child! Go away";
		}
		else if (usersAge >= 13 && usersAge <= 18) 
		{
			result = "You are a snotty teen hahahahaha";
		}
		else if(usersAge >= 19 && usersAge <= 25) 
		{
			result = "Get a job!";
		}
		else if(usersAge >= 26 && usersAge <= 30) 
		{
			result = "Get a girl friend";
		}
		else if(usersAge >= 30 && usersAge <= 40) 
		{
			result = "Don't get gray hairs";
		}
		else if (usersAge >= 41 && usersAge <= 50) 
		{
			result = "Don't get fat";
		}
		else if (usersAge >=51 && usersAge <= 60) 
		{
			result = "Finnaly dead?";
		}
		displayMessage(result);
		
	}
	public static void displayMessage(String result) {
		String usersAge = null;
		System.out.println(usersAge + result);
	}
}

