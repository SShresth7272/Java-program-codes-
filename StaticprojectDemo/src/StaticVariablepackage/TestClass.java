package StaticVariablepackage;

public class TestClass {

	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.stuName="James";
		obj.rollno=12345;
		System.out.println("Student Name:"+obj.stuName);
		System.out.println("Student Roll no:"+obj.rollno);
		System.out.println("Collage Name:"+Student.collageName);
		
	}

}
