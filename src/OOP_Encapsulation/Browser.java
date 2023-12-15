package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("launching Browser");
		checkRAM();
		checkCPUUtilization();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("browser is launched.....");
	}
	
	private void checkRAM() {
		System.out.println("checkRAM");
	}
	
	private void checkCPUUtilization() {
		System.out.println("checkCPUUtilization");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
		
	}

	private void checkBrowserUpgrade() {
		System.out.println("checkBrowserUpgrade");
	}
	
}
