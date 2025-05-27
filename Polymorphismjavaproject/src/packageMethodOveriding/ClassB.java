package packageMethodOveriding;

public class ClassB {

	public void add(int a,int b) {
		int c= a+b;
		System.out.println("Parent Class Method:"+c);

}
	
	public void ClassBMethod() {
		System.out.println("Parent Class Method called");
	}
}