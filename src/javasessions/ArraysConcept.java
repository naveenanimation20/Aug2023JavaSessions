package javasessions;

import java.util.Arrays;

public class ArraysConcept {

	public static void main(String[] args) {

		
		//Array: collection of similar types of data:
		//limitations:
		//1. size is fixed: static array: to overcome this, we use dynamic array (ArrayList)
		//2. can store only similar types of data
		
		
		//1. using new keyword:
		//li = 0; hi = len-1 = 4-1 = 3; len = hi+1 = 4
		int i[] = new int[4]; //0-3
		
		//i[-1] = 60;//AIOB
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		//i[4] = 50;//AIOB
		
		System.out.println(i.length);//4
		
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException: AIOB

		System.out.println(i[0]+i[1]);
		
		//fetch/print all the values of array: use for loop:
		//System.out.println(i);//garbage / memory address of the array
		System.out.println(Arrays.toString(i));
		
		//using for loop:
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);//10 20 Hi 30 40
				if(i[k] == 20) {
					System.out.println("hi");
					break;
				}
		}
		
		
		//
		int pop[] = new int[5];
		pop[0] = 100;
		pop[1] = 200;
		pop[2] = 200;
		pop[4] = 500;
		
		System.out.println(Arrays.toString(pop));
		
		String lg[] = new String[3];
		System.out.println(lg[0]);
		
		
		
		
		
		
		
	}

}
