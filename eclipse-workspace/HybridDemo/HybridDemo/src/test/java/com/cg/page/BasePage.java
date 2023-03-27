package com.cg.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.customexception.BrowserNotSupported;

public class BasePage {

	public static WebDriver driver;
    Properties prop;
    String browsername;
	
	public BasePage() {
	
		prop=new Properties();
		try {
			prop.load(new FileInputStream("config//config.properties"));
			
			browsername=prop.getProperty("browser");
			if(browsername.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "driver1/chromedriver.exe");
				 driver=new ChromeDriver();
			}
			else if(browsername.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
				 driver=new FirefoxDriver();
			}
			else
			{
				// custom exp : BrowserNotSupported 
				throw new BrowserNotSupported(browsername+"This Browser is not supported for testing this applicatioin");
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotSupported e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	// page load
	
	public void pageLoad()
	{
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	
	
}
