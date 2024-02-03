import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class URL_launch 
{

	@Test
	public static void urlLaunch()
	{
		WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
	}
}
