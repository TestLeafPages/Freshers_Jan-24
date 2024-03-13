package week4.day1;

import java.util.List;

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

		Thread.sleep(5000);		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

		// to Find the location in the dom by using ClassName

		driver.findElement(By.xpath("//input[@type='submit']")).click();

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
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		

	

		
		
		

	}

}
