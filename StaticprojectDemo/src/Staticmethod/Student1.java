package Staticmethod;

public class Student1 {

	String stuName;
	int rollno;
	static String collageName="ABC";
	
	static void Staticmethod() {
		collageName="xyz";
	}
	
	Student1(String newName, int newRollno){
		stuName=newName;
		rollno=newRollno;
	}
	public void display() {
		System.out.println(stuName);
		System.out.println(rollno);
		System.out.println(collageName);
		
	}

}
