package annapuran;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		 List<WebElement> drivere = driver.findElements(By.xpath("//li[@class='nav-item mr-4 mb-2 mb-lg-0']/following::a[@class='nav-link']"));
		 for(WebElement wb:drivere)
		 {
			 String text=wb.getText();
			 System.out.println(text);
		 }
	}
}
