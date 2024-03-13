package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiBank {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uibank.uipath.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement registerButton = driver.findElement(By.xpath("//small[text()='Register For Account']"));

		driver.executeScript("arguments[0].click();", registerButton);

		driver.findElement(By.id("firstName")).sendKeys("Vinoth");
		

	}

}
