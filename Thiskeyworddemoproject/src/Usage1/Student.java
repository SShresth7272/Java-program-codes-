package Usage1;

public class Student {

	String name;
	int rollNo;
	int age;
	
	Student(String name,int rollNo,int age){
		
		this.name=name;
		this.rollNo=rollNo;
		this.age=age;
		
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(rollNo);
		System.out.println(age);
		}

}
