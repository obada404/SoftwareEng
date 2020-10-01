Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                |APARTMENT_BRICK_VILAGE_NO_SWIMMINGPOOL|100_120_4_2_6|
                 |HOUSE_STONE_VILLAGE_NO_SWIMMINGPOOL|150_120_3_2_12|
         
               
  Scenario Outline: Search home by type
  When I search about home by "HOUSE"
  Then A list of homes that matches the  type specification should be returned and printed on the console

    Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console

@byMaterial
Scenario: Search home by Material
  When I search about home by "BRICK"
  Then A list of homes that matches the  Material specification should be returned and printed on the console
  
  
    @byplacement
 Scenario Outline: Search home by placement
  When I search about home by "CITY"
  Then A list of homes that matches the  placement specification should be returned and printed on the console
  
  
  @ByLeaseLength 
   Scenario: Search home  by Lease Length 
  When I search about home by "short term_6 months"
  Then A list of homes that matches the Lease Length  should be returned and printed on the console
  
  
 
   @Amenities
   Scenario: Search home  by Amenities
  When I search about home by "Balcony"
  Then A list of homes that matches the Amenities should be returned and printed on the console
  @ByAllowPets
    Scenario: Search home  By Allow Pets
  When I search about home by "yas"
  Then A list of homes that matches the Allow Pets should be returned and printed on the console
  @bedrooms
   Scenario: Search home by Number of bedrooms
  When I search about home by 1
  Then A list of homes that matches the  Number of bedrooms  should be returned and printed on the console
  @bathrom
     Scenario: Search home by Number of bathrooms
  When I search about home by 1
  Then A list of homes that matches the  Number of bathrooms  should be returned and printed on the console
     @byprice
Scenario: Search about home by price less than number
    When I search about home by price less than 200
    Then A list of homes that matches the price  should be returned and printed on the console
   
@byArea
 Scenario: Search about home by  area less than number
    When I search about home by area less than 150
    Then A list of homes that matches the area specification should be returned and printed on the console
    
    
    
         @byprice1
Scenario: Search about home by  price between two number
    When I search about home by price less than 200 and Greater than 400
    
    Then A list of homes that matches the price should be returned and printed on the console
   
@byArea1
 Scenario: Search about homeby area between two number 
    When I search about home by area less than 150 and Greater than 400
    Then A list of homes that matches the area should be returned and printed on the console