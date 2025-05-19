package ConstrctorDemoPackage;

public class OverloadingConstrctor {
	
	public String empName;
	public int empID;
	public int age;
	
	OverloadingConstrctor(String newName, int newID){
		empName=newName;
		empID=newID;
	}
	
	
	OverloadingConstrctor(String newName, int newID, int newAge){
		empName=newName;
		empID=newID;
		age=newAge;
	}
	public void display() {
		System.out.println(empName);
		System.out.println(empID);
		System.out.println(age);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingConstrctor obj = new OverloadingConstrctor("Emp1",12345);
		OverloadingConstrctor obj1 = new OverloadingConstrctor("Emp1",12345,56);
		obj1
		
		.display();
	}

}
