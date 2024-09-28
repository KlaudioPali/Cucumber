package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="textPassword")
    public WebElement passWordTextField;

    @FindBy(id="btnLogin")
    public WebElement logBtn;

    public LoginPage(){
        //our this code will initialize all the elements of the page
        //because when the object creates, constructors will be called which will
        //initialize all of these elements
        PageFactory.initElements(driver,this);
    }

}
