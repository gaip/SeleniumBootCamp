package sundaysession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MethodsLocators {
    private WebDriver driver;

    @FindBy(name = "Full Name*")
    WebElement heading;

    @FindBy(name="Last Name")
    WebElement developer_email;

    @FindBy(name="Male")
    WebElement male;

    @FindBy(css= "div.form-group:nth-child(2) > label:nth-child(1)")
    WebElement developer_password;
/*
    @FindBy(id = "developer_password_confirmation")
    WebElement developer_password_confirmation;

    @FindBy(id = "developer_full_name")
    WebElement developer_full_name;

    @FindBy(id = "developer_skype")
    WebElement developer_skype;

    @FindBy(id ="save_new_developer")
    WebElement join_toptal_button;
 */

    public MethodsLocators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getHeading() {
        return heading;
    }

    public void setHeading(WebElement heading) {
        this.heading = heading;
    }

    public WebElement getDeveloper_email() {
        return developer_email;
    }

    public void setDeveloper_email(WebElement developer_email) {
        this.developer_email = developer_email;
    }

    public WebElement getMale() {
        return male;
    }

    public void setMale(WebElement male) {
        this.male = male;
    }

    public WebElement getDeveloper_password() {
        return developer_password;
    }

    public void setDeveloper_password(WebElement developer_password) {
        this.developer_password = developer_password;
    }

    public void click(WebElement id){
        id.click();
    }

}
