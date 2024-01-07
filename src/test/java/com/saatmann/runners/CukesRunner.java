package com.saatmann.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },

        features = "C:\\Users\\mesut\\IdeaProjects\\Saatmann_\\src\\test\\resources\\features",
        glue = "com/saatmann/step_definitions",
        dryRun = false,
        tags = "@smoke",
        publish = false
)

public class CukesRunner {
}
