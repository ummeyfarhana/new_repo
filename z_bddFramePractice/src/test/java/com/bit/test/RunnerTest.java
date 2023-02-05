package com.bit.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\Users\\u_far\\eclipse-workspace\\z_bddFramePractice\\practiceLogin.feature"}
,glue= {"com.bit.test"},dryRun=true,plugin="preety")

public class RunnerTest {

}
