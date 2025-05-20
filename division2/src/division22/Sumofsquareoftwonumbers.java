package division22;

import java.util.Scanner;

public class Sumofsquareoftwonumbers {

	private static Scanner input;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

		System.out.println("Input the first number");
		int a = input.nextInt();
		
		int c =(a*a);
		System.out.println();System.out.println("the square of a is:"+ c);
		
		System.out.println("Input the second number");
		int b = input.nextInt();
		
		int d =(b*b);
		System.out.println();System.out.println("the square of b is:"+ d);
		
		
		int e =(c+d);
		System.out.println("the sum of square is:"+e);
		
	}

}
