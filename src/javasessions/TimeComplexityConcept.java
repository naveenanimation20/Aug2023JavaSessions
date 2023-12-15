package javasessions;

import java.util.Arrays;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		//TC: 
		// time
		// data/input data: 
		
		//D --   T
		//10  --  2
		//100 --  5
		//1000 -- 10
		//10000 -- 30
		//1M ---- 100
		
		//Big O -> Oh
		
		int i = 10;
		System.out.println(i);
		//constant time: O(1)

		String s = "Naveen";//O(1)
		
		//20 secs --> 0.0000001
		for(int p=1; p<=10000000; p++) {
			System.out.println(p);
			int q = 10;
			
		}
		//1 + n + n + n ==> 3n+1 ==> Linear Equation
		//3n+1 ~ 3n ==> O(n)
		
		
		//
		
		int num[][] = {
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[0].length; col++) {
				System.out.print(num[row][col] + " ");//[0][0]=1 2 3
			}
			
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n+n)=> (1+3n)(1+3n)=>1+3n+3n+9n^2
		//9n^2+6n+1 (Quadratic eq) => 9n^2+6n => 3n(3n+2)=> 3n(3n)=>9n^2 ==> O(n^2)
		
		
		System.out.println("=--------");
		//
		for(int row=0; row<=5; row++) {
			for(int col=0; col<=5; col++) {
				for(int dim=0; dim<=5; dim++) {
					System.out.print(row+""+col+""+dim);
				}
			}
			
			System.out.println();
		}
		
		//(1+n+n+n)(1+n+n)(1+n+n+n)=> (1+3n)(1+2n)(1+3n)=> n^3+n^2+n+1 (Qubic eq)
		//O(n^3)
		
		//Binary Search: O(log n) --> 
		
		
		//1 to 100:
		//Azmat: 0th: best case
		//Azmat: 50th: Avg case
		//Azmat: 99th: worst case ---> Big O
		
		
		//Binary Search: O(log n) --> 

		//Linear Search: O(n) 
		
		//0 to 15: 16 elements 
		
		//n --> n/2 ---> n/4 --> n/8 
		//k = n/2
		//log k = log(n/2)
		//log k = log n - log 2
		//log k = log n
		//TC = O(log n): with base k
		
		//space complexity: variables  space
		//Auxiliary Space: class + variables + all other spaces
		
		int m = 10;//1
		switch (m) {//1
		case 10://1
			
			break;

		default:
			break;
		}
	}

}
