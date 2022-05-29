package com.testyanra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavtivePoupHandlig {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		;
		ChromeOptions option =new ChromeOptions();
		option.addArguments("disable");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
		
		
		
	}

}
