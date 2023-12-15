package javasessions;

import java.util.Arrays;

public class LoopsConcept {

	public static void main(String[] args) {

		
		//1. while loop:
		//1 to 10:
		int i = 1;
		while(i<=10) {
			System.out.println(i);//12345678910
			i++;
			//++i;
			//i=i+1;
			//break;
		}
		
		System.out.println("--------------");
		
		int j = 1;
		while(j<=50) {//true
			System.out.println(j);//12345
			System.out.println("Hi");//Hi Hi
				if(j % 5 == 0) {//true
					System.out.println("Hi");//Hi
					break;
				}
				
			j++;//3
		}
		
		//when to use while loop: use cases:
		//when number of iterations are not fixed
		//waiting for the web element on the page
		//waiting for the page loading
		//linkedin/facebook/swiggy/zomato: infinite scrolling
		//payment: waiting for the confirmation alert
		//pagination
		//calendar
		//file download : 5 secs, 10 secs, 50 secs

		
		System.out.println("--------------");

		//2. for loop:
		//1 to 10:
		for(int k=1; k<=10; ) {
			System.out.println(k);//13579
			k=k+2;//11
		}
		
		System.out.println("--------------");

		//
		for(byte b=1; b<=5; b++) {
			System.out.println(b);
		}
		
		System.out.println("--------------");

		//
		for(float c=1.1f; c<=5.5; c++) {
			System.out.println(c);//1.1 2.1 ...... 5.1
		}
		
		System.out.println("--------------");
		
		//a-z:97-122
		//a = 97
		//b = 98
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch +" = " + (byte)ch);
		}
		
		//
		for(;;) {
			System.out.println("welcome to Hotel Taj");
			break;
		}
		
		System.out.println("--------");
		
		//for -- break:
		for(int n=1; n<=50; n++) {
			System.out.println(n);//1
				if(n % 5 == 0) {
					System.out.println("Bye");//Bye
					break;
				}
		}
		
		//for loop use cases:
		//when number of iterations are already fixed:
		//Arrays
		//drop down: month: 12
		//menu items: 
		//read excel sheet: 10 rows: for loop
		for(int n=1; n<=50; n++) {
			if(n % 2 == 0) {
				System.out.println(n + " even number");
			}
			else {
				System.out.println(n + " odd number");
			}
		}
		
		System.out.println("---------------");
		
		//Do-While:
		int s = 1;
		do {
			s++;//11
			System.out.println(s);//23....10 11
			//break;
		}
		while(s<=10);
		
		//use cases:
		//when number of iterations are not fixed
		//web Page: link: 10 secs to be loaded --> 
		//1st: 0 sec: link is available: no need to go the loop part - click on it
		//2nd:  2 4 6 8 
		
		
		System.out.println("------");
		//10 to 1:
		int x = 10;
		while(x>=1) {
			System.out.println(x);//10 9 8 7 6 5 4 3 2 1
			x--;//0
		}
		
		//reverse a String: Selenium ---> 
		
		System.out.println("------");
		//
		boolean flag = false;
		while(flag) {
			System.out.println("Welcome to NAL");
		}
		
		
		do {
			System.out.println("Welcome to NAL");
		}
		while(false);
		
		
		//for each 
		//streams with lambda
				
//		String[] s = new String[5];
//		System.out.println(s);
//		System.out.println(Arrays.toString(s));
		
		char []c11 = new char[5];
		c11[0] = 'a';
		c11[1] = 'b';

		System.out.println(c11);
		System.out.println(Arrays.toString(c11));
		
	}

}
