package propertiesFile;

import java.io.IOException;

public class FileReaderManager {
	
	  private FileReaderManager() {
	  
	 }
		
	public ConfigurationReader configReader() throws IOException {
		ConfigurationReader propdd = new ConfigurationReader();
		return propdd;
		
	}
	
	public static FileReaderManager fileReaderManagerInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;
		
	}
}
