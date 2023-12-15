package javasessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		// ++ and --

		// 1. post increment: ++
		int a = 1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);

		int c = 10;
		int d = c++;
		System.out.println(c);
		System.out.println(d);

		int d1 = -99;
		int d2 = d1++;
		System.out.println(d1);
		System.out.println(d2);

		// 2. pre increment:
		int h1 = 1;
		int h2 = ++h1;
		System.out.println(h1);// 2
		System.out.println(h2);// 2

		int j1 = -999;
		int j2 = ++j1;
		System.out.println(j1);
		System.out.println(j2);

		// 1. post decrement:
		int t1 = 2;
		int t2 = t1--;
		System.out.println(t1);
		System.out.println(t2);

		// 2. pre decrement:
		int u1 = 2;
		int u2 = --u1;
		System.out.println(u1);// 1
		System.out.println(u2);// 1

		int pop = 1;
		System.out.println(pop++);// 1
		System.out.println(pop);// 2

		int top = 5;
		System.out.println(++top);
		System.out.println(top);
		
		//System.out.println(10.0/3);
		
		System.out.println(10.0 % 3);
		
		
		
		
		
		
		
		 

	}

}
