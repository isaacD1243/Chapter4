package Exercises;
import java.util.Scanner;
public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mins;
		int txtMessages;
		int dataUsage;
		String result = null;
		Scanner input = new Scanner(System.in);
		System.out.println("How many minutes do talk on the phone?>>");
		mins = input.nextInt();
		System.out.println("How many texts do you send?>>");
		txtMessages = input.nextInt();
		System.out.println("How much data do you use?>>");
		dataUsage = input.nextInt();
		
		showMessage(result);
	
		
		if (mins < 500 && dataUsage == 0 && txtMessages==0) 
		{
			result = "You need plan A";
		}
	
	}
public static void showMessage(String result) 
{
	System.out.print(result);
}
}
