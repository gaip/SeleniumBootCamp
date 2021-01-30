package saturday30;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class Table {
    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        driver.get("http://the-internet.herokuapp.com/tables");

      //  WebElement  webtable = driver.findElement(By.xpath("//div[contains(@cssSelector,'\"#table1\"\"')]"));

        //Get rows which has data
      //  List<WebElement> rowsWithData = webtable.findElements(By.xpath(".//div[contains(@id,'table1') and text()]/ancestor::div[contains(@class,'tablesorter')]"));

        //Get number of rows In table.
        WebElement table = driver.findElement(By.id("table1"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        //Print data from each row (Data from each td tag)
        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }
        driver.quit();
    }
}
