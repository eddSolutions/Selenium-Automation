package PackageTestSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

@SuppressWarnings("unused")
public class TestSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		
		String service = "C:\\Program Files\\geckodriver-v0.14.0-winX64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", service);	
		WebDriver  driver = new FirefoxDriver();
		String[] names = {"ARMANDO", "ESMERALDA", "EDUARDO"};
		String[] lastnames = {"VILLARREAL", "GUTIERREZ", "CASTILLO"};
		String[] dates = {"26/07/1987", "16/01/1999", "09/12/1990"};
		
		for(int i=0;i<3;i++){
			driver.get("http://toolsqa.com/automation-practice-form/");		
			driver.findElement(By.name("firstname")).sendKeys(names[i]);
			driver.findElement(By.name("lastname")).sendKeys(lastnames[i]);
			driver.findElement(By.id("sex-1")).click();
			
			//driver.findElement(By.id("exp-5")).click();
			List<WebElement> exp = driver.findElements(By.name("exp"));
			exp.get(3).click();
			
			driver.findElement(By.id("datepicker")).sendKeys(dates[i]);
			driver.findElement(By.id("profession-1")).click();
			driver.findElement(By.id("photo")).sendKeys("C:\\Users\\IBM_ADMIN\\Pictures\\coffee.png");
			//driver.findElement(By.linkText("Test File to Download")).click();
			
			//driver.findElement(By.id("tool-1")).click();
			List<WebElement> tool = driver.findElements(By.name("tool"));
			tool.get(0).click();
			tool.get(2).click();
			
			new Select(driver.findElement(By.id("continents"))).selectByVisibleText("Antartica");
			new Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("Wait Commands");
			new Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("Browser Commands");
			driver.findElement(By.id("submit")).click();
		}
        driver.close();
    }

}
