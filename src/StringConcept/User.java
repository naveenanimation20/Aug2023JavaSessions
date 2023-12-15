package StringConcept;

public class User {

	public static void main(String[] args) {

		//String: is a class
		
		
		//1. using literals:
		String s2 = "Selenium"; //1
		
		//2. using new keyword
		String s1 = new String("Hello");//2 - heap, scp
		
		String s3 = "Hello";//0
		String s4 = new String("Hello");//1- heap
		
		System.out.println(s1 == s3);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1 == s4);//false
		System.out.println(s1.equals(s4));//true

		String s5 = "Hello";//0
		System.out.println(s3 == s5);//true
		System.out.println(s1.equals(s5));//true

		String s6 = "hello";//1 in SCP
		
		String s7 = new String("Naveen");//2 - heap, scp
		
		String s8 = s7.intern();
		System.out.println(s7 == s8);//false
		
		
		String str = "Hello";
//		str = str+"Selenium";//HelloSelenium
//		System.out.println(str);
		
		System.out.println(str+100);//Hello100
		System.out.println(str+200);
		
		//
		StringBuilder sb = new StringBuilder("Testing");//1
		System.out.println(sb.append(2));
		//System.out.println(sb.append("Automation"));
		System.out.println(sb);
		
		
		
		String gg = "Naveen";
		System.out.println(gg.concat("2"));
		System.out.println(gg);
		
		
	}

}
