package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		// To Launch the driver
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// TO Pass the Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to Find the location in the dom by using id
		// 30
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");

		// to Find the location in the dom by using name

		// 30
		// driver.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");

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

		// b.*Advanced xPath(Axes based xPath)*
//  	1. Parent to Child:
		// Syntax:
		// `BasicRelativeXpathforParent/childTagname`
//	        Example:
//	          `(//form[@id='login']/p)[2] `

		driver.findElement(By.xpath("//div[@class='x-panel-header']/a[text()='Leads']")).click();

		// div[@class='x-panel-header']/a[text()='Leads']

//	     2. Child to Parent:
//	        Syntax:
//	          BasicRelativeXpathforChild/parent::parenttagname` 
//	        Example:
//	        ` //label[text()='Password']/parent::p`
//	         `//p[@class='top']/parent::form`   
		
		

//	     3. GrandParent to GrandChild:
//	        Syntax:
//	          `BasicRelativeXpathforGrandParent//grandchildTagname` 
//	        Example:
//	          `(//form[@id='login']//input)[3] `     

		
//	     4. GrandChild to GrandParent:
//	        Syntax:
//	            ` BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname`   
//	        Example:
//	          `//input[@class='decorativeSubmit']/ancestor::form` 

		
		
//	     5. ElderCousin to YoungerCousin:
//	        Syntax:
//	           `BasicRelativeXpathforElderCousin/following::youngerCousintagname`   
//	        Example:
//	           `//span[text()='Company Name']/following::input  

		
		
//	     6. YoungerCousin to ElderCousin:
//	        Syntax:
//	            `BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname`   
//	        Example:
//	           //input[@class='decorativeSubmit']/preceding::input


		
//	     7. ElderSibling to YoungerSibling:
//	        Syntax:      
//	           `BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname`
//	        Example:
//	           `//label[text()='Username']/following-sibling::input`

		
		
//	     8. YoungerSibling to ElderSibling:
//	        Syntax:
//	          `BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname`
//	        Example:  
//	           `//input[@id='username']/preceding-sibling::label`    
//	              

	}

}
