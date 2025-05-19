package arraylistdemo;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs= new HashSet<>();
		
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
