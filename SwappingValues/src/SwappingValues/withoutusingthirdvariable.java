package SwappingValues;

import java.util.Scanner;

public class withoutusingthirdvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x, y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the first number");
		x = input.nextInt();
		
		System.out.println("Input the second number");
		y = input.nextInt();
		
		
			//x = 85;
		   // y = 100;
		    
		    System.out.println("Before swapping : x, y = " + x + ", " + y); 
		    
		    x = x + y;
		    y = x - y;
		    x = x - y;
		    
		    System.out.println("After swapping : x, y = " + x + ", " + y);
	

	}

}
