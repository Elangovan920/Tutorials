package org.rules;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass extends BaseClass {
	
	public PomClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement find ;
	@FindBy(xpath="//a[text()='Mac (1)']")
	private WebElement login ;
	@FindBy(xpath="//a[text()='Laptops & Notebooks (5)']")
	private WebElement lap ;
	@FindBy(xpath="//a[contains(text(),'HP')]")
	private WebElement selects ;
	public WebElement getLap() {
		return lap;
	}
	public WebElement getSelects() {
		return selects;
	}
	public WebElement getFind() {
		return find;
	}
	public WebElement getLogin() {
		return login;
	}
	public void loginPage() {
		click(getFind());
		click(getLogin());
		click(getLap());
		click(getSelects());
	}

}
