package packageMethodOverloading;

public class ClassA {

	public void add(int a,int b) {
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void add(int a,int b, int c) {
		int x= a+b+c;
		System.out.println(x);

	}
	
	public void add(double a,int b, int c) {
		double x= a+b+c;
		System.out.println(x);
	
}
	
	public void add(double a,int b, double c) {
		double x= a+b+c;
		System.out.println(x);
}
	
	
}