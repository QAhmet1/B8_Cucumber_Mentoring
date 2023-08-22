package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseDriver;

public class Hooks {

    @Before // Runs before each scenario in the feature files
    public void beforeScenario(){
        System.out.println("Before Scenario runs");
    }

    @After // Runs after each scenario in the feature files
    public void afterScenario(){
    BaseDriver.quitDriver();
    }



}
