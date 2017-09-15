package com.lin.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumUtil  
{  
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromeDriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("http://www.baidu.com");
        WebElement kw = webDriver.findElement(By.id("kw"));
        kw.sendKeys("暗算");
        WebElement su = webDriver.findElement(By.id("su"));
        su.click();
        //webDriver.close();
        System.out.println("Hello World!");
    }
  
}  
