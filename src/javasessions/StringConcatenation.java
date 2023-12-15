package javasessions;

public class StringConcatenation {

	public static void main(String[] args) {

		
		String s = "hi this is naveen here";
		String s1 = "100";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		double c = 12.33;
		double d = 22.22;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+x);
		System.out.println(a+x+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//HelloSelenium100200
		System.out.println(x+y+(a+b));//HelloSelenium300
		
		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
		
		System.out.println(c+d+x+y);
		System.out.println(c+d+x+y+c+d);//34.55HelloSelenium12.3322.33

		System.out.println(a+b+c+d+x+y);
		
		System.out.println("the value of a " + a);
		System.out.println("the value of b " + b);
		System.out.println("the sum is: " + (a+b));
		
		char c1 = 'a';
		char c2 = 'b';
		System.out.println(c1);//a
		System.out.println((byte)c1);//97
		System.out.println(c1+c2);//97+98=195
		System.out.println(c1+1);//97+1=98
		System.out.println(c1+"1");//a1
		System.out.println(c1+c2+x+y);//195HelloSelenium
		
		System.out.println(c1+" "+c2);//ab
		System.out.println("c1"+"c2");
		
		


	}

}
