package twodArray;

public class twodArraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration of an array
				int a[][];
				int [][]b;
				//Instaantion of an array
				a = new int[5][];
				//Declaration and Instantion 
				int c[][]= new int[2][2];
				
				int d[][]= {{2,3},{5,6},{7,8}};
				
				for (int i=0; i<3; i++) {
					for(int j=0; j<2; j++) {
						System.out.println(d[i][j]+" ");
					}
					System.out.println();
				}
				
	}

}
