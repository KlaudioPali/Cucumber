package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class DashboardPage extends CommonMethods {

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement pimButton;

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement empListButton;

    @FindBy (id = "menu_pim_viewPimModule")
    public WebElement addEmployeeButton;

    public DashboardPage(){
        PageFactory.initElements(driver,this);

    }
}
