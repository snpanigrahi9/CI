package com.ci;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkin {

	public static void main(String[] args) {

		//adding comment
		//adding another comment
		//all
		System.setProperty("webdriver.chrome.driver","D:\\Workspace\\CI\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(55,TimeUnit.SECONDS);
		
		d.get("http://www.anandabazar.com/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.manage().window().maximize();

	}

}
