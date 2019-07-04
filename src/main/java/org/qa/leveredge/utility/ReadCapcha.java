package org.qa.leveredge.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import leveredgeBasePackage.BasePageClass;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadCapcha extends BasePageClass{
	
	@FindBy(id ="captcha")
	static WebElement capcha;
	
	public ReadCapcha() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static void takeImage() throws TesseractException, InterruptedException {
		
		String path = "D:\\Automation\\capcha.png";
		Thread.sleep(5000);
		File src = capcha.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File(path));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	    ITesseract image = new Tesseract();
		String imageText = image.doOCR(new File(path));
		
	}
	

}
