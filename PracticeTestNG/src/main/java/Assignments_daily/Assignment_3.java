package Assignments_daily;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment_3 {


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver;
		String Flipurl = "https://www.flipkart.com/";
		//Open a Browser (write the generic code such that by changing the parameter browser can be changed.)
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(Options);
		
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		//Navigate to https://flipkart.com website.
		
		driver.get(Flipurl);
		//Write a method to find the count (number of) links on the homepage of Flipkart.
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	      //Using tagname with anchor
	}
	WebDriver driver;
	String Flipurl = "https://www.flipkart.com/";
		//Write another method to print link text and URLs of all the links on the page of Flipkart.
	  	public void getLinkCount(){
			List<WebElement> allLink = driver.findElements(By.tagName("a"));
			
			System.out.println("Number of links on a page :: "+allLink.size());
			
		}
		
		public void getAllLinkInfo(){
			List<WebElement> allLink = driver.findElements(By.tagName("a"));
			
			for(WebElement link:allLink){
				System.out.println("Link Text :: "+ link.getText());
				System.out.println("Link URL  :: "+ link.getAttribute("href"));
				
				System.out.println("-------------------------------------------");
			}
			driver.quit();
		}
	      
	}

