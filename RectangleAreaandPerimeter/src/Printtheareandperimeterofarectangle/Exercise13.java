package Printtheareandperimeterofarectangle;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double width = 5.6;
		final double height = 8.6;
		
		double perimeter = 2*(height + width);
		double area = height * width;
		
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
		
	}

}
