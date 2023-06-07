package Assignments_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assignment_2Testng {
	
	WebDriver driver;
	
	String fbUrl = "https://www.fb.com/";
	String facebookUrl = "https://www.facebook.com/";
	
	@BeforeClass
	//1.Open a Chrome browser.	
	public void invokeBrowser() throws InterruptedException{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(Options);
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		//2.Navigate to “http://www.fb.com”
		driver.get(fbUrl);
		
	    //3.Verify that the page is redirected to “http://www.facebook.com”, 
		//by getting the current URL. 
		//(use if-else condition to verify this condition or use Assert.assertequals() 
		//in case you are familiar with TestNG or JUnit)
		String urlFromBrowser = driver.getCurrentUrl();
		
		Assert.assertEquals(urlFromBrowser, facebookUrl, "No redirection happened");
		
		//4.Verify that there is a “Create an account” section on the page.
		WebElement verifying_account = driver.findElement(By.linkText("Create new account"));
		verifying_account.click();
		
		System.out.println("Test 2");
		System.out.println("beforeclass passed");
		Thread.sleep(5000);
		
	}
	
	
	@Test
	public void facebookSignUp() throws InterruptedException {
		
		Thread.sleep(5000);
		//5.Fill in the text boxes: First Name, Surname, Mobile Number or email address, “Re-enter mobile number”, new password.
		driver.findElement(By.name("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("User");
		driver.findElement(By.name("reg_email__")).sendKeys("Testmail@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Testmail@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Testpassword");
		System.out.println("Test 3");
		//6.Update the date of birth in the drop-down.
		Select selDate = new Select(driver.findElement(By.id("day")));
		Select selMonth = new Select(driver.findElement(By.id("month")));
		Select selYear = new Select(driver.findElement(By.id("year")));
		
		selDate.selectByVisibleText("21");
		selMonth.selectByVisibleText("Jun");
		selYear.selectByVisibleText("1998");
		
		//7.Select gender.
		driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
		//8.Click on “Create an account”.
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		System.out.println("test passed");
		Thread.sleep(5000);
	}
	
	
	@AfterClass
	public void closeBrowser() throws InterruptedException{
		//9.Verify that the account is created successfully.
		Thread.sleep(5000);
		driver.quit();
		System.out.println("after class passed");
		
	}

}