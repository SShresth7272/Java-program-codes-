package javaStringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String str1="Hello guys ";
		String str2="Welcome to home";
		
		//boolean result= act.equalsIgnoreCase(exp);
		
		System.out.println(str1.concat(str2));
		System.out.println(str1.charAt(6));
		System.out.println(str2.contains("Java"));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str2);
		System.out.println(str2.trim());
		System.out.println(str2);
		System.out.println(str2.substring(7));
		System.out.println(str2);
		System.out.println(str2.startsWith("Welcome"));
		System.out.println(str2.startsWith("Hello"));
		System.out.println(str2.endsWith("Welcome"));
		System.out.println(str2.length());
		System.out.println(str2.replace("W","K"));
		

	}

}
