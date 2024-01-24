package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		
		int remainderFour = x % 4;
		int remainderHundred = x % 100;
		int remainderFourHundred = x % 400;
		boolean isOrdered = (remainderFour == 0) && (remainderHundred != 0) || (remainderFourHundred == 0);
		System.out.println(x + " is a leap year: " + isOrdered);
	}

}
