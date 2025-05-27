package SwappingValues;

import java.util.Scanner;

public class withoutusingoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a, b;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number");
		a = input.nextInt();
		
		System.out.println("Input the second number");
		b = input.nextInt();
		
		 System.out.println("Before swap: a = " + a + ", b = " + b);
	        
	        // XOR swap algorithm
	        a = a ^ b;
	        b = a ^ b;  // Now b contains original a
	        a = a ^ b;  // Now a contains original b
	        
	        System.out.println("After swap: a = " + a + ", b = " + b);

	}

}
