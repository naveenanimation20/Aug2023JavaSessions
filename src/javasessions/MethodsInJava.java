package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsInJava {
	String name;
	//can not create a method inside a method
	//can call a method inside a method
	//methods are always independent//parallel to each other
	//methods are class data members
	//method: the behaviour of the object/class
	//duplicate methods are not allowed
	
	//1. no input and no return:
	//void: can not return any value
	//return type: void
	public void test() {//0 param -- no input
		System.out.println("test method");
	}
	
	//2. no input but some return:
	//return type: int
	public int getInfo() {
		System.out.println("get info method");
		int a = 10;
		int b = 20;
		int c = a+b;//30
		System.out.println(c);//30
		return c;
	}
	
	//return type: String
	public String getName() {
		System.out.println("get name method");
		String name = "Naveen";
		return name;
	}
	
	//can we return multiple values from the method?
	//ans: NOOOOOOOO
	//return type: ArrayList<String>
	public ArrayList<String> getEmpNames() {
		System.out.println("get emp names...");
		String em1 = "Ravi";
		String em2 = "Naveen";
		
		ArrayList<String> empList = new ArrayList<String>();
		empList.add(em1);//0
		empList.add(em2);//1
		return empList;
	}
	
	//return type: String[]
	public String[] getEmployee() {
		System.out.println("get employee method");
		String emp[] = {"Ravi", "Naveen"};
		return emp;
	}
	
	//3. some input and some return:
	public int sum(int a, int b) { //2 params
		System.out.println("sum method");
		int total = a+b;
		return total;
	}
	
	public int sub(int a, int b) { //2 params
		System.out.println("sub method");
		int sub = b-a;
		return sub;
	}
	
	
	//
	public float getBillAmount(int foodBill, int drinksBill, float tax) {
		System.out.println("generating bill amount..");
		
		float totalBill = foodBill + drinksBill + tax;
		return totalBill;
	}
	
	
	public int calculateMarks(int subjectMarks, int attendance, int handwriting) {
		int totalMarks = subjectMarks + attendance;
		return totalMarks;
	}
	
	public int calculateMarks(int subjectMarks) {
		int totalMarks = subjectMarks ;
		return totalMarks;
	}
	
	
	
	public Object[] getEmpInfo() {
		Object empInfo[] = {"Tom",30,12.33,true};
		return empInfo;
	}
	
	

	public static void main(String[] args) {

		//call the method: create the object of the class
		MethodsInJava obj = new MethodsInJava();
		obj.name = "Tom";
		obj.test();
		
		int s = obj.getInfo();
		
		System.out.println(s+20-10);
		System.out.println(s+20-10-2);
		
		
		System.out.println(obj.getInfo()+20);
		System.out.println(obj.getInfo()+20-10);

		String n1 = obj.getName();//Naveen
		System.out.println(n1);
		System.out.println(n1 + " Automation Labs");
		
		ArrayList<String> eList = obj.getEmpNames();
		System.out.println("total emp: " + eList.size());
		System.out.println(eList);	
		
		String employee[] = obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));
		
		int u1 = obj.sum(10, 20);//arguments/value
		System.out.println(u1);
		
		int u2 = obj.sum(30, 40);
		System.out.println(u2);
		
		float finalBill = obj.getBillAmount(100, 50, 0.5f);
		System.out.println(finalBill - 20 + 5);
		
		obj.calculateMarks(10, 2, 1);//args/value
		//calling a function/method by passing the value/arg: call by value/arg
				
	}

}
