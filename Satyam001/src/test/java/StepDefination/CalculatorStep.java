package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStep {
 int a;
 int b;
 int c;
 
 @Given("User enter the first {int}")
 public void user_enter_the_first(Integer int1) {
    a=int1;
 }

 @Given("User enter the second digit {int}")
 public void user_enter_the_second_digit(Integer int2) {
	b=int2;
    		 }

 @When("Add both digits")
 public void add_both_digits() {
     c=a+b;
 }

 @Then("Verify Addition of two digit are {int}")
 public void verify_addition_of_two_digit_are(Integer result) {
    
	if (c==result) {
    	System.out.println(result);
    }
 }

}
