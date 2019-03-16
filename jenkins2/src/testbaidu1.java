import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testbaidu1 {
	public WebDriver driver;
	public WebElement a;
	 public String b;
	
	@Before
	public void setUp() throws Exception {
		 System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
		   driver =new ChromeDriver();
	}

	@After
	public void tearDown() throws Exception {

		assertEquals("selenium", b);
	}

	@Test
	public void test() {
		 driver.get("http://www.baidu.com");
		 a=driver.findElement(By.id("kw"));
		 a.sendKeys("selenium");
		 b=a.getText();
		 
	}

}
