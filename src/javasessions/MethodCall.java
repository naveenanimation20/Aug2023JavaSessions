package javasessions;

public class MethodCall {
	
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		//m1();
		t1();
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	public static void t2() {
		System.out.println("t2 method");
		MethodCall obj = new MethodCall();
		obj.m1();
	}
	
	

	public static void main(String[] args) {

		MethodCall obj = new MethodCall();
		obj.m1();


	}

}
