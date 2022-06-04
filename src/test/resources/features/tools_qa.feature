#Author: clasesAut

Feature:I as automation student
  I need to consume the service page of https://demoqa.com/automation-practice-form
  for practice

  Scenario Outline: the consumer wants to enter  the form data

    Given 'customer' want enter the data in the form
    When enter the request information
      | Name   | LastName   | Email   | Gender   | Mobile   | Subjects   | Hobbies   | Address   | State   | City   |
      | <Name> | <LastName> | <Email> | <Gender> | <Mobile> | <Subjects> | <Hobbies> | <Address> | <State> | <City> |
    Then should see the message "Thanks for submitting the form"

    Examples:
      | Name | LastName | Email             | Gender | Mobile      | Subjects | Hobbies | Address  | State | City  |
      | Jhon | Dotor    | pruebas@gmail.com | M      | 31065759564 | Biology  | Sports  | Medellin | NCR   | Noida |
