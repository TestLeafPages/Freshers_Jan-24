package week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		// To Launch the driver
		ChromeDriver driver = new ChromeDriver();
		// To Maximize the Window
		driver.manage().window().maximize();
		// TO Pass the Url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// to Find the location in the dom by using id 
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// to Find the location in the dom by using name
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		// to Find the location in the dom by using ClassName
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}

}
