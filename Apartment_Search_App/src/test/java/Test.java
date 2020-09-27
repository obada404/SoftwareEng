

import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	public   ArrayList <String> table  ;

		@Given("these homes are contained in the system")
		public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {
			
			
			
			
			
			
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
		    throw new io.cucumber.java.PendingException();
		}



		@When("I search about home by {string}")
		public void iSearchAboutHomeBy(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}


		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}
