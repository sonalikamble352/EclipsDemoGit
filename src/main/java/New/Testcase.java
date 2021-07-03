package New;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase 
{
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\New folder\\chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///F:/New%20folder/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();								 
	}
	/*@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

	@Test          // verifying Logo displayed 
	public void test1() throws IOException
	{
		boolean Logo = driver.findElement(By.xpath("/html/body/div/center/img")).isDisplayed();
		Assert.assertEquals(Logo, "Logo not displayed");
	}

	@Test          // verifying title 
	public void test2()
	{
		String title=driver.getTitle();
		System.out.println("The page title is : " +title);
		Assert.assertEquals(title, "JavaByKiran | Log in");
	}*/

	@Test  //verifying Subtitle
	public void test3()
	{
		String Subtitle=driver.getTitle();
		System.out.println("the page subtitle is :" +Subtitle);
		Assert.assertEquals(Subtitle, "JAVA | SELENIUM | PYTHON");	
	}

	@Test          // verifying Email Address & Password
	public void test5()
	{
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String actual_error=driver.findElement(By.xpath("//*[@id=\"email_error\"]")).getText();
		String expected_error="please enter email";

		Assert.assertEquals(actual_error, expected_error);
	}
}