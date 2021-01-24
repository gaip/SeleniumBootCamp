package saturdaysession;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class LaunchBrowser {
    public static void main(String[] args) {

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "/home/onex/IdeaProjects/untitled/src/main/resources/chromedriver");


        DesiredCapabilities capabilities = new DesiredCapabilities();
        ChromeOptions opt = new ChromeOptions();

        opt.addArguments("--disable-notifications");

        //capabilities.setCapability("profile.default_content_setting_values.cookies",true);// 1:allow, 2:block
        opt.addArguments("--disable-popup-blocking");
       // opt.addArguments("start-maximized");
        opt.addArguments("safebrowsing.enabled", "false");
       //opt.addArguments("-incognito");
        opt.addArguments("--disable-popup-blocking");
        // Open the Chrome browser


        //ChromeDriver driver = new ChromeDriver(capabilities);
        driver = new ChromeDriver(opt);

        // driver.manage().window().maximize();
// get Title

        System.out.println(driver.getTitle());

// get current Url
        System.out.println(driver.getCurrentUrl());

//Deleting all the cookies
        driver.manage().deleteAllCookies();

//Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//launching the specified URL
        driver.get("https://www.google.com/");

//Locating the elements using name locator for the text box
        driver.findElement(By.name("q")).sendKeys("YouTube");

//name locator for google search button
        WebElement searchIcon = driver.findElement(By.xpath("//*[@focusable='false'][1]"));
        searchIcon.isDisplayed();

        // navigate and refresh

        searchIcon.click();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.navigate().back();


        driver.close();
    }


}