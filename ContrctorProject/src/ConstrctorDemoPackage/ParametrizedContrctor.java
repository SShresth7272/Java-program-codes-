package ConstrctorDemoPackage;

public class ParametrizedContrctor {
	
	public String empName;
	public int empID;
	
	ParametrizedContrctor(String newName, int newID){
		empName=newName;
		empID=newID;
	}
	
	
	
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		ParametrizedContrctor obj = new ParametrizedContrctor("James", 12345);
		obj.display();
	}

}
