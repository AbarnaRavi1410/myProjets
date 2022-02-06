package BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver selectBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\Driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);

	}

	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static boolean displayCheck(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static void clikable(WebElement element) {
		element.click();
	}

	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("byIndex")) {
			int temp = Integer.parseInt(value);
			s.selectByIndex(temp);
		} else if (type.equalsIgnoreCase("byVissibleText")) {
			s.selectByVisibleText(value);
		}

	}

	public static void timeout(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);

	}

	public static void threadSleep(int timeout) throws InterruptedException {
		Thread.sleep(timeout);

	}

	public static void explicitwait(WebElement element, String type, int time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		if (type.equalsIgnoreCase("visibilityOf")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		}

	}

	public static void close() {
		driver.close();

	}
	
	public static void screenshort(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\837016\\eclipse-workspace-New\\MyProject\\target\\"+name+".png");
		FileUtils.copyFile(source,destination);
	}

}
