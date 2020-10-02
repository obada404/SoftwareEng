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
	public  ArrayList <Apartment>cu =new ArrayList<Apartment>();
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
			
		}



		@When("I search about home by type {string}")
		public void iSearchAboutHomeByType(String string) {
		cu.addAll(w.searchByType(string));
		}
		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
			
		  
		}


		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
			cu.addAll(w.searchByRangeOfPrices(0, int1));
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}
		@When("I search about home by Material {string}")
		public void iSearchAboutHomeByMaterial(String string) {
			cu.addAll( w.searchByMaterial(string));
		}
		@Then("A list of homes that matches the  Material specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}

		
		@When("I search about home by placement {string}")
		public void iSearchAboutHomeByPlacement(String string) {
			cu.addAll( w.searchByPlacement(string));
		}
		@Then("A list of homes that matches the  placement specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}
		@When("I search about home by Lease Length  {string}")
		public void iSearchAboutHomeByLeaseLength(String string) {
			cu.addAll( w.searchByLease_Length(string));
		}
		@Then("A list of homes that matches the Lease Length  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheLeaseLengthShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}
		@When("I search about home by Amenities {string}")
		public void iSearchAboutHomeByAmenities(String string) {
			cu.addAll( w.searchByAmenities(string));
		}
		@Then("A list of homes that matches the Amenities should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAmenitiesShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}
		
		@When("I search about home by  Allow Pets {string}")
		public void iSearchAboutHomeByAllowPets(String string) {
			cu.addAll( w.searchByAllow_Pets(string));
		}



		@Then("A list of homes that matches the Allow Pets should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAllowPetsShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}
		@When("I search about home by Number of bedrooms {int}")
		public void iSearchAboutHomeByNumberOfBedrooms(Integer int1) {
			cu.addAll( w.searchBybedrooms(int1));
		}

		@Then("A list of homes that matches the  Number of bedrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
			
		}
		@When("I search about home by Number of bathrooms {int}")
		public void iSearchAboutHomeByNumberOfBathrooms(Integer int1) {
			cu.addAll(w.searchBybathrooms(int1));
		}
		@Then("A list of homes that matches the  Number of bathrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
         w.print(cu);
		}

		
		
		
		@When("I search about home by area less than {int}")
		public void iSearchAboutHomeByAreaLessThan(Integer int1) {
			cu.addAll( w.searchByRangeOfAreas(0, int1));
		}
		@Then("A list of homes that matches the area specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}

		
		
		@When("I search about home by price less than {int} and Greater than {int}")
		public void iSearchAboutHomeByPriceLessThanAndGreaterThan(Integer int1, Integer int2) {
			cu.addAll( w.searchByRangeOfPrices(int1, int2));
		}



		@Then("A list of homes that matches the price should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceShouldBeReturnedAndPrintedOnTheConsole() {
			 w.print(cu);
		}

		@When("I search about home by area less than {int} and Greater than {int}")
		public void iSearchAboutHomeByAreaLessThanAndGreaterThan(Integer int1, Integer int2) {
			cu.addAll(  w.searchByRangeOfAreas(int1, int2));
		}




		@Then("A list of homes that matches the area should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaShouldBeReturnedAndPrintedOnTheConsole() {
			 w.print(cu);
		}
		
	

		@Then("A list of homes that matches the this Combination should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheThisCombinationShouldBeReturnedAndPrintedOnTheConsole() {
			w.print(cu);
		}



}