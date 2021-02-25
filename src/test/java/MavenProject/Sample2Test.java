package MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample2Test {
	@Test
	public void GetTitle() throws InterruptedException
	{	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();	
	}
}
