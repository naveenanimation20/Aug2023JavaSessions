package javasessions;

import java.util.Arrays;

public class TwoDimArrayConcept {

	public static void main(String[] args) {

		int arr[][] = new int[4][5];
		arr[0][0] = 100;
		arr[0][1] = 200;
		
		System.out.println(arr.length);

		//Array Literals:
		
		int num[][] = {
				{1,2,3},
				{2,3,4},
				{4,5,6}
		};
		
		System.out.println(num.length);
		
		System.out.println(Arrays.deepToString(num));

		//to iterate 2D array: use two loops: outer-inner loops
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[0].length; col++) {
				System.out.print(num[row][col] + " ");//[0][0]=1 2 3
				//break;
			}
			
			System.out.println();
		}
		
		
		Object empInfo[][] = {
				{"Neha", 25, "SDET1", true},
				{"Vijay", 27, "SDET2", false},
				{"Rahul", 28, "SDET Manager", true}
		};
		
		
		
		for(int row=0; row<empInfo.length; row++) {
			for(int col=0; col<empInfo[0].length; col++) {
				System.out.print(empInfo[row][col] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
