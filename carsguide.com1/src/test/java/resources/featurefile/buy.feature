Feature: Search functionality

  As a User, I would like to visit carsguide website

  @smoke
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy+sell' tab
    And I click 'Search Cars' link
    Then I navigate to 'new and used car search' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results


    Examples:
      | make   | model   | location | price   |
      | Jeep   | Compass | ACT-All  | $20,000 |
      | Audi   | A7      | ACT-All  | $30,000 |
      | BMW    | 120i    | ACT-All  | $60,000 |
      | Jeep   | Compass | NT-North | $20,000 |
      | Jeep   | Compass | ACT-All  | $70,000 |
      | Nissan | 120     | ACT-All  | $90,000 |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on "buy+sell" tab
    And I click 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results

    Examples:
      | make   | model   | location | price   |
      | Audi   | A4      | NSW-all  | $2,5000 |
      | Nissan | 120     | ACT-All  | $20,000 |
      | BMW    | 120i    | ACT-All  | $30,000 |
      | Jeep   | Compass | NT-North | $20,000 |
      | Jeep   | Compass | ACT-All  | $20,000 |
      | BMW    | 120i    | ACT-All  | $45000  |











