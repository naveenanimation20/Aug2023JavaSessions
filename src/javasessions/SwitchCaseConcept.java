package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "Chrome";
		int version = 116;

		switch (browser.toLowerCase().trim()) {//chrome 

		case "chrome":
				if(version == 115) {
					System.out.println("give the permission");
				}
				else {
					System.out.println("no need to give persmission");
				}
				System.out.println("launch chrome");

			break;
		case "firefox":
			System.out.println("launch firefox");
				String mode = null;
				switch (mode) {
				case "headless":
					
					break;

				default:
					break;
				}
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("plz pass the right browser..." + browser);
			break;

		case "opera":
			System.out.println("launch opera");
			break;

		}

		// byte,short,int, String, char -- allowed
		// long, float, double, boolean -- not allowed
		char ch = '$';

		switch (ch) {

		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is a consonant");
			//break;
		}
		
		
		//cross browser logic
		//cross platform/OS/devices: Linux, mac, windows, android, ios
		//user access based permission : RBAC: admin/seller/vendor/customer/distributor
		//multi env execution: dev/qa/stage/uat/prod
		//payment options: CC/UPI/mobile app/online/COD
		//Lang cases: English, Arabic, 
		//Web Page: Electronics, Fashion
		
		
		

	}

}
