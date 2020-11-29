package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Conservative {
	
	public WebDriver driver;
	By currentage = By.xpath("//div[@id='widget']/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/input");
	By status = By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div");
	By selfEmployed = By.xpath("//span[contains(text(),'Self-employed')]");
	By kiwisaverBalance = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By contribution = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By frequency = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
	By fortnightly = By.xpath("//span[contains(text(),'Fortnightly')]");	
	By conservative = By.xpath("//input[@id='radio-option-016']");
	By savingGoal = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By retirementprojection = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[2]");
	By projectionValue = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
	
public Conservative(WebDriver driver) {
		this.driver = driver;
		}

public WebElement getCurrentage()
	{
		return driver.findElement(currentage);
	}
public WebElement getStatus()
{
	driver.findElement(status).click();
	return driver.findElement(selfEmployed);
} 
public WebElement getKiwisaverBalance()
{
	return driver.findElement(kiwisaverBalance);
}
public WebElement getVoluntryContribution()
{
	return driver.findElement(contribution);
}
public WebElement getFrequency() throws InterruptedException
{
	driver.findElement(frequency).click();
	Thread.sleep(2000L);
	return driver.findElement(fortnightly);
}
public WebElement getRiskProfile()
{
	return driver.findElement(conservative);
} 
public WebElement getSavingGoal()
{
	return driver.findElement(savingGoal);
}
public WebElement getRetirementProjections()
{
	return driver.findElement(retirementprojection);
} 
public WebElement getProjectionsValue()
{
	return driver.findElement(projectionValue);
}

}
