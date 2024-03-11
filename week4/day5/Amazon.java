package week4.day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		// launch browser
		ChromeDriver driver = new ChromeDriver();

		// Load the application url
		driver.get("https://www.amazon.in/");

		// Maximize the browser
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("5G mobiles", Keys.ENTER);

		Thread.sleep(5000);
		List<WebElement> priceList = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		for (int i = 0; i < priceList.size(); i++) {
			String text = priceList.get(i).getText();
			System.out.println(text);

		}

	}
}
