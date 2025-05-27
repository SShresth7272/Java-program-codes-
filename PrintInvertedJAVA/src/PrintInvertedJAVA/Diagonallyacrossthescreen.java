package PrintInvertedJAVA;

public class Diagonallyacrossthescreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String word = "SHUBHAM";
	        int length = word.length();

	        // Loop through each character of the word
	        for (int i = 0; i < length; i++) {
	            // Print leading spaces to create the diagonal effect
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            // Print the current character
	            System.out.println(word.charAt(i));
	        }

	}

}
