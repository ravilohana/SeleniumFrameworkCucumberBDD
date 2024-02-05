@GuestCustomer
Feature: Place an order

  Scenario: Using default payment option
    Given I'm a quest customer
    And I have a product in the cart
    And I'm on the Checkout Page
    When I provide the billing details
      | firstName | lastName | companyName | countryName        | streetAddressLine1 | streetAddressLine2 | cityName | stateName | zipCode | phoneNumber | emailID            |
      | demo      | user     | demoCompany | United States (US) | 6300 Spring Creek  | USA New House Park | Plano    | Texas     | 75024   | 9874563210  | demouser@gmail.com |
    And I'm place an order
    Then  The order should be placed successfully