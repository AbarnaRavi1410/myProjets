package propertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties prop;

	public ConfigurationReader() throws IOException {

		File f = new File("src\\main\\java\\propertiesFile\\cofigNew.properties");
		FileInputStream fis = new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}

	public String getBrowserName() {
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		return browserName;
	}

	public String getUrl() {
		String urlLink = prop.getProperty("url");
		System.out.println(urlLink);
		return urlLink;
	}

}
