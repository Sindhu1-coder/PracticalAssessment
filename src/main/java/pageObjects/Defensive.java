package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Defensive {
	
	public WebDriver driver;
	By currentage = By.xpath("//div[@id='widget']/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/input");	
	By status = By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div");
	By Employed = By.xpath("//span[contains(text(),'Employed')]");
	By yearsalary = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By contribution = By.xpath("//input[@id='radio-option-04F']");
	By defensive = By.xpath("//input[@id='radio-option-013']");
	By retirementprojection = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[2]");
	By projectionValue = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");


public Defensive(WebDriver driver) {
	this.driver = driver;
	}

public WebElement getCurrentage()
{
	return driver.findElement(currentage);
}
public WebElement getStatus()
{
	driver.findElement(status).click();
	return driver.findElement(Employed);
} 
public WebElement getSalary()
{
	return driver.findElement(yearsalary);
} 
public WebElement getKiwisaverContribution()
{
	return driver.findElement(contribution);
} 
public WebElement getRiskProfile()
{
	return driver.findElement(defensive);
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
