package javapackage;

public class VariableDemo {
	
	//Global variable
	 static int k=20;

	public static void main(String[] args) {
		VariableDemo obj= new VariableDemo();
		obj.method1();
		obj.method2();
		System.out.println("The value of k is :" +k);
	}
public void method1() {
	//int i;//Declaration
	//i=10;//Initialization
	//Local variable
	
	int j=10;
	System.out.println("The value of j is :" +j);
	System.out.println("The value of k is :" +k);
    }
    public void method2()
    {
    	System.out.println("The value of k is :" +k);
    }
}
