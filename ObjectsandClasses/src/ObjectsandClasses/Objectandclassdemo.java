package ObjectsandClasses;

public class Objectandclassdemo {
	
	int n1=25;
	int n2=26;
	static int result;
	
	public void addition()
	{ result= n1+n2;}
	

	public static void main(String[] args) {
		
		Objectandclassdemo obj=new Objectandclassdemo();
		Objectandclassdemo obj1=new Objectandclassdemo();
	obj1.n1=10;
	obj1.n2=15;
	
	obj.addition();
	obj1.addition();
	
		
		System.out.println(result);
		
			}

}
