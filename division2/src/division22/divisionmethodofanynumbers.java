package division22;

import java.util.Scanner;

public class divisionmethodofanynumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Input the first number");
		int a = input.nextInt();
		
		System.out.println("Input the second number");
		int b = input.nextInt();
		
		int d = (a/b);
		
		System.out.println();
		System.out.println("the division of a and b is:"+ d);
		

	}

}
