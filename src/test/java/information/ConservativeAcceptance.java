package information;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Information.base;
import pageObjects.Conservative;
import pageObjects.SaverKiwi;

public class ConservativeAcceptance extends base{

	public static void main(String[] args) throws IOException, InterruptedException {
	ConservativeAcceptance ca = new ConservativeAcceptance();
	ca.basePageNavigation();

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
		Conservative c = new Conservative(driver);
		c.getCurrentage().sendKeys("45");
		c.getStatus().click();
		c.getKiwisaverBalance().sendKeys("100000");
		c.getVoluntryContribution().sendKeys("90");
		c.getFrequency().click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		c.getRiskProfile().click();
		c.getSavingGoal().sendKeys("290000");
		c.getRetirementProjections().click();
		System.out.println(c.getProjectionsValue().getText());
	}		

}
