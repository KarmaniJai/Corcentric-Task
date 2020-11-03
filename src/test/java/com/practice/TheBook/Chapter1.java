package com.practice.TheBook;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;

public class Chapter1 extends FirstHome{
	@Test
	public void chapter1() throws InterruptedException {

		System.out.println("Application Started....");
		
		//Going to Chapter 1 Page
		driver.findElement(By.linkText("Chapter1")).click();
		Thread.sleep(1000);
		
		boolean TextVisible= driver.findElement(By.id("divontheleft")).isDisplayed();
		
		AssertJUnit.assertEquals(true, TextVisible);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
	}
}