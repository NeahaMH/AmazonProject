package basePackage;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import utilityPackage.UtilityClass;

public class BaseClass {
	public static WebDriver driver;
    public Properties prop;

    public BaseClass() {
        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "/Resources/config.properties");
            prop.load(fileInputStream);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
public void initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equals("edge")) {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new EdgeDriver();
        } else if (browserName.equals("opera")) {
            System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "/src/main/resources/Drivers/geckodriver.exe");
            driver = new SafariDriver();
        }
else {
            System.out.println("Please select correct browser name");
        }
        driver.navigate().to(prop.getProperty("url"));
//        driver.manage().timeouts().pageLoadTimeout((UtilityClass.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().pageLoadTimeout(UtilityClass.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(UtilityClass.IMPLICITLY_WAIT,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();


    }
}
