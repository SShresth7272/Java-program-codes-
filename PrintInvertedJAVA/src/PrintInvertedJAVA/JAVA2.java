package PrintInvertedJAVA;

public class JAVA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String word = "SHUBHAM";
	        int length = word.length();

	        for (int i = length; i > 0; i--) {
	            // Print leading spaces
	            for (int j = 0; j < length - i; j++) {
	                System.out.print(" ");
	            }

	            // Print the word characters
	            for (int j = 0; j < i; j++) {
	                System.out.print(word.charAt(j) + " ");
	            }

	            // Move to the next line
	            System.out.println();
	        }
	}

}
