package com.example.cucumbertest.bdd

import androidx.compose.ui.test.junit4.createEmptyComposeRule
import androidx.test.core.app.ActivityScenario
import com.example.cucumbertest.MainActivity
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.cucumber.junit.WithJunitRule
import org.junit.Rule

@WithJunitRule
class TestSetup {
    private var scenario: ActivityScenario<*>? = null

    @get:Rule
    val composeTestRule = createEmptyComposeRule()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @After
    fun after() {
        scenario?.close()
    }

    @Given("I start app")
    fun start_app() {
        println("wait here")
    }

    @When("I wait for a moment")
    fun waitHere() {
        println("Wait a bit longer")
    }

    @Then("All worked out")
    fun allDone() {
        println("It's working")
    }
}