package runnerTests;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import propertiesFile.FileReaderManager;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\feature",
						glue = "stepDefinitions", monochrome = true,
						plugin = {"pretty","html:report.html"})
								//"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report1.html"})

public class RunnerTest {
	public static WebDriver driver;

	@BeforeClass
	public static void launchBrowser() throws IOException {
		WebDriver selectBrowser = BaseClass.selectBrowser(FileReaderManager.fileReaderManagerInstance().configReader().getBrowserName());
		BaseClass.timeout(3000);
	}
	
	@AfterClass
	public static void showdown() {
		BaseClass.close();

	}
}
		
	

