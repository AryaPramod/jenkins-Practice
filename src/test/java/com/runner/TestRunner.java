package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="./src/test/resources/demo.feature",
			glue="com.runner",
			plugin= {
					"pretty","io.qameta.allure.cucmber7jvm.AllureCucumber7Jvm"
			}
//		tags="@Completed"
			
			
			
			
			)
	public class TestRunner {
		
	}


