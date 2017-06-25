package com.mv;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target//test-results//facebook//cucumber-html-report","junit:target//test-results//facebook//cucumber-junit-report.xml","json:target//test-results//facebook//cucumber.json"},
        glue = {"classpath:com/mv"},
       // features = "C:\\Users\\NewPC\\IdeaProjects\\mt\\src\\main\\java\\cucumberFeature",
        features = "src\\main\\java\\cucumberFeature",
        strict = true,
        tags = {"@facebookIntegration"})
public class CukeRunner {
    @BeforeClass
    public static void loadProperties() throws IOException {

    }




}
