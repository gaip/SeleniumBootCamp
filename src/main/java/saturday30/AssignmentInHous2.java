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
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;


public class AssignmentInHous2 {
      public static void main(String[] args) {


          ChromeOptions chromeOptions = new ChromeOptions();
          WebDriverManager.chromedriver().setup();
          chromeOptions.addArguments("disable-infobars");
          WebDriver driver = new ChromeDriver(chromeOptions);

          // Navigate to the demoqa website
          driver.get("https://demoqa.com/dynamic-properties");
          Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                  .withTimeout(Duration.ofSeconds(10))
                  .pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class);

          try {
              WebElement input = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("enableAfter"))));



              WebElement wait2 = wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("visibleAfter"))));

              //System.out.println("wait2 visible"+wait2);

              input.click();
              wait2.click();

          }catch (NoSuchElementException e){

              System.out.println(e);
          }
          driver.quit();
      }
  }



