package packageMethodOverloading;

public class TestClass {

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.add(5, 6);
		obj.add(5, 9, 6);
		obj.add(6.3, 5, 9);
		obj.add(6.3, 5, 9.7);
		

	}

}
