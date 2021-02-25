package MavenProject;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1Test {
	@Test
	public void sampletest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(2000);
		driver.quit();	
	}

}
