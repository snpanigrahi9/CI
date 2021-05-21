package com.ci;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkin {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\CICD\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		d.get("http://www.anandabazar.com/");
		d.manage().window().maximize();

	}

}
