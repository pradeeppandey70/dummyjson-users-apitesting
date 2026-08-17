package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties prop = new Properties();
	private static final String path = System.getProperty("user.dir")+"/src/test/resources/configs/config.properties";
	
	static {
		try {
			FileInputStream fis = new FileInputStream(path);
			prop.load(fis);	
		}catch(IOException e ) {
			System.out.println("Unable to load config.properties File");
			
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}

}
