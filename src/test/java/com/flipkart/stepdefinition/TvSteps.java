package com.flipkart.stepdefinition;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.flipkart.objectrepository.MobilePage;
import com.flipkart.resources.Commonactions;

import cucumber.api.java.en.When;

public class TvSteps extends Commonactions{
	
	String names;
	Commonactions c = new Commonactions();
	MobilePage m = new MobilePage();
	
	@When("user search tv")
	public void user_search_tv() {
		
		names = "realme";
		
		c.insertTextJs(m.getSearch(), names);
		WebElement mobileName = driver.findElement(By.xpath("(//div[contains(text(),'"+names+"')])[2]"));
	    String fn = mobileName.getText();
	    mobileName.click();
	    
	}

	@When("user choose the tv")
	public void user_choose_the_tv() {
		
		c.windowHandling();
	    
	}

}
