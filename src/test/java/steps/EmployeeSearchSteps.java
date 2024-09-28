package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.time.Duration;

public class EmployeeSearchSteps extends CommonMethods {
    public WebDriver driver;


    @When("user enters admin username and password")
    public void user_enters_admin_username_and_password() {
        WebElement usernameTextField = driver.findElement(By.xpath("//*[@id='txtUsername']"));
        usernameTextField.sendKeys("admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement passwordTextField = driver.findElement(By.cssSelector("input#txtPassword"));
        passwordTextField.sendKeys("Hum@nhrm123");
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement loginButton = driver.findElement(By.xpath("//*[@value='LOGIN']"));
        loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption= driver.findElement(By.id("menu_pim_viewPimModule"));
       // pimOption.click();
       click(pimOption);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }


    @When("user clicks on Employee List Option")
    public void user_clicks_on_employee_list_option() {
        WebElement empList0ption = driver.findElement(By.xpath("menu_pim_viewEmployeeList"));
        click(empList0ption);
        //empList0ption.click();
    }


    @When("user enters employee id")
    public void user_enters_employee_id() {
        WebElement empIdTextBox = driver.findElement(By.id("empsearch_id"));
        sendText(empIdTextBox, "110208A");
        //empIdTextBox.sendKeys("110208A");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
        WebElement nameTextField = driver.findElement((By.xpath("empsearch_employee_name_empName")));
        //nameTextField.sendKeys("mali");
        sendText(nameTextField,"mali");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        WebElement searchButton= driver.findElement(By.id("searchBtn"));
        click(searchButton);
        //searchButton.click();

    }

    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("test passed");
    }
}