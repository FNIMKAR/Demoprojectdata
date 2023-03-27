package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cg.page.BasePage;

public class CaptureScreeShot {

	// static method : to capture the screen save it into file
	public static void captureScreen()
	{
	   TakesScreenshot ts= (TakesScreenshot) BasePage.driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(ss,new File("./ScreenShot/failscreen.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
