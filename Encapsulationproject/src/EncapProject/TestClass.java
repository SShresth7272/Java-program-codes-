package EncapProject;

public class TestClass {

	public static void main(String[] args) {
		
		Student obj = new Student()	;
         obj.setStuName("den");
         obj.setStuRollNo(78);
         obj.setStuAge(45);
         
         System.out.print("Student Name is:"+obj.getStuName());
         System.out.print("Student Age is:"+obj.getStuAge());
         System.out.print("Student RollNO is:"+obj.getStuRollNo());
	}

}
