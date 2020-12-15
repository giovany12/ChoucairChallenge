#Autor: Geovany Oquendo Murillo
@stories
Feature: Utest Register
  As a user, I want to register on the Utest website

  @scenario1
  Scenario Outline: Register on the Utest website
    Given that Geovany wants to register on the utest website
    When he complete the registration form
      | name   | lastName   | email   | month   | day   | year   | city   | postalCode   | mobileDevice   | model   | operatingSystem   | password   | confirmPassword   |
      | <name> | <lastName> | <email> | <month> | <day> | <year> | <city> | <postalCode> | <mobileDevice> | <model> | <operatingSystem> | <password> | <confirmPassword> |
    Then he is registered on the utest platform

    Examples:
      | name    | lastName | email                 | month   | day | year | city     | postalCode | mobileDevice | model    | operatingSystem | password    | confirmPassword |
      | Geovany | Oquendo  | giovanyom12@gmail.com | January | 12  | 1993 | Medellín | 050017     | Apple        | iPhone 4 | iOS 11.2.1      | Utest2020*- | Gio1293*-       |
