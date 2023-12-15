package StringConcept;

public class StringReverse {
	
	//WAF: name: reverseString
	//param: String: str
	//return String: reversed string
	
	public static String reverseString(String str) {
		
		//null check: top/first check
		if(str == null) {
			System.out.println("String is null, can not reerse. Plz pass the right value");
			//return null;
			//return "String is null";
			//return "-1";
		}
		
		//string is blank space:
		if(str.isBlank()) {
			System.out.println("string is having blank spaces");
			return str;
		}		
		
		int len = str.length();
			//length check == 1
			if(len==1 || len==0) {
				return str;
			}
		
		String rev = "";
		for(int i=len-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		return rev;
	}
	

	public static void main(String[] args) {
		//tcs:
//		System.out.println(reverseString("Selenium"));
//		System.out.println(reverseString("123"));
//		System.out.println(reverseString("Selenium Automation"));
//		System.out.println(reverseString("T"));
//		System.out.println(reverseString(null));//null
		//System.out.println(reverseString(""));
		//System.out.println(reverseString("       "));





//		String str = "Selenium";
//
//		StringBuilder sb = new StringBuilder(str);
//		System.out.println(sb.reverse());
		
		//Selenium is good
		//muineleS si doog
		
		StringBuilder sb = new StringBuilder("Testing");

		System.out.println(sb.append("Automation"));//TestingAutomation

		System.out.println(sb + "100");//TestingAutomation100

		System.out.println(sb.append("200"));
		System.out.println(sb.append("100").append("200"));
		
		
		
	}

}
