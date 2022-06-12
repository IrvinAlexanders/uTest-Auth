#Autor: Irvin Garcia

Feature: Utest
  As a user, I want to create a new account in the platform of utest
  @scenario1
  Scenario: Create an account in utest
    Given that user wants to create an account
    When he fills the form with the data
      | firstName | lastName | email                  | monthBirth | dayBirth | yearBirth | city                 | zip    | country  | computer | osVersion | osLanguage | password      |
      | Irvin     | Garcia   | irvin.garcia@724bc.com | Dec        | 14       | 1996      | Medellin             | 050012 | Colombia | Windows  | 10        | Spanish    | 151515        |
    Then he can create an account and Complete Setup