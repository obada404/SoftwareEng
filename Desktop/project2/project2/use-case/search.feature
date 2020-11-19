Feature: Search about suitable home
  
Background: The System has a repository of homes with their specifications (type-material-placement-pets-amenties-price-area-bedrooms-bathrooms-leaselength)
Given  these homes are contained in the system
                |HOUSE_WOOD_VILLAGE_NO_GARAGEPARKING,FIREPLACE,ELEVATOR|510_150_3_2_6|
                |APARTMENT_BRICK_CITY_NO_ELEVATOR|230_120_4_2_12|
                |APARTMENT_BRICK_VILAGE_NO_SWIMMINGPOOL|100_120_4_2_6|
                 |HOUSE_STONE_VILLAGE_NO_SWIMMINGPOOL|150_120_3_2_12|
         
               
  Scenario: Search home by type
  When I search about home by type "HOUSE"
  Then A list of homes that matches the  type specification should be returned and printed on the console
And email with the result shoud be send to "kgkanassar17@gmail.com"
  Scenario: Search about home with less than a specific price
    When I search about home with price less than 400
    Then A list of homes that matches the price specification should be returned and printed on the console
And email with the result shoud be send to "kgkanassar17@gmail.com"
@byMaterial
Scenario: Search home by Material
  When I search about home by Material "BRICK"
  Then A list of homes that matches the  Material specification should be returned and printed on the console
  And email with the result shoud be send to "kgkanassar17@gmail.com"
  
    @byplacement
 Scenario: Search home by placement
  When I search about home by placement "CITY"
  Then A list of homes that matches the  placement specification should be returned and printed on the console
  And email with the result shoud be send to "kgkanassar17@gmail.com"
  
  @byLeaseLength 
   Scenario: Search home  by Lease Length 
  When I search about home by Lease Length  "short term_6 months"
  Then A list of homes that matches the Lease Length  should be returned and printed on the console
  And email with the result shoud be send to "kgkanassar17@gmail.com"
  
 
   @Amenitiesq
   Scenario: Search home  by Amenities
  When I search about home by Amenities "SWIMMINGPOOL"
  Then A list of homes that matches the Amenities should be returned and printed on the console
  And email with the result shoud be send to "kgkanassar17@gmail.com"
  
  
  
  @ByAllowPets
    Scenario: Search home  By Allow Pets
  When I search about home by  Allow Pets "yes"
  Then A list of homes that matches the Allow Pets should be returned and printed on the console
 And email with the result shoud be send to "kgkanassar17@gmail.com"
  @bedrooms
   Scenario: Search home by Number of bedrooms
  When I search about home by Number of bedrooms 3
  Then A list of homes that matches the  Number of bedrooms  should be returned and printed on the console
 
 And email with the result shoud be send to "kgkanassar17@gmail.com"
  @bathrom
     Scenario: Search home by Number of bathrooms
  When I search about home by Number of bathrooms 2
  Then A list of homes that matches the  Number of bathrooms  should be returned and printed on the console
And email with the result shoud be send to "kgkanassar17@gmail.com"
@byArea
 Scenario: Search about home by  area less than number
    When I search about home by area less than 150
    Then A list of homes that matches the area specification should be returned and printed on the console
    
    And email with the result shoud be send to "kgkanassar17@gmail.com"
    
         @byprice1
Scenario: Search about home by  price between two number
    When I search about home by price less than 200 and Greater than 400
    Then A list of homes that matches the price should be returned and printed on the console
   And email with the result shoud be send to "kgkanassar17@gmail.com"
@byArea1
 Scenario: Search about home by area between two number 
    When I search about home by area less than 150 and Greater than 400
    Then A list of homes that matches the area should be returned and printed on the console
     And email with the result shoud be send to "kgkanassar17@gmail.com"
     
     
  Scenario: Search about home By Combination of at least 2 of the above mentioned scenarios
    When I search about home by Number of bedrooms 3
    And I search about home by Number of bathrooms 2
   And I search about home by type "HOUSE"
   And I search about home by price less than 200 and Greater than 400
    Then A list of homes that matches the this Combination should be returned and printed on the console
    And email with the result shoud be send to "kgkanassar17@gmail.com"
    
    
    