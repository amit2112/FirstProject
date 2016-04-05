package com.test.jbilling;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginTest extends Browser{
	
  @Test
  public void testLoginTestJbilling() throws Exception {
	    driver.get(baseurl + "jbilling/login/auth");
	    driver.findElement(By.id("j_username")).clear();
	    driver.findElement(By.id("j_username")).sendKeys("user1");
	    driver.findElement(By.id("j_password")).clear();
	    driver.findElement(By.id("j_password")).sendKeys("Amit@1234");
	    driver.findElement(By.id("j_client_id")).getText();
	    
	    new Select(driver.findElement(By.id("j_client_id"))).selectByVisibleText("ABC");
	    
	    //WebDriverWait wait = new WebDriverWait(driver,30);
	    //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".save")));
	    driver.findElement(By.cssSelector(".save")).click();
	    
	    String actualText = driver.findElement(By.xpath("//div[@id='header']/ul/li[2]")).getText();
	    
	    Assert.assertEquals(actualText, "Hello User1");
	  }
}
