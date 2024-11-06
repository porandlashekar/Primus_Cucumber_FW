package commonFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FunctionLibrary {
	public static WebDriver driver;

	public static WebDriver startBrowser() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	// Method for Launching URL
	public static void openUrl(String Url) {
		driver.get(Url);
	}

	// Method for WebElement to wait till load
	public static void waitForElement(String LocatorName, String LocatorValue, String TestData) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(TestData)));
		// ParseINT= is used to convert string type data into Integer type data
		if (LocatorName.equalsIgnoreCase("xpath")) {
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorValue)));
		}
		if (LocatorName.equalsIgnoreCase("id")) {
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.id(LocatorValue)));
		}
		if (LocatorName.equalsIgnoreCase("name")) {
			mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name(LocatorValue)));
		}
	}

	// method for type Action
	public static void typeAction(String LocatorName, String LocatorValue, String TestData) {
		if (LocatorName.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(LocatorValue)).clear();
			driver.findElement(By.xpath(LocatorValue)).sendKeys(TestData);
		}
		if (LocatorName.equalsIgnoreCase("id")) {
			driver.findElement(By.id(LocatorValue)).clear();
			driver.findElement(By.id(LocatorValue)).sendKeys(TestData);

		}
		if (LocatorName.equalsIgnoreCase("name")) {
			driver.findElement(By.name(LocatorValue)).clear();
			driver.findElement(By.name(LocatorValue)).sendKeys(TestData);

		}
	}

	// method for page click Action
	public static void clickAction(String LocatorName, String LocatorValue) {
		if (LocatorName.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(LocatorValue)).click();
		}
		if (LocatorName.equalsIgnoreCase("id")) {
			driver.findElement(By.id(LocatorValue)).sendKeys(Keys.ENTER);
		}
		if (LocatorName.equalsIgnoreCase("name")) {
			driver.findElement(By.name(LocatorValue)).click();
		}
	}

	// method for Page Title Validation
	public static void validateTitle(String Expected_Title) {
		String Actual_Title = driver.getTitle();
		try {
			Assert.assertEquals(Actual_Title, Expected_Title, "Title is not matching");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}
	}

	// method for ListBoxes selection
	public static void dropDownAction(String locatorName, String locatorValue, String tesData) {
		if (locatorName.equalsIgnoreCase("xpath")) {
//			int value = Integer.parseInt(tesData);
			Select element = new Select(driver.findElement(By.xpath(locatorValue)));
			element.selectByValue(tesData);
		}
		if (locatorName.equalsIgnoreCase("id")) {
			int value = Integer.parseInt(tesData);
			Select element = new Select(driver.findElement(By.id(locatorValue)));
			element.selectByIndex(value);
		}
		if (locatorName.equalsIgnoreCase("name")) {
			int value = Integer.parseInt(tesData);
			Select element = new Select(driver.findElement(By.name(locatorValue)));
			element.selectByIndex(value);
		}
	}
	public static void alertOk() throws Throwable {
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
	public static void closeBrowser() throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}

}
