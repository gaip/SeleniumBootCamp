package saturday30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


  public class AssignmentInHous {
        public static void main(String[] args) {


            ChromeOptions chromeOptions = new ChromeOptions();
            WebDriverManager.chromedriver().setup();
            chromeOptions.addArguments("disable-infobars");
            WebDriver driver = new ChromeDriver(chromeOptions);

            // Navigate to the demoqa website
            driver.get("http://the-internet.herokuapp.com/windows");
            WebElement link = driver.findElement(By.linkText("Click Here"));
            link.click();
            List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(browserTabs.get(1));
            WebElement text = driver.findElement(By.xpath("//*[contains(text(), 'New Window')]"));
            driver.close();
            driver.switchTo().window(browserTabs.get(0));



            String mainWindow = driver.getWindowHandle();
            Set<String> allwindows  = driver.getWindowHandles();
            System.out.println(allwindows);
            allwindows.remove(mainWindow);
            for (String win :allwindows){
                driver.switchTo().window(win);
                System.out.println("win "+win);
            }
            WebElement windowbutton= driver.findElement(By.id("windowButton"));
            windowbutton.click();
            System.out.println(windowbutton);
        /*
        driver.switchTo().frame(0);
        driver.getWindowHandles();
        driver.switchTo().alert().accept();
        String mainWindow = driver.getWindowHandle();
        System.out.println("main window"+mainWindow);
        */
            driver.quit();
        }
    }



