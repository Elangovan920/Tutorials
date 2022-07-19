package org.rules;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class MainPage extends Page3 {
	
	@BeforeClass
	private void before() {
		Date d = new Date();
		browserLaunch("firefox");
		   System.out.println("ALL TEST CASE START TIME IS  "+d);
	}
	  @BeforeMethod
  private void beforem() {
	   implicityWait(10);
	   Date d = new Date();
	   System.out.println("TEST START TIME IS  "+d);
	   }
   @Test
   private void test() throws InterruptedException {
	   PomClass p = new PomClass();
	   urlLaunch("http://tutorialsninja.com/demo/");
		p.loginPage();
  
   }  
   @Test
   private void test1() {
	   Page2 u= new Page2();
	     u.page2();
   }  
  
   @Test()
   private void test2() throws InterruptedException, AWTException, IOException {
	   CheckOuts u= new CheckOuts();
	 
	   u.step2(u.excel(0,0), "murugesh", "karthick@gmail.com", "1234567890", "chennai", "tambaram", "600047");
	  SoftAssert s = new SoftAssert();
	  String ll = u.getText(u.getPage4());
	  s.assertEquals(ll, "murugesh", "page3");
	  s.assertAll();
   } 
   @Test
   private void test3() throws InterruptedException {
	   	Page3 p = new Page3();
   p.page3("its ok");
   staticWait(3000);
   String ss = p.getPage77().getText();
   System.out.println(ss);
   }
   
   
   
   
   
   
   
   
   
   
   
   
   @AfterClass
   private void after() {
	   Date d = new Date();
	   System.out.println("ALL TEST CASE END TIME IS  "+d);
		
   }
   @AfterMethod
   private void afterm() {
	   Date d = new Date();
	   System.out.println("TEST END TIME IS  "+d);
		
   
   }
   
   
   
   
   
   
}
