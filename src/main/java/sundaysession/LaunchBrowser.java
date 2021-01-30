package sundaysession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

    public static void main(String[] args) {
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        driver.get("https://demoqa.com/browser-windows");
        driver.switchTo().frame(0);
        driver.getWindowHandles();

        driver.switchTo().alert().accept();
        String mainWindoww=driver.getWindowHandle();
        System.out.println(mainWindoww);
        driver.quit();
}
}
