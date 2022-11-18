package com.flipkart.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.flipkart.objectrepository.MobilePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MobileSteps extends Commonactions{
	
	Commonactions c = new Commonactions();
	MobilePage m = new MobilePage();
	
	//static WebDriver driver;
	
	@Given("user login to flipkart")
	public void user_login_to_flipkart() {
		
		
		 try{
				
				
				m.getLogin().isDisplayed();
				m.getLogin().click();
				
			}catch (Exception e) {
				
				System.out.println("Login not required");
				
			}
	    
	}
	
	String names;

	@When("user search mobile {string}")
	public void user_search_mobile(String string) {
		
		names = string;
		
		c.insertTextJs(m.getSearch(), names);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}
	
	@When("user search mobile")
	public void user_search_mobile() {
		
		names = "realme";
		
		driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}

	@When("user choose the mobile")
	public void user_choose_the_mobile() {
		

           c.windowHandling();
	    
	}

	@When("user doing payment by using UPI")
	public void user_doing_payment_by_using_UPI() {
		
       System.out.println("drpdown & screenshot");
		
       //  JavascriptExecutor js = (JavascriptExecutor)driver;
         
         WebElement ele = driver.findElement(By.xpath("//button[text()='BUY NOW']"));
         
		//js.executeScript("arguments[0].scrollIntoView(true)", ele);
        c.dropDown(ele);
		String text = ele.getText();
		
		Assert.assertEquals("BUY NOW", text);
	    
	}

	@Then("user receives confirmation message")
	public void user_receives_confirmation_message() {
	    
		System.out.println("success");
		
		
	}
	
	@When("user search mobile by using oneD list")
	public void user_search_mobile_by_using_oneD_list(DataTable dataTable) {
		
		List<String> datas = dataTable.asList();
		
        names = datas.get(1);
		
		driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}
	
	@When("user search mobile by using oneD map")
	public void user_search_mobile_by_using_oneD_map(DataTable dataTable) {
		
		Map<String, String> datas = dataTable.asMap(String.class, String.class);
		
        names = datas.get("phone3");
		
		driver.findElement(By.name("q")).sendKeys(names,Keys.ENTER);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}


}
