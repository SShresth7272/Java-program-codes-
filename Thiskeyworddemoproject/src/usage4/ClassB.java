package usage4;

public class ClassB {
	
	public void methodA(ClassB obj
			) {
		System.out.println("this is method A");
	}
	
	public void methodCall() {
		methodA(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj1 = new ClassB();
		obj1.methodCall();
	}

}
