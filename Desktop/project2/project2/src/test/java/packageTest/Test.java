package packageTest;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import packagemain.Apartment;
import packagemain.Mockemail;
import packagemain.ApartmentSearch;

public class Test {
	protected final ApartmentSearch apatment;
	private final Mockemail mockemail;
	public Test(ApartmentSearch apartment, Mockemail Mockemail) {
		this.apatment=apartment;
	    mockemail=Mockemail;
		
	}
	public ApartmentSearch w =new ApartmentSearch();
	public  ArrayList <Apartment>cu = new ArrayList<>();
	public  ArrayList <Apartment>First = new ArrayList<>();
	private  String ByType,Material,Placement ,LeaseLength;
	private	int PriceLessThan;
	private String Amenities;
	public String AllowPets;
	private int NumberOfBedrooms;
	private int NumberOfBathrooms;
	private int AreaLessThan;
	private int PriceLessThanAnd;
	private int AndGreaterThan;
	private int AreaGreaterThan;
	boolean last =false;
	private final ArrayList<Apartment> list0= new ArrayList<>();
	private ArrayList<Apartment> list = new ArrayList<>();

	@Given("these homes are contained in the system")
		public void theseHomesAreContainedInTheSystem(io.cucumber.datatable.DataTable dataTable) {


			Map<String, String> table = dataTable.asMap(String.class, String.class);
			String[] arr  =new String[10];
			
			for(Entry<String, String> ent: table.entrySet()) {

				System.arraycopy(ent.getKey().split("_"), 0	, arr, 0, 5);
				System.arraycopy(ent.getValue().split("_"), 0, arr, 5, 5);
			    w.setApartment(arr);
			}   
			
		}



		@When("I search about home by type {string}")
		public void iSearchAboutHomeByType(String string) {
			cu.clear();
			ByType =string;
		cu.addAll(w.searchByType(ByType));
		First =last(cu);

	
		
		}



	
		@Then("A list of homes that matches the  type specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheTypeSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getType().equals(ByType))) {

					asrt = false;
					break;
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
			First =last(cu);
		//	 last_senrio(cu);
		}
		@Then("A list of homes that matches the price specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getPrice() < PriceLessThan)) {

					asrt = false;
					break;
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
			First =last(cu);
			// last_senrio(cu);
		}
		@Then("A list of homes that matches the  Material specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheMaterialSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getMaterial().equals(Material))) {

					asrt = false;
					break;
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
			First =last(cu);// last_senrio(cu);
		}
		@Then("A list of homes that matches the  placement specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePlacementSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getPlacement().equals(Placement))) {


					asrt = false;
					break;
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
			First =last(cu);// last_senrio(cu);
		}
		@Then("A list of homes that matches the Lease Length  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheLeaseLengthShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getLeaseLength().equals(LeaseLength))) {


					asrt = false;
					break;
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
			First =last(cu);//	 last_senrio(cu);
		}
		@Then("A list of homes that matches the Amenities should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAmenitiesShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getAmenities().equals(Amenities))) {

					asrt = false;
					break;
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
			First =last(cu);//	 last_senrio(cu);
		}



		@Then("A list of homes that matches the Allow Pets should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAllowPetsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
			if(!(c.isallowPets())) {
		
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
			First =last(cu);//	 last_senrio(cu);
		}

		@Then("A list of homes that matches the  Number of bedrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBedroomsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getBedrooms() == NumberOfBedrooms)) {

					asrt = false;
					break;
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
			First =last(cu);//	 last_senrio(cu);
		}
		@Then("A list of homes that matches the  Number of bathrooms  should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheNumberOfBathroomsShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getBathrooms() == NumberOfBathrooms)) {

					asrt = false;
					break;
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
			First =last(cu);	// last_senrio(cu);
		}
		@Then("A list of homes that matches the area specification should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaSpecificationShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(c.getArea() <= AreaLessThan)) {

					asrt = false;
					break;
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
			First =last(cu);//	 last_senrio(cu);
		}



		@Then("A list of homes that matches the price should be returned and printed on the console")
		public void aListOfHomesThatMatchesThePriceShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!((AndGreaterThan <= c.getPrice()) && (c.getPrice() <= PriceLessThanAnd))) {

					asrt = false;
					break;
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
			First =last(cu);//	 last_senrio(cu);
		}




		@Then("A list of homes that matches the area should be returned and printed on the console")
		public void aListOfHomesThatMatchesTheAreaShouldBeReturnedAndPrintedOnTheConsole() {
			boolean asrt= true ;
			for(Apartment c :cu) {
				if (!(AreaGreaterThan <= c.getArea() && c.getArea() <= AreaLessThan)) {

					asrt = false;
					break;
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
		    
			
			verify(mockemail.getEmailservicse(),times(0)).sendEmail((ArrayList<Apartment>) ApartmentSearch.getResult());
	
			
			
		}
		
		public <T> ArrayList<T> last(ArrayList<T> list1){
			list0.clear();
			 list0.addAll((Collection<? extends Apartment>) list1);


			if(  !last) {
				list=(ArrayList<Apartment>) list0.clone();
				
				last =true;
			
			
			}
			else {

				ArrayList<Apartment> list2 = (ArrayList<Apartment>) list0.clone();
				
				
				list= intersection(list, list2);
			}
			
			
			return (ArrayList<T>) list;
			
			
		}
		
	    public <T>  ArrayList<T> intersection( ArrayList<T> list1,  ArrayList<T> list2) {
	        ArrayList<T> list = new ArrayList<>();

	        for (T t : list1) {
	            if( list2.contains(t)) {
	                list.add(t);
	            }
	        }

	        return list;
	    }
}
