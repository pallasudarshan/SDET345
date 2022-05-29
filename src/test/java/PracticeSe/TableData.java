package PracticeSe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableData {
    public static void main(String[] args) throws InterruptedException {
		
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver =new ChromeDriver();
    	driver.get("http://localhost:8888/");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"root",Keys.ENTER);
    	driver.findElement(By.linkText("Contacts")).click();
    	List<WebElement> list = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[1]"));
    	int size=list.size();
        for(int i=3;i<=size;i++)
        {
        	WebElement ele=driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr[i]/td[1]"));
        	ele.click();
        }
  
    	}
  
	}
    

