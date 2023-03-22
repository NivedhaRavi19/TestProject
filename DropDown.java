package org.tcs.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		   System.setProperty("Webdriver.chrome.driver",
		"C:\\Users\\R.UdayaNive\\eclipse-workspace\\Selenium\\Driver.chromedriver.exe");
		   
		   WebDriver driver = new ChromeDriver();

		   driver.get("https://demo.nopcommerce.com/");
		   
		   driver.manage().window().maximize();
		   
	WebElement mouseovercourse = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));

	Actions acc =new Actions (driver);
	acc.moveToElement(mouseovercourse).perform();
	
	WebElement   Desktop = driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[1]/a"));
	Desktop.click();
	
	  WebElement   Position =  driver.findElement(By.id("products-orderby"));   
	Select selectionbutton = new Select(Position);
	selectionbutton.selectByValue("6");
	     
	 WebElement Display =  driver.findElement(By.id("products-pagesize"));   
		Select Displaybutton = new Select(Display);
		Displaybutton.selectByVisibleText("9");
		     
	        
	 
			
	 }}
	 
	 


