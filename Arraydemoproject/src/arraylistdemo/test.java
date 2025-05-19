package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj1= new Student("Student1",20,456);
		Student obj2= new Student("Student2",205,4565);
		Student obj3= new Student("Student3",207,4568);
		
		ArrayList<Student> arrList=  new ArrayList<Student>();
		
		arrList.add(obj1);
		arrList.add(obj2);
		arrList.add(obj3);
		
		
		 Iterator<Student> itr=arrList.iterator();
		 
		 while(itr.hasNext()) {
			 Student stu=itr.next();
			 System.out.println(stu.stuName);
			 System.out.println(stu.age);
			 System.out.println(stu.rollNo);
			 
		 }

	}

}
