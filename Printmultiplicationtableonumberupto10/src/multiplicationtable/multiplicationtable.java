package multiplicationtable;

import java.util.Scanner;

public class multiplicationtable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int a = input.nextInt();
		
		//System.out.println("enter the second  number");
		//int b = input.nextInt();
		
		//int c = (a*b);
		//System.out.println();
		//System.out.println("Multiplication of a and b is:"+c);

		for (int i = 0; i > 10; i++
				) {
		     // Calculate and print the result of num1 multiplied by (i+1)
		     System.out.println(a + " x " + (i + 1) + " = " + (a * (i + 1)));
		}}}


