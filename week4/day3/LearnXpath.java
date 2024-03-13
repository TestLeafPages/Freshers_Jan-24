package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		// To Launch the driver
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the Window
		driver.manage().window().maximize();
		// TO Pass the Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to Find the location in the dom by using id
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// to Find the location in the dom by using name

		//Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		// to Find the location in the dom by using ClassName

		// String currentUrl1 = driver.getCurrentUrl();

		// System.out.println(currentUrl1);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
// To Get the currentUrl

		String currentUrl = driver.getCurrentUrl();

		System.out.println(currentUrl);
// to verify the Url by using if condition

		if (currentUrl.contains("login")) {
			System.out.println("Page is loaded Sucessfully");
		}

		// /html/body/div/div[2]/div/form/p/input

		// Syntax for Xpath
		// 1. Attribute Based Xpath
		// //tagName[@attributeName='attributeValue']

		// 2 Index Based Xpath
		// (//tagName[@attributeName='attributeValue'])[indexvalue] xpath index starts
		// with 1

		// 3. Text Based Xpath

		// tagName[text()='textValue']

		// 4. Contains Based Xpath

		// tagName[contains(@attributeName,'attributeValue')]

		driver.findElement(By.xpath("//a[contains(text(),'CRM/S')]")).click();

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contains("opentaps")) {
			driver.navigate().back();
			System.out.println("The Lead Page is Loaded Sucessfully ");

		}


		
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
		 WebElement findElement = driver.findElement(By.xpath("//span[text()='Disabled']"));
		 
		 
		boolean enabled = findElement.isEnabled();
	
		if (enabled==false) {
			
		}
		
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext')]")).sendKeys("vINOTH");
		// to pass the values
		findElement.sendKeys("bbjb");
		// to clear the already entered value
		findElement.clear();
		// to click the element 
		findElement.click();
		// to get the text of  the element
		findElement.getText();
		// to get the tag name of the element 
		findElement.getTagName();
		
		driver.findElement(By.xpath("(//input[@role='textbox'])[2]")).sendKeys("values to send");
		
	}

}
