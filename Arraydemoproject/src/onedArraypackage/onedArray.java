package onedArraypackage;

public class onedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaration of an array
		int a[];
		int []b;
		//Instaantion of an array
		a = new int[5];
		//Declaration and Instantion 
		int c[]= new int[6];
	//how to add elements
		c[0]=10;
		c[2]=89;
		c[1]=145;
		c[3]=789;
		c[4]=456;
		c[5]=852;
		//how to retrive the elements
		System.out.println(c[2]);
		//How to print your array
		for (int i=0; i<c.length;i++) {
			System.out.println(c[i]+" ");
		}
		
		//array literals
		int d[]= {12, 23, 56, 75};
		
	}

}
