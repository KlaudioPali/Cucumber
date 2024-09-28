package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {
    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    //this always executed at the ends irrespective of the result
    public void end(Scenario scenario){
        byte[]pic;
        //here we take the screenshot before closing browser
        //scenario class in cuc which always will give me the info of
        //the execution. it holds the complete info of the exec.
        //getName is the method which returns name of scenario
        if (scenario.isFailed()) {
            pic = takeScreenshot("failed/"+scenario.getName());
        }else {
            pic = takeScreenshot("passed/"+scenario.getName());


        }
        closeBrowser();
    }
}
