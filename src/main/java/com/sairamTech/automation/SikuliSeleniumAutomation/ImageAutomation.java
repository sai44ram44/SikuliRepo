package com.sairamTech.automation.SikuliSeleniumAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ImageAutomation {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Sairam\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=kca0cG9fiQw");
		
		//click on pause
		Screen screen = new Screen();
		Pattern pauseClick = new Pattern("pauseclick");
		screen.wait(pauseClick,2000);
		screen.click();
		
		//click on play
		Pattern playClick = new Pattern("play");
		screen.wait(playClick,2000);
		screen.click();
		
		//click on settings
		Pattern settingsClick = new Pattern("settings");
		screen.wait(settingsClick,2000);
		screen.click();
		
		//click on the quality 
		Pattern qualityClick = new Pattern("quality");
		screen.wait(qualityClick,2000);
		screen.click();
		
		//click on the 144p
		Pattern lowClick = new Pattern("144p");
		screen.wait(lowClick,2000);
		screen.click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
