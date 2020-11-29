package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SaverKiwi {
	public WebDriver driver;

	
	By kiwisaver = By.xpath("//a[@id='ubermenu-section-link-kiwisaver-ps']");
	By kiwisaverCalculator = By.xpath("//a[@id='ubermenu-item-cta-kiwisaver-calculators-ps']");
	By clickhere = By.xpath("//a[contains(text(),'Click here to get started.')]");
	//By informationicon =By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/button[1]/i[1]");
	By informationicon =(By.cssSelector("div.ng-scope:nth-child(1) div.widget.widget-frame div.widget-stage div.widget-body div.inner-cell div.field-group-set:nth-child(1) div.field-group-set-frame div.wpnib-field-current-age.field-group.ng-isolate-scope div.field-constraints.has-field-info div.field-row div.field-cell.field-controls:nth-child(2) div.field-info.ng-scope div.field-info-inner div.field-info-cell div.ng-isolate-scope button.icon-target.icon-target-help-toggle.icon-btn.icon-btn-info.ir.ng-scope > i.icon"));
	By currentage = By.xpath("//div[@id='widget']/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div/div/input");	
	By status = By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div/div");
	By Employed = By.xpath("//span[contains(text(),'Employed')]");
	By yearsalary = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By contribution = By.xpath("//input[@id='radio-option-04F']");
	By defensive = By.xpath("//input[@id='radio-option-013']");
	By retirementprojection = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]/span[2]");
    By projectionValue = By.xpath("//p[contains(text(),'This calculator has an age limit of 18 to 64 years')]");
	
public SaverKiwi(WebDriver driver) {
	this.driver = driver;
	}


public WebElement getCalculator() throws InterruptedException
{
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(kiwisaver)).build().perform();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver.findElement(kiwisaverCalculator);	

}

	
public WebElement getClickStarted()
{
	return driver.findElement(clickhere);
}
public WebElement getInformationMessage()
{
	return driver.findElement(informationicon);
}
public WebElement getProjectionValueText()
{
	return driver.findElement(projectionValue);
}
}