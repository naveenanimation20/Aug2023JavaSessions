package javasessions;

public class Language {
	
	
	public static void useLang(Language obj) {
		System.out.println("use this lang");
		//obj=null;
		obj.readLang();
	}

	public void readLang() {
		System.out.println("read lang");		
	}

	public static void main(String[] args) {
		Language lg = new Language();
		lg.readLang();		
		Language.useLang(lg);
	}
	
	
	//POM -- page chaining model -- supply Webdriver driver
	
	

}



 