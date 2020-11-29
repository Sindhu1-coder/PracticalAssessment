package information;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import Information.base;
import pageObjects.Balanced;
import pageObjects.Conservative;
import pageObjects.Defensive;
import pageObjects.SaverKiwi;

public class InformationIcon extends base{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		InformationIcon ii = new InformationIcon();
		ii.basePageNavigation();
		

	}

	
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		//driver.get(prop.getProperty("url"));
		driver.get("https://www.westpac.co.nz/");
		SaverKiwi s = new SaverKiwi(driver);
		s.getCalculator().click();
		s.getClickStarted().click();
        Thread.sleep(2000L);		
        driver.switchTo().frame(0);
		Thread.sleep(2000L);
		s.getInformationMessage().click();
		System.out.println(s.getProjectionValueText().getText());
		
		

	}
	
	
	



}
