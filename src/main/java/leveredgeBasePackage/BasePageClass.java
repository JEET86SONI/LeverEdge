package leveredgeBasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class BasePageClass {
	
private final static String filepath = "C:\\Users\\user\\eclipse-workspace\\LeverEdgeMavenProject\\src\\main\\java\\leveredgePropertiesFile\\config.properties";	
public static WebDriver driver;
public static Properties prop;

static String browserName;

static  FileInputStream fs = null;

public static void fileSetup() {
	try {
		fs = new FileInputStream(new File(filepath));
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	prop = new Properties();
	try {
		prop.load(fs);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}


public static void setUp() {

	fileSetup();
	
	browserName = prop.getProperty("browser");
	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("implicitwait")),TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	

public static void tearDown() {
	if(driver != null) {
		driver.quit();
	}
}

}
