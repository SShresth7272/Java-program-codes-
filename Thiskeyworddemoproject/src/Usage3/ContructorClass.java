package Usage3;

public class ContructorClass {
	
	ContructorClass(){
		this(5);
		System.out.println("Default constructor");
	}
	
	ContructorClass(int a){
		System.out.println("Parameterized constructor, and the value of a:"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContructorClass obj = new ContructorClass();
	}

}
