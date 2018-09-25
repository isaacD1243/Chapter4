package Debugging;

import java.util.Scanner;

public class Debug2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
	      int num2;
	      Scanner input = new Scanner(System.in);
	      System.out.print("Enter a number ");
	      num = input.nextInt();
	      System.out.print("Enter another number ");
	      num2 = (int) input.nextDouble();
	      if((num % num2 >= 0) | (num2 / num2) >= 0)
	         System.out.println("One of these numbers is evenly divisible into the other");
	         else if ((num % num2 <= 0) | (num2 / num2) <=0)
	         System.out.println("Neither of these numbers is evenly divisible into the other");
	}

}
