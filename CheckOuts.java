package org.rules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOuts extends Page2 {
	
	
	public CheckOuts() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//strong[text()=' Checkout']")
	private WebElement clicks ;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement page1 ;
	@FindAll({@FindBy(xpath="//input[@value='Continue']"),@FindBy(id="button-account"),@FindBy(xpath="(//input[@class='btn btn-primary'])[2]")})
	private WebElement continues ;
	@FindBy(name="firstname")
	private WebElement  page3 ;
	@FindBy(name="lastname")
	private WebElement  page4 ;
//	@FindAll({@FindBy(name="email"),@FindBy(xpath="(//input[@class='form-control'])[5]"),@FindBy(id="input-payment-email")})
	@FindBy(id="input-payment-email")
	private WebElement  page5 ;
	@FindBy(name="telephone")
	private WebElement  page6 ;
	@FindBy(name="address_1")
	private WebElement  page7 ;
	@FindBy(name="city")
	private WebElement  page8 ;
	@FindBy(name="postcode")
	private WebElement  page9 ;
	@FindBy(name="country_id")
	private WebElement  page10 ;
	@FindBy(name="zone_id")
	private WebElement  page11 ;
	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement  page12 ;
	public WebElement getClicks() {
		return clicks;
	}
	public WebElement getPage1() {
		return page1;
	}
	public WebElement getContinues() {
		return continues;
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
	public WebElement getPage7() {
		return page7;
	}
	public WebElement getPage8() {
		return page8;
	}
	public WebElement getPage9() {
		return page9;
	}
	public WebElement getPage10() {
		return page10;
	}
	public WebElement getPage11() {
		return page11;
	}
	public WebElement getPage12() {
		return page12;
	}
	
	
	 
	 
	public void step2(String fname,String lname ,String email,String teleph,String address,String city,String pcode) throws InterruptedException {
		click(getClicks());
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(
		ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[2]")));
	 //   click(getPage1());
	 //   mouseAction("click", getPage1());
		javascript("click", getPage1());
	   // javascript("scrolldown", getPage2());
		// wait.until(
	   //	ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Continue']")));
	   //  mouseAction("click", getContinues());
		javascript("click", getContinues());
	    //click(getContinues());
		//staticWait(3000);
		sendKeys(getPage3(), fname);
		staticWait(3000);
		sendKeys(getPage4(), lname);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email//")));
		//click(getPage5());
		//javascriptsk(getPage5());
		sendKeys(getPage5(), email);
		sendKeys(getPage6(), teleph);
		sendKeys(getPage7(), address);
		sendKeys(getPage8(), city);
		sendKeys(getPage9(), pcode);
		selectbyValue(getPage10(), "99");
		selectbyValue(getPage11(), "1503");
		click(getPage12());

	}
	
		
	}


