package packageMethodOveriding;

public class ClassC extends ClassB {


	public void add(int a,int b) {
		int c= a+b;
		System.out.println("Child Class Method:"+c);

}
	
	public void ClassBMethod() {
		System.out.println("Child Class Method called");
	}

}
