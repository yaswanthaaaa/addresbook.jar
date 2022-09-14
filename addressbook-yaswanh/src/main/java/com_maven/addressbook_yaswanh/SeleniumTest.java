package com_maven.addressbook_yaswanh;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest{

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//configure chrome driver to use
		System.setProperty("webdriver.chrome.driver", "/New folder/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("iam yaswanth");
		
		//acess add application
		driver.get("http://65.2.11.37:8888/addressbook/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.className("v-button")).click();
		
		//enter the details
		driver.findElement(By.id("gwt-uid-5")).sendKeys("yaswanth kuruba");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("kuruba");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("8639333604");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("yaswanth1102@gmail.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/12");
		
		System.out.println("Testcase");
		//Thead sleep(5000);
		
		
		
		
		
		
		
		
		
		
		
		
		

		}

}
