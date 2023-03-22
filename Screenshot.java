package org.tcs.login;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		
		  System.setProperty("Webdriver.chrome.driver",
	"C:\\Users\\R.UdayaNive\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver ();
		  
		  driver.get("https://www.hp.com/us-en/shop/cat/desktops");
		  driver.manage().window().maximize();
		  
		  //typecasting
		  TakesScreenshot tk = (TakesScreenshot)driver;
		  File src =tk.getScreenshotAs(OutputType.FILE);
		  File des = new File("C:\\Users\\R.UdayaNive\\eclipse-workspace\\Selenium\\Screenshots\\Desktops.png");
	FileHandler.copy(src, des);


}}
