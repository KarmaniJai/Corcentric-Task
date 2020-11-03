package com.practice.TheBook;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FirstHome {
	WebDriver driver;
	
	@BeforeTest
	public void BeforeTest() throws InterruptedException {
		
		 //Launch Chrome browser 
		System.setProperty("webdriver.chrome.driver", "/Users/Karmani/sel/chromedriver.exe");
		driver = new ChromeDriver();  
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    
	    //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10 
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    //open the url or AUT 
	    driver.get("http://book.theautomatedtester.co.uk/");
	    
	    Thread.sleep(1000);
	}
	
	@AfterTest
	public void AfterTest() {
		driver.close();
		driver.quit();
	}
}