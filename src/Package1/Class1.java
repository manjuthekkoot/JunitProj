package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {
	
	public static void main (String args[]) throws InterruptedException
	{
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\advan\\Desktop\\Manju\\WS\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver ff = new FirefoxDriver();
		ff.get("https://www.google.com");
	    Thread.sleep(3000);
	    ff.close();
	}	
	
}
