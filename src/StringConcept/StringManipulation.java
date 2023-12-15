package StringConcept;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "Hi This is my java code and i am so happy";
		
		System.out.println(str.length());
		System.out.println("LI = "+ 0);
		System.out.println("HI = " + (str.length()-1));
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41));//StringIndexOutOfBoundsException- SIOB
		//System.out.println(str.charAt(-1));//SIOB

		System.out.println(str.indexOf("H"));
		System.out.println(str.indexOf("i"));//1 - 1st occurrence of i
		
		System.out.println(str.indexOf("i", str.indexOf("i")+1));//5 //2nd occurrence of i
		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1));//3rd occurrence of i
		
		System.out.println(str.indexOf("i", str.indexOf("i", str.indexOf("i", str.indexOf("i")+1)+1)+1));//28 //4th occurrence of i


		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("Naveen"));
		
		String mesg = "Welcome null";
		if(mesg.indexOf("admin")!= -1) {
			System.out.println("admin is there");
		}
		else {
			System.out.println("FAIL");
		}
		
		//trim:
		String sr = "     hello    world   ";
		System.out.println(sr.trim());
		
		//replace:
		String dob = "01-01-1990";//01/01/1990
		dob = dob.replace("-", "/");
		System.out.println(dob);
		
		String sr1 = "    hello        world    ";
		System.out.println(sr1.replace(" ", ""));
		
		//toLower and toUpper
		String sf = "This is Java";
		System.out.println(sf.toLowerCase());
		System.out.println(sf.toUpperCase());
		
		System.out.println("hiiiiiiii");
		//comparison:
		String l1 = "Hello Selenium";
		String l2 = "Hello selenium";
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equalsIgnoreCase(l2));
		
		//contains:
		String m1 = "Hello this is java lang";
		System.out.println(m1.contains("java"));
		
		if(m1.contains("java")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println("-------");

		//sub-string:
		String loop = "your order id is 1234";
		System.out.println(loop.substring(7));
		System.out.println(loop.substring(0, 11));

		System.out.println(loop.substring(loop.indexOf("is")+3, loop.length()));
		System.out.println("-------");

		
		//split:
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		String lg[] = lang.split("_");
		
		System.out.println(lg[0]);//Java
		System.out.println(Arrays.toString(lg));
		
		System.out.println("-------");
		
		String pop = "xXHelloSeleniumxXXTestingXxXAutomationXXxXJava";
		String p[] = pop.split("xX");
		System.out.println(p[0]);//blank-empty - nothing
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);
		System.out.println(p[4]);

		System.out.println("-------");
		
		
		String empInfo = "Ravi;Sharma;IBM;Pune;India;QA";
		System.out.println(empInfo.split(";")[0]);
		System.out.println(empInfo.split(";")[1]);
		System.out.println(empInfo.split(";")[2]);

		System.out.println("-------");

//		String domain = "test.automation.python.java";
//		String dm[] = domain.split("\\.");
//		System.out.println(dm[0]);
		
		String data = "test|automation|python|java";
		String d[] = data.split("\\|");
		System.out.println(d[0]);

		
		String foo = "I love java coding"; // I love "java" coding
		System.out.println(foo);
		
		System.out.println("I love \"java\" coding");
		
		// I love 'java' coding
		System.out.println("I love 'java' coding");
		
		//output: "I love java coding"
		
		String x1 = getXpath("Pooja");
		System.out.println(x1);
		
		x1 = getXpath("Naveen");
		System.out.println(x1);
		
		x1 = getXpath("Java");
		System.out.println(x1);
		
		
		//input[@name='Tom']
		//input[@name=Tom]
		
	}
	
	
	
	public static String getXpath(String empName) {
		
		String xpath = "//input[@name='"+empName+"']";
		return xpath;
	}
	
	
	//how can we reverse   "I am the Best"    to  "Best the am I"
	
	
	

}
