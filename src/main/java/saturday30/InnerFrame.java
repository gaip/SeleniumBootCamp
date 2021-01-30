package saturday30;

import com.nick318.search.by.frames.SearchByFrames;
import com.nick318.search.by.frames.SearchByFramesFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Optional;

public class InnerFrame {
    public static void main(String[] args) {


        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        chromeOptions.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(chromeOptions);

        // Navigate to the demoqa website
        driver.get("http://demo.automationtesting.in/Frames.html");
        try
        {
            driver. .frame(driver.find_element_by_id('frame_id'));

            elem.click();
            elem.sendKeys("Hello");
        }
        catch(NoSuchFrameException e)
        {
            System.out.println(e.getMessage());
        }

    }
}