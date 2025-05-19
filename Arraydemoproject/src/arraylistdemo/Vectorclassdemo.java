package arraylistdemo;

import java.util.Vector;

public class Vectorclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Vector<Integer> vector= new Vector<Integer>();
   vector.add(13);
   vector.add(14);
   vector.add(99);
   vector.add(null);
   vector.add(99);
   vector.add(99);
   vector.add(99);
   vector.add(99);
   vector.add(99);
   vector.add(99);
   
   
   System.out.println(vector);
   
   vector.clear();
   System.out.println(vector);
   
   System.out.println(vector.capacity());
   
   //Iterate
   for(Integer itr:vector) {
	   System.out.print("itr");
	   System.out.print(" ");
   }
   
   
   
	}

}
