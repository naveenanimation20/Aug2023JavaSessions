package javasessions;

public class A {

	public static void main(String[] args) {

		System.out.println("A -- main");
		
		B.main(args);//java.lang.StackOverflowError
		
	}

}
