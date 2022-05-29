package com.testyanra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandling {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/guru99home/");
		 
		driver.switchTo().frame("a077aa5e");
		driver.switchTo().frame("iframe_981971552686");
		 
		 
	}

}
