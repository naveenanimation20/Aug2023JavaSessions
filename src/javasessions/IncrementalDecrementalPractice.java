package javasessions;

public class IncrementalDecrementalPractice {

	public static void main(String[] args) {

//		
//		int i = 11;
//		int j = i++ + ++i;
//		System.out.println(j);
		
		
//		int a=11, b=22, c;
//		
//		c = a + b + a++ + b++ + ++a + ++b;
//		  //11+ 22 + 11	+ 22 + 13 + 24
//		
//		System.out.println("a=" + a);//a=13
//		System.out.println("b=" +b);//24
//		System.out.println("c=" +c);//103
		
		//
//		int j = 0;//0
//		int k = j++ - --j + ++j - j--;
//			//k=
//		System.out.println(k);
//		System.out.println(j);
		
//		boolean g = true;
//		System.out.println(g++);
		
		int i=19, j=29, k=0;
		int m = i-- - j-- - k--;
		//  m =     
		System.out.println("i=" + i);//i=19

		System.out.println("j="+j);

		System.out.println("k="+k);
		System.out.println(m);
		
//		
//		int m = 0, n = 0;
//		int p = --m * --n * n-- * m--;
//		System.out.println(p);
//		System.out.println(m);
//		System.out.println(n);
		
		
		
//		int a=1;
//		int b = a++ + ++a * --a - a--; 
//		System.out.println(b);
//		System.out.println(a);
//
//		
//		int ch = 'A';//65
//		System.out.println(ch++);
//		System.out.println((char)ch);
//		
		
		
		char ch1 = 'A';//65
        System.out.println(ch1++);//A
        System.out.println(ch1);//B

//        
//		
        double d = 1.5, D = 2.5;
        
        double d1 = ++d + ++D;
        	//d1 = 	2.5 + 3.5 = 6.0
        System.out.println(d1);
        System.out.println(d);
        System.out.println(D);
        
        
	}

}
