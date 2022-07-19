package org.rules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 extends PomClass{
	public Page2() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//button[contains(text(),'Add')]"),@FindBy(xpath="(//button[@type='button'])[14]")})
	private WebElement cart ;
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement clickcart ;
	
	public WebElement getCart() {
		return cart;
	}
	public WebElement getClickcart() {
		return clickcart;
	}
	
	public void page2() {
		javascript("scrolldown",getCart());
		click(getCart());
		javascript("click",getClickcart());
	}

}
