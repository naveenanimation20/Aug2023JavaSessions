package javasessions;

public class MathematicalOperators {

	public static void main(String[] args) {

		System.out.println(10/2);//5
		System.out.println(9/2);//4.5-->4
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2);//4.5
		System.out.println(9.0/2.0);//4.5

		//System.out.println(9/0);//ArithmeticException: / by zero
		System.out.println(0/9);//0
		
		//System.out.println(0/0);////ArithmeticException: / by zero
		
		System.out.println(9.0/0);//Infinity
		System.out.println(9/0.0);//Infinity
		System.out.println(9.0/0.0);//Infinity
		System.out.println(0/0.0);//NaN --> Not a number
		System.out.println(0.0/0.0);//NaN --> Not a number
		
		System.out.println(10.3/0);//Infinity
		System.out.println(10/0.0);//Infinity
		
		System.out.println('a'/2);//97/2=48
		
		//System.out.println('a'/0);//97/0 = AE
		
		System.out.println('a'/2+100);//48+100=148
		
		System.out.println(10 % 2);
		System.out.println(9 % 2);
		System.out.println(100 % 3);
		System.out.println(10 % 3);

		
		
		
		
		
	}

}
