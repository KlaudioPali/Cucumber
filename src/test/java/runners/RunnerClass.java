package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features we use to provide the path of all feature files
        features = "src/test/resources/features/",
        //glue is where we find implementation of gherkin steps
        //we provide the paths of package where we defined all of the steps def
        glue = "steps",
        dryRun =false,
        tags = "@smoke",
        //for generating the report

        //pretty is responsible for printing the steps and step definitions in the console
        //in your framework, all reports should be generated under target folder
        plugin= {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}

        /*dryRun it means if we set the value of dry run to true, it will stop the execution
        it quickly scans all the gherkin steps in all the feature files and will
        give you the missing step definition
        for actual execution, we need to set the value of it to false
        TAGS- will identify the scenarios in a group and will execute all the scenarios having these
        UTILS FOLDER - to create common methods class so that we can use all the
        common functions from this class
         */

)


public class RunnerClass {
    //it will be empty

}
