package FlowControlPackage;

public class nestedelseif {

	public static void main(String[] args) {
		
		int n1=38, n2=5, n3=88, largestNo;
		
		if(n1>n2) {
			if(n1>n3) {
				largestNo=n1;
			} else {
				largestNo=n3;
			}
		} else {
			if (n2>n3) {
				largestNo=n2;
			} else {
				largestNo=n3;
			}
		}
		
		System.out.println("Largest no is" +largestNo);

	}

}
