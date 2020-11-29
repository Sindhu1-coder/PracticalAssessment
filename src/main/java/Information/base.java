package Information;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
	{
prop = new Properties();
FileInputStream fis = new FileInputStream("C:\\Users\\arava\\Selenium\\workspace\\assessment\\src\\main\\java\\Information\\data.properties");
prop.load(fis);
String browserName = prop.getProperty("browser");

if(browserName.equals("chrome"))
{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
}
else if (browserName.equals("firefox"))
{
	driver = new FirefoxDriver();
	
}

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
}

}
