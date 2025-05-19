package AreaandPerimeter;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
      System.out.println("Radius of the circle is"  +" ");
      double radius = input.nextDouble();
      
      
      double perimeter = 2*Math.PI*radius;
      System.out.println("Perimeter is="  + perimeter);
      
      double area = Math.PI*radius*radius;
      System.out.println("area is="  + area);
      
      
      
	}

}
