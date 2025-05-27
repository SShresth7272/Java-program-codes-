package mathematicalcomparision;

public class formulacomparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] testValues = {1.0, 2.0 ,3.0, 5.0, 10.0};
		
		 System.out.println("Comparing formula results:");
	        System.out.println("Value\tFormula 1\tFormula 2\tDifference");
	        System.out.println("-----------------------------------------------");

	        for (double x : testValues) {
	        	double formula1 = Math.pow(x, 2) + 2 * x + 1;
	        	double formula2 = Math.pow(x + 1, 2);
	        	double difference = Math.abs(formula1 - formula2);
	        	System.out.printf("%.2f\t%.4f\t%.4f\t%.6f%n", 
                        x, formula1, formula2, difference);
	        }
	        	
	        	 System.out.println("\nAnother comparison:");
	             System.out.println("Value\tSin(x)\t\tCos(x)\t\tDifference");
	             System.out.println("-----------------------------------------------");
	             
	             for (double x : testValues) {
	                 double sinX = Math.sin(x);
	                 double cosX = Math.cos(x);
	                 double diff = Math.abs(sinX - cosX);
	                 
	                 System.out.printf("%.2f\t%.4f\t%.4f\t%.6f%n", 
	                                  x, sinX, cosX, diff);
	        }
	}

	}
