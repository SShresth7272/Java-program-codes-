package arraylistdemo;

import java.util.LinkedList;

public class linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<String> llist= new LinkedList<String>();
     llist.add("C");
     llist.add("C++");
     llist.add("java");
     llist.add("python");
     
     //print values 
     System.out.println(llist);
     
     llist.addFirst("abc");
     System.out.println(llist);
     
     llist.addLast("efghjkk");
     System.out.println(llist);
     
     // Iterate
     for(int i=0; i<llist.size();i++) {
    	 System.out.println(llist.get(i));
     }
     
	}

}
