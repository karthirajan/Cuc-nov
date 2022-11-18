package com.flipkart.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();

	@Before
	public void beforeScenario() {
		// TODO Auto-generated method stub
		//launch
		c.launch("https:/www.flipkart.com/");

	}
	
	@After
	public void afterScenario(Scenario scenario) {
		// TODO Auto-generated method stub
		
		if(scenario.isFailed()){
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}else{
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}

		//quit
		driver.quit();
		
		
	}
	
}
