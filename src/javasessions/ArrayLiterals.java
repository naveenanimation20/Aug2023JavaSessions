package javasessions;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//with new keyword:
		//when you are not sure about the values
		int i[] = new int[10]; //0-9

		
		//array literals: when you are already having the values
		//int array:
		int num[] = {1,2,3,4,5,6};//0-5
		System.out.println(num[2]);
		System.out.println(num[5]);
		//System.out.println(num[6]);//AIOB
		System.out.println(num.length);
		
		System.out.println(num);
		System.out.println(Arrays.toString(num));
		for(int e : num) {
			System.out.println(e);
		}
		
		String stNames[] = {"Sudheer", "RAvi", "Naveen", "Tom"};
		
		Object empInfo[] = {"Neha", 25, 34.55, true, 'f'};
		
		//
		int number[] = {1,2,3,4,5,6,7,8,9,10};//0-9==>10
		for(int r = number.length-1;  r>=0 ; r--) {
			System.out.println(number[r]);//10
		}
		
		
		
		

		
	}

}
