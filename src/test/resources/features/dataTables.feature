Feature: Examples of Cucumber data table implementations

  Scenario: List of fruits I like
    Then user should see fruits i like
      | kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |

    #windows: control + alt + L



  Scenario: User should be able to see all 12 month in month dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |