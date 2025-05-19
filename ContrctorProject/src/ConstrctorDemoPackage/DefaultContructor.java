package ConstrctorDemoPackage;

public class DefaultContructor {
	
	public String empName;
	public int empID;
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultContructor obj = new DefaultContructor();
		obj.display();
	}

}
