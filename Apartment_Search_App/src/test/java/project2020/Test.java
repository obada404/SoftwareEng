package project2020;


import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {
	public  Apartment_search w =new Apartment_search();
	public  ArrayList <Apartment>cu;
	private   Map<String, String> table=new HashMap<String, String>();
		@Given("these homes are contained in the system")
		public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {
			
		
			table =  dataTable.asMap(String.class, String.class);
			String[] arr  =new String[10];
			
			for(Entry<String, String> ent:table.entrySet()) {
			//	System.out.println(ent.getKey());
				System.arraycopy(ent.getKey().split("_"), 0	, arr, 0, 5);
				System.arraycopy(ent.getValue().split("_"), 0, arr, 5, 5);
			    w.setApartment(arr);
			}
			
			
			
		    // Write code here that turns the phrase above into concrete actions
		    // For automatic transformation, change DataTable to one of
		    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		    // Double, Byte, Short, Long, BigInteger or BigDecimal.
		    //
		    // For other transformations you can register a DataTableType.
		   
		}



		@When("I search about home by {string}")
		public void iSearchAboutHomeBy(String string) {
		cu=  w.searchByType(string);
		}
		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
			
		  
		}


		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
			cu=w.searchByRangeOfPrices(0, int1);
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}

		
		
		@Then("A list of homes that matches the  Material specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		




		
		@When("I search about home by {int}")
		public void iSearchAboutHomeBy(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}



		@Then("A list of homes that matches the  Number of bathrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

}
