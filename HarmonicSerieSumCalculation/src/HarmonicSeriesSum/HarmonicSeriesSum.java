package HarmonicSeriesSum;

import java.util.Scanner;

public class HarmonicSeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a positive number n:");
		int n = input.nextInt();
		
		if(n<1) {
			System.out.println("error: n must be positive integer");
			return;
		}
		double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println("The sum of the series is: " + sum);
    }
			
			
		
		
		

	}


