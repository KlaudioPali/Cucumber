Feature: Employee search

  Background:
   # Given user is navigated to HRMS application
    * When user enters admin username and password
    * And user clicks on login button
    * Then user is successfully logged in
    * When user clicks on PIM option
    * And user clicks on Employee List Option
    #Then user closes the browser


  @sprint2 @ahmed @regression @emp @test
  Scenario: search an employee by Id

    #Given user is navigated to HRMS application
   # When user enters admin username and password
   # And user clicks on login button
    #Then user is successfully logged in
    #When user clicks on PIM option
    #And user clicks on Employee List Option
   * When user enters employee id
   * And user clicks on search button
   * Then user should be able to see employee details
    #Then user closes the browser


  @sprint4 @ali @regression @emp @test
  Scenario: Search an employee name

    #Given user is navigated to HRMS application
    #When user enters admin username and password
    #And user clicks on login button
    #Then user is successfully logged in
   # When user clicks on PIM option
    #And user clicks on Employee List Option
   * When user enters valid employee name
    * And user clicks on search button
    * Then user should be able to see employee details
   # Then user closes the browser

