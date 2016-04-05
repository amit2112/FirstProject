package com.test.jbilling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Browser {
	protected static WebDriver driver = new FirefoxDriver();
	protected static String baseurl;
	
  @BeforeSuite
  public void setup() {
	  baseurl = "http://localhost:8080/";
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  public static WebDriver getBrowser(){
	  if(null == driver){
		  driver = new FirefoxDriver();
	  }
	  return driver;
  }
  
  @AfterSuite
  public void tearDown(){
	  driver.quit();
  }
}
