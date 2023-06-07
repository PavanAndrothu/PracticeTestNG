 package Assignments_daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment_4 {

	public static void main(String[] args) throws InterruptedException {
//		Open any browser of your choice (Mozilla firefox, Chrome, Internet Explorer or Safari). 
//		Write the code in such a way that based on argument passed respective browser is selected.
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver(Options);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
	
		
//		Browse to https://in.ebay.com/ website.
		
		driver.navigate().to("https://www.ebay.com/");
//		Enter a product in the search box on the homepage (say Apple Watches).
		driver.findElement(By.id("gh-ac")).sendKeys("Watches");
		Thread.sleep(5000);
		driver.findElement(By.id("gh-btn")).click();
		
		
//		From categories dropdown, select category of your product (say Electronics).
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@aria-label,'category')]"));
        Select selectcat = new Select(dropdown);
        selectcat.selectByVisibleText("Everything Else");

//		Click the Search button.
        driver.findElement(By.id("gh-btn")).click();
        System.out.println("selcted");
//		Write a method to print the result of the product.
        
//		Write a method to print Nth product say 10th Product. (This should be a generic method)
        
        
//		Write a method to print all products from 1st page.
        
        
//		Write a method to print all products along with scroll down.
        
	}

}
