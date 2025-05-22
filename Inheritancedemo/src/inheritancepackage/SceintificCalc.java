package inheritancepackage;

public class SceintificCalc extends AdvanceCalc {
	
	public int division(int a ,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		
		
		SceintificCalc obj= new SceintificCalc();
		System.out.println("Addition is:" +obj.addition(7,9));
		System.out.println("Multiplication is:" +obj.multiplication(7,9));
		System.out.println("Division is:" +obj.division(7,9));
	}

}
