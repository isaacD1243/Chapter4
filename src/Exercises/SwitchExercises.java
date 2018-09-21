package Exercises;

import java.util.Scanner;

public class SwitchExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your ID? >>");
		id = input.nextInt();
		String result;
		switch(id)
		{
		case 129001:
			result = "Isaac Dibbern";
			break;
		case 316338:
			result = "Logan DeWilfond";
			break;
		case 155706:
			result = "Joseph Chalupa";
			break;
		case 274891:
			result = "Jason Wells";
			break;
		case 137112:
			result = "Adum Burton";
			break;
		case 137160:
			result = "Zach Canada";
			break;
		case 153178:
			result = "Jayden Graap";
			break;
		case 159343:
			result = "Giovanni Jacobsen";
			break;
		case 274871:
			result = "Tavius Sterling";
			break;
		case 153182:
			result = "Orion Gardner";
			break;
		case 274904:
			result = "Amia Combs";
			break;
		default:
			result = "not available";
			
		
		}
			System.out.println(result);
}

}
