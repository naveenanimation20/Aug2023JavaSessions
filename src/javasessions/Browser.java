package javasessions;

public class Browser {

	// WAF: to launch the browser
	// name: launchBrowser : chrome/ff/safari/edge
	// param: browserName(String)
	// return: boolean

	public boolean launchBrowser(String browserName) {

		System.out.println("browser name is : " + browserName);
		boolean flag = true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;

		default:
			System.out.println("plz pass the right browser name..." + browserName);
			flag = false;
			break;
		}

		return flag;
	}

	public boolean launchBrowserTest(String browserName) {

		System.out.println("browser name is : " + browserName);
		boolean flag = true;

		if (browserName.equals("chrome")) {
			System.out.println("chrome is launched");

		} 
		else if (browserName.equals("firefox")) {
			System.out.println("ff is launched");

		}

		else {
			System.out.println("error");
			flag = false;
		}

		return flag;

	}

	// WAF: to return the student marks
	// function name: getStudentMarks(String stName)
	// return: marks(int): 0-100
	public int getStudentMarks(String studentName) {
		System.out.println("getting marks for student: " + studentName);

		int marks = -1;

		if (studentName.equals("sarika")) {
			// return 90;
			marks = 90;
		} else if (studentName.equals("rahul")) {
			// return 95;
			marks = 95;
		} else if (studentName.equals("shubhra")) {
			// return 100;
			marks = 100;
		} else if (studentName.equals("naveen")) {
			// return 0;
			marks = 0;
		} else {
			System.out.println("pls pass the right student name..." + studentName);
			// return -1;
		}

		return marks;

	}

	public static void main(String[] args) {
		// caller method // user

		Browser br = new Browser();
		
		boolean isOpen = br.launchBrowserTest("chrome");
		if(isOpen) {
			System.out.println("enter url");
		}
		
		
//		boolean flag = br.launchBrowser("Chromedriver");
//		if (flag) {
//			System.out.println("enter url");
//		} else {
//			System.out.println("error -- no browser is there");
//		}

		//
		int stMarks = br.getStudentMarks("tom");
		System.out.println(stMarks);

		if (stMarks >= 0) {
			System.out.println("print the mark sheet");
		}
	}

}
