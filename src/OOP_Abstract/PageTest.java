package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {

		LoginPage lp = new LoginPage(10);
		lp.url();//overridden
		lp.title();//overridden
		lp.pageLoadTime();//overridden
		lp.doLogin("admin", "admin123");//indivisual
		lp.logo();//inheritance
		
		//top casting: child class object can be referred by parent abs.. class ref variable
		Page p = new LoginPage();
		p.url();
		p.title();
		p.pageLoadTime();
		p.logo();
		
		//down casting: 
		
		
		
	}

}
