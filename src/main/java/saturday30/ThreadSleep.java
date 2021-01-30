package saturday30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class ThreadSleep {
    public static void main(String[] args) {


            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-popup-blocking");
            options.addArguments("test-type");
            Map<String, Object> prefs = new HashMap<String, Object>();
// Pass the argument 1 to allow and 2 to block
            prefs.put("profile.default_content_setting_values.cookies", 2);
            prefs.put("network.cookie.cookieBehavior", 2);
            prefs.put("profile.block_third_party_cookies", true);

            options.setExperimentalOption("prefs", prefs);
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver(options);
            driver.get("https://www.google.com/");


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement ele = driver.findElement(By.name("q"));
        ele.sendKeys("Hello");



    }

}
