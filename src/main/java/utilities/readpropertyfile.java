package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.internal.Utils;

public class readpropertyfile {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				"C:\\Users\\91956\\eclipse-workspace\\Automation\\Jacobframework\\src\\test\\resources\\configfiles\\config.properties");

		Properties p = new Properties();
		p.load(fr);

	}
	public static Logger log = LogManager.getLogger(Utils.class.getName());
	public static Properties loadConfig(String filePath) {
		Properties prop = null;
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(filePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			log.error("File not given on location: "+filePath);
		} catch (IOException e) {
			log.error("Unale to read the file");
		}
		return prop;
	}


}
