package com.cg.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features",
glue="com.cg.stepdef",
//,dryRun = true,
//monochrome = true
plugin = {"pretty","html:target/index.html","json:target/myjsonreport.json","rerun:target/failedcases.txt"}
)
public class TestRunner {

}
