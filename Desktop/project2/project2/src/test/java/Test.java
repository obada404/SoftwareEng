
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Test {
	private  Apartment_search apatment;
	private Mockemail mockemail;
	public Test(Apartment_search apartment,Mockemail Mockemail) {
		this.apatment=apartment;
	    mockemail=Mockemail;
		
	}
	public  Apartment_search w =new Apartment_search();
	public  ArrayList <Apartment>cu =new ArrayList<Apartment>();
	public  ArrayList <Apartment>First =new ArrayList<Apartment>();
	public  ArrayList <Apartment>s2ed =new ArrayList<Apartment>();
	public  ArrayList <ArrayList<Apartment>>all =new ArrayList<ArrayList<Apartment>>();
	private   Map<String, String> table=new HashMap<String, String>();
	private  String ByType,Material,Placement ,LeaseLength;
	private	int PriceLessThan;
	private String Amenities;
	private String AllowPets;
	private int NumberOfBedrooms;
	private int NumberOfBathrooms;
	private int AreaLessThan;
	private int PriceLessThanAnd;
	private int AndGreaterThan;
	private int AreaGreaterThan;

	private Apartment_search res;

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


    	private  void last_senrio(ArrayList <Apartment>cu) {
			if(First ==null)
				First =cu;
			else
				s2ed =cu;
			
			if(!( First ==null) && !(s2ed ==null))
				First= intersection(First,s2ed);
			 
			s2ed =null;
				
		}
		@When("I search about home by type {string}")
		public void iSearchAboutHomeByType(String string) {
			cu.clear();
			ByType =string;
		cu.addAll(w.searchByType(ByType));
		
		 last_senrio(cu);
	
		
		}



	
		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	c.getType().equals( ByType)	) {
				
			}
			else {
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByType ");

			w.print(cu);
			
		  
		}


		@When("I search about home with price less than {int}")
		public void iSearchAboutHomeWithPriceLessThan(Integer int1) {
			cu.clear();
			
			PriceLessThan =int1;
			cu.addAll(w.searchByRangeOfPrices(0, int1));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	c.getPrice()<PriceLessThan	) {
				
			}
			else {
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeWithPriceLessThan ");
			w.print(cu);
		}
		@When("I search about home by Material {string}")
		public void iSearchAboutHomeByMaterial(String string) {
			cu.clear();
			Material =string;
			cu.addAll( w.searchByMaterial(string));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the  Material specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	c.getMaterial().equals(Material)	) {
				
			}
			else {
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByMaterial ");
			w.print(cu);
		}

		
		@When("I search about home by placement {string}")
		public void iSearchAboutHomeByPlacement(String string) {
			cu.clear();
			Placement =string;
			cu.addAll( w.searchByPlacement(string));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the  placement specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	c.getPlacement().equals(Placement)) {
				
			}
			else {
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByPlacement ");
			w.print(cu);
		}
		@When("I search about home by Lease Length  {string}")
		public void iSearchAboutHomeByLeaseLength(String string) {
			cu.clear();
			LeaseLength =string;
			cu.addAll( w.searchByLease_Length(string));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the Lease Length  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheLeaseLengthShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	c.getLease_Length().equals(LeaseLength)) {
				
			}
			else {
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByLeaseLength ");
			w.print(cu);
		}
		@When("I search about home by Amenities {string}")
		public void iSearchAboutHomeByAmenities(String string) {
			Amenities =string;
			cu.clear();
			cu.addAll( w.searchByAmenities(string));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the Amenities should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAmenitiesShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(c.getAmenities().equals(Amenities))) {
	
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
	 		System.out.println("iSearchAboutHomeByAmenities");

			w.print(cu);
		}
		
		@When("I search about home by  Allow Pets {string}")
		public void iSearchAboutHomeByAllowPets(String string) {
			cu.clear();
			AllowPets =string;
			cu.addAll( w.searchByAllow_Pets(string));
			 last_senrio(cu);
		}



		@Then("A list of homes that matches the Allow Pets should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAllowPetsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(!(c.isAllow_Pets())) {
		
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
	 		System.out.println("iSearchAboutHomeByAllowPets");
			w.print(cu);
		}
		@When("I search about home by Number of bedrooms {int}")
		public void iSearchAboutHomeByNumberOfBedrooms(Integer int1) {
			NumberOfBedrooms =int1;
			cu.clear();
			cu.addAll( w.searchBybedrooms(int1));
			 last_senrio(cu);
		}

		@Then("A list of homes that matches the  Number of bedrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(c.getBedrooms()==NumberOfBedrooms)) {
				
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
	 		System.out.println("iSearchAboutHomeByNumberOfBedrooms");

			w.print(cu);
			
		}
		@When("I search about home by Number of bathrooms {int}")
		public void iSearchAboutHomeByNumberOfBathrooms(Integer int1) {
			cu.clear();
			NumberOfBathrooms =int1;
			cu.addAll(w.searchBybathrooms(int1));
			 last_senrio(cu);
		}
		@Then("A list of homes that matches the  Number of bathrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(c.getBathrooms()==NumberOfBathrooms)) {
				
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByNumberOfBathrooms");
         w.print(cu);
 	
		}

		
		
		
		@When("I search about home by area less than {int}")
		public void iSearchAboutHomeByAreaLessThan(Integer int1) {
			cu.clear();
			AreaLessThan =int1;
			cu.addAll( w.searchByRangeOfAreas(0, int1));
			// last_senrio(cu);
		}
		@Then("A list of homes that matches the area specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(c.getArea()<=AreaLessThan)) {
				
				asrt =false ;
			}
			
				}
			System.out.println("iSearchAboutHomeByAreaLessThan");
			w.print(cu);
			assertTrue(asrt);
		
			
		}

		
		
		@When("I search about home by price less than {int} and Greater than {int}")
		public void iSearchAboutHomeByPriceLessThanAndGreaterThan(Integer int1, Integer int2) {
			cu.clear();
			AndGreaterThan=int1;
			  PriceLessThanAnd=int2;
			cu.addAll( w.searchByRangeOfPrices(int1, int2));
			 last_senrio(cu);
		}



		@Then("A list of homes that matches the price should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(  (AndGreaterThan<=c.getPrice()) &&  (c.getPrice()<=PriceLessThanAnd ))) {
				
				asrt =false ;
			}
			
				}
			System.out.println("iSearchAboutHomeByPriceLessThanAndGreaterThan");	
			 w.print(cu);
			assertTrue(asrt);


		}

		@When("I search about home by area less than {int} and Greater than {int}")
		public void iSearchAboutHomeByAreaLessThanAndGreaterThan(Integer int1, Integer int2) {
			AreaLessThan =int2;
			AreaGreaterThan=int1;
			cu.clear();
			cu.addAll(  w.searchByRangeOfAreas(int1, int2));
			 last_senrio(cu);
		}




		@Then("A list of homes that matches the area should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(	!(  AreaGreaterThan<=c.getArea() &&  c.getArea()<=AreaLessThan )) {
				
				asrt =false ;
			}
			
				}
			
			assertTrue(asrt);
			System.out.println("iSearchAboutHomeByAreaLessThanAndGreaterThan");
			 w.print(cu);
		}
		
	

		@Then("A list of homes that matches the this Combination should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheThisCombinationShouldBeReturnedAndPrintedOnTheConsole() {
			System.out.println(" last sinario");
			w.print(First);
		}
		
		
		@Then("email with the result shoud be send to {string}")
		public void emailWithTheResultShoudBeSendTo(String string) {
		    
			
			verify(mockemail.getEmailservicse(),times(0)).sendEmail(string,Apartment_search.result);
	
			
			
		}
		
	    public <T>  ArrayList<T> intersection( ArrayList<T> list1,  ArrayList<T> list2) {
	        ArrayList<T> list = new ArrayList<T>();

	        for (T t : list1) {
	            if(list2.contains(t)) {
	                list.add(t);
	            }
	        }

	        return list;
	    }
}
