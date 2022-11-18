package com.flipkart.resources;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	
	public static WebDriver driver;
	
	public void launch(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.addArguments("--pop-up-blocking");
		opt.addArguments("--headless");
		
		 driver = new ChromeDriver(opt);
		// driver.get("chrome://settings/clearBrowserData");
		// driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		 driver.get(url);
		 //driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 

	}
	
	public void windowHandling() {
		// TODO Auto-generated method stub
        String parent = driver.getWindowHandle();
		
		Set<String> child = driver.getWindowHandles();
		for (String x : child) {
			
			if(!x.equals(parent)){
				driver.switchTo().window(x);
				System.out.println("window switched");
			}
			
		}

	}
	
	public void insertText(WebElement ele, String value) {
		
         ele.sendKeys(value);
	}
	
	public void insertTextJs(WebElement ele, String value) {
		
        ele.sendKeys(value,Keys.ENTER);
	}
	
	public String getValue(WebElement ele) {
		
		String text = ele.getText();
		return text;

	}
	
	public void insertText(String value) {
		
		Actions a = new Actions(driver);
        a.sendKeys(value).build().perform();
	}
	
	public void dropDown(WebElement ele) {
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", ele);

	}

}
