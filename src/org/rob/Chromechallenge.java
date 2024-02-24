package org.rob;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chromechallenge {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sha\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement chr = driver.findElement(By.id("APjFqb"));
		chr.sendKeys("InmakesInfotech");
		Actions a=new Actions(driver);
		a.doubleClick(chr).perform();
		
		
		
	}

}
