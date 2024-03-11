package week4.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingGetOptionsMethod {
public static void main(String[] args) {
	// launch browser
			ChromeDriver driver = new ChromeDriver();

			// Load the application url
			driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0h17xfdfnm4s31u0seo9d8r53c62386.node0");

			// Maximize the browser
			driver.manage().window().maximize();

			//locate the webelement 
			WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
            //Using select class
			Select dd1=new Select(dropDown);
			List<WebElement> options = dd1.getOptions();
			int dropDownSize = options.size();
			System.out.println(dropDownSize);
			for (int i = 0; i <dropDownSize ; i++) {
				String text = options.get(i).getText();
				System.out.println(text);
			}
			
			//Select random values from dropdown
			dd1.selectByIndex(dropDownSize-1);





}
}
