#Autor: Geovany Oquendo Murillo
@stories
Feature: Utest Register
  As a user,
  I want to register on the Utest website
  To access content for testers

  @scenario1
  Scenario Outline: Register on the Utest website
    Given that Geovany wants to register on the utest website
    When he complete the registration form
      | name   | lastName   | email   | city   | postalCode   | password   | confirmPassword   |
      | <name> | <lastName> | <email> | <city> | <postalCode> | <password> | <confirmPassword> |
    Then he is registered on the utest platform
      | question   |
      | <question> |

    Examples:
      | name     | lastName | email                | city     | postalCode | password      | confirmPassword | question                                                                 |
      | Fulanito | Pérez    | fulanito@yopmail.com | Medellín | 050017     | Giovany1293*- | Giovany1293*-   | oWelcome to the world's largest community of freelance software testers! |
