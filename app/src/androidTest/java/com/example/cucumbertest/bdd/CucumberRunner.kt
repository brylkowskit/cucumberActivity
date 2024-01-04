package com.example.cucumbertest.bdd

import io.cucumber.android.runner.CucumberAndroidJUnitRunner
import io.cucumber.junit.CucumberOptions

@CucumberOptions(
    features = ["features"],
    glue = ["com.example.cucumbertest.bdd"],
)
class CucumberRunner: CucumberAndroidJUnitRunner()
