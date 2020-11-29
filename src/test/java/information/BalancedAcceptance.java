package information;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Information.base;
import pageObjects.Balanced;
import pageObjects.SaverKiwi;

public class BalancedAcceptance extends base {

	public static void main(String[] args) throws IOException, InterruptedException {
    BalancedAcceptance ba = new BalancedAcceptance();
    ba.basePageNavigation();
	}
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
		driver = initializeDriver();
		driver.get("https://www.westpac.co.nz/");

		//driver.get(prop.getProperty("url"));
		SaverKiwi s = new SaverKiwi(driver);
		s.getCalculator().click();
		s.getClickStarted().click();
        Thread.sleep(2000L);		
        driver.switchTo().frame(0);
		Thread.sleep(2000L);
		Balanced b = new Balanced(driver);
		b.getCurrentage().sendKeys("55");
		b.getStatus().click();
		b.getKiwisaverBalance().sendKeys("140000");
		b.getVoluntryContribution().sendKeys("10");
		b.getFrequency().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.getRiskProfile().click();
		b.getSavingGoal().sendKeys("200000");
		b.getRetirementProjections().click();
		System.out.println(b.getProjectionsValue().getText());

	}	

}
