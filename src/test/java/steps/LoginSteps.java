package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class LoginSteps extends CommonMethods {

    //public WebDriver driver;

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws InterruptedException {
        //driver= new ChromeDriver();
       // driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        // Write code here that turns the phrase above into concrete actions
        // Thread.sleep(2000);
        //driver.manage().timeout().implicitlyWait(Duration.ofSeconds(10));
        openBrowserAndLaunchApplication();

    }
    @When("user enters admin username and passowrd")
    public void user_enters_admin_username_and_passowrd() throws  InterruptedException {
        //object of the login page to access of the web elements
       // LoginPage lp=new LoginPage();
        //WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='txtUsername']"));
       // usernameTextField.sendKeys("admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        sendText(loginPage.usernameTextField, ConfigReader.getPropertValue("username"));
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //WebElement passwordTextField = driver.findElement(By.cssSelector("input#txtPassword"));
       // passwordTextField.sendKeys("Hum@nhrm123");
        // Write code here that turns the phrase above into concrete actions
sendText(loginPage.passWordTextField, ConfigReader.getPropertValue("password"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() throws InterruptedException {
       // LoginPage lp=new LoginPage();
        //WebElement loginButton = driver.findElement(By.xpath("//*[@value='LOGIN']"));
        click(loginPage.logBtn);

        //loginButton.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Thread.sleep(2000);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("user is successully logged in")
    public void user_is_successully_logged_in() {
        System.out.println("My test passed");
    }

}