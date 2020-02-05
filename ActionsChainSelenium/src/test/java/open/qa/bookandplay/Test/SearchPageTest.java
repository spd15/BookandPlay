package open.qa.bookandplay.Test;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SearchPageTest {
	
	@Test
	public void TestSearchOption()
	{
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",path +"/drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://booknplay.in/");
		
		
		driver.findElement(By.xpath("//input[@id='locationsearch']")).sendKeys("Basket Ball");
		
		driver.findElement(By.xpath("//input[@id='locationsearch']")).sendKeys(Keys.ARROW_DOWN);
		
		//a.sendKeys(Keys.ARROW_DOWN).build().perform();
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='pac-item']"));
		
		for(int i=0;i<ele.size();i++)
		{
			
			System.out.println(ele.get(i).getText());
			
		}
		
		
		Actions a = new Actions(driver);
		a.moveToElement(ele.get(1)).click().build().perform();
		
		driver.close();
		
		
		
		
		
	}

}
