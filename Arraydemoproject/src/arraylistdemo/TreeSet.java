package arraylistdemo;

import java.util.ArrayList;

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        TreeSet<Integer> hs= new TreeSet<>();
		
		hs.add(12);
		hs.add(78);
		hs.add(45);
		hs.add(45);
		hs.add(null);
		hs.add(null);hs.add(null);
		
		
		System.out.println(hs);
		
		for(Integer itr: hs) {
			System.out.println(itr);
			
		}
		System.out.println("getting particular elemrnt");
		
		ArrayList<Integer> ar= new ArrayList<>(hs);
		
		System.out.print(ar.get(2));

	}
		
		
	}


