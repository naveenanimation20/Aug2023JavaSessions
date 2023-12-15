package WebDriverArch;

public class FirefoxDriver implements WebDriver{
	
	public FirefoxDriver() {
		System.out.println("launch firefox browser....");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding element: " + locator);
	}

	@Override
	public void click(String locator) {
		System.out.println("click on : " + locator);
	}

	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("enter value in : " + locator + " " + "value = " + value );
	}

	@Override
	public String getTitle() {
		return "Amazon";
	}

	@Override
	public void get(String url) {
		System.out.println("enter url: " + url);
	}

	@Override
	public void close() {
		System.out.println("close the browser...");
	}

}
