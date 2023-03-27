package com.takieo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	
	ChromeDriver driver;
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\namas\\Desktop\\chrome file\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirstTest myobj = new FirstTest();
myobj.invokeBrowser();
	}

}
