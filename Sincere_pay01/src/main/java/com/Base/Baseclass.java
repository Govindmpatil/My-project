package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
public static WebDriver openChromebrowser() {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
return driver;

}
	
	
	
}
