package org.rules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends CheckOuts {
	public Page3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="comment")
	private WebElement page1 ;
	@FindBy(id="button-shipping-method")
	private WebElement page2 ;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	private WebElement page3 ;
	@FindBy(name="comment")
	private WebElement page4 ;
	@FindBy(id="button-payment-method")
	private WebElement page5;
	@FindBy(id="button-confirm")
	private WebElement page6 ;
	@FindBy(xpath="//h1[text()='Your order has been placed!']")
	private WebElement page77 ;
	public WebElement getPage77() {
		return page77;
	}
	public WebElement getPage1() {
		return page1;
	}
	public WebElement getPage2() {
		return page2;
	}
	public WebElement getPage3() {
		return page3;
	}
	public WebElement getPage4() {
		return page4;
	}
	public WebElement getPage5() {
		return page5;
	}
	public WebElement getPage6() {
		return page6;
	}
	
public void page3(String comment1) throws InterruptedException {
	//sendKeys(getPage1(), comment1);
	javascript("click",getPage2());
	//sendKeys(getPage4(), comment2);
    javascript("click", getPage3());
    javascript("click", getPage5());
    //click(getPage6());
    javascript("click", getPage6());
    staticWait(3000);
}
	
	
	
	
	
	
	
	
	
}
