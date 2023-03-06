package utilityPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basePackage.BaseClass;

public class UtilityClass extends BaseClass{

	public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICITLY_WAIT = 20;


    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) throws InterruptedException {
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        WebDriverWait wait = new WebDriverWait(driver, IMPLICITLY_WAIT);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        Thread.sleep(5000);
    }
}
