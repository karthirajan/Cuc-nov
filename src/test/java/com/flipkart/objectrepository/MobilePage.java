package com.flipkart.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.resources.Commonactions;

public class MobilePage extends Commonactions{
	
	public MobilePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement search;
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement login;
	
	@FindBy(xpath="//button[text()='BUY NOW']")
	private WebElement buy;
	
	@FindBys({
		@FindBy(name="q"),
		@FindBy(id="q")
	})
	private WebElement searchAnd;
	
	@FindAll({
		@FindBy(name="q"),
		@FindBy(id="q")
	})
	private WebElement searchOr;
	

	public WebElement getSearch() {
		return search;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getBuy() {
		return buy;
	}
	
	

}
