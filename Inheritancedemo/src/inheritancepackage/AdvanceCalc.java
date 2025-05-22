package inheritancepackage;

public class AdvanceCalc extends Calc {
	
	  //public int addition(int a, int b) {
      	//return a + b;
     // }
	  
	  public int multiplication(int a, int b) {
      	return a * b;
      }

	public static void main(String[] args) {
		
		AdvanceCalc obj= new AdvanceCalc();
		System.out.println("Addition is:" +obj.addition(7,9));
		System.out.println("Multiplication is:" +obj.multiplication(7,9));
		//obj.addition(7,9);
		//obj.multiplication(7,9);
		
		
	}

}
