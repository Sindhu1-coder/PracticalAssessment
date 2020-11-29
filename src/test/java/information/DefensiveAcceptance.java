package information;

import java.io.IOException;

import Information.base;
import pageObjects.Defensive;
import pageObjects.SaverKiwi;

public class DefensiveAcceptance extends base {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		DefensiveAcceptance us = new DefensiveAcceptance();
		us.basePageNavigation();
		

	}
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		driver.get("https://www.westpac.co.nz/");
		SaverKiwi s = new SaverKiwi(driver);
		s.getCalculator().click();
		s.getClickStarted().click();
        Thread.sleep(2000L);		
        driver.switchTo().frame(0);
		Thread.sleep(2000L);
		Defensive d = new Defensive(driver);
		d.getCurrentage().sendKeys("30");
		d.getStatus().click();
		d.getSalary().sendKeys("82000");
		d.getKiwisaverContribution().click();
		d.getRiskProfile().click();
		d.getRetirementProjections().click();
		System.out.println(d.getProjectionsValue().getText());
	
}
}
