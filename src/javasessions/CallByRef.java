package javasessions;

public class CallByRef {

	public static void sendMail(CallByRef a) {
		System.out.println("send mail");
		
		a.readMail();
	}

	public void readMail() {
		System.out.println("read mail");
		
	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		CallByRef.sendMail(obj);
		
		
		
		

	}

}
