package Usage2;

public class ClassA {
	
	public void methodA() {
		System.out.println("Method A");
	}
	public void methodB() 
	
	{    this.methodA();
		System.out.println("Method B");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj = new ClassA();
		obj.methodB();
	}

}
