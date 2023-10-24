Feature: HungryNaki Mobile App testing

   Scenario: Select one product to see proceed login screen appear
    Given Mike on home page of hungrynaki mobile app
    When Mike select pizza category from home page
    And Mike select Pizzawala - Dhanmondi restraunt
    And Mike select one pizza from the list
    Then Mike see the login button
