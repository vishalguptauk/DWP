Feature: To test Adobe PhotoShop

@CucumberScenario
Scenario: Create a new file in Adobe PhotoShop
@Given I am testing Adobe PhotoShop
@When I Open Adobe PhotoShop and Create a new file
Then I Adobe PhotoShop should allow me to create a new file