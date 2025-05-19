package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arrlist= new ArrayList();
		
		arrlist.add(23);
		arrlist.add("acds");
		System.out.println(arrlist);
		
		ArrayList<Integer> arrlist1= new ArrayList<Integer>();
		
		arrlist1.add(12);
		arrlist1.add(15);
		arrlist1.add(78);
		arrlist1.add(189);
		arrlist1.add(152);
		arrlist1.add(178);
		arrlist1.add(156);
		arrlist1.add(1639);
		
		
		System.out.println(arrlist1);
		
		//access an element is an arraylist
		
		System.out.println(arrlist1.get(2));
		//update an element
		System.out.println(arrlist1.set(0, 56));
		System.out.println(arrlist1);
		
		//count number of elements
		
		System.out.println(arrlist1.size());
		
		//traverse an array list
		//1.for loop
		for(int i=0; i<arrlist1.size();i++) {
			System.out.print(arrlist1.get(i));
			System.out.print(" ");
			
			
			// Using Itretrator
			
			Iterator itr=arrlist1.iterator();
			
			while(itr.hasNext()){
				System.out.print(itr.next());
				System.out.print(" ");
				
			}
		}
		
		
		
		
	}

}
