Feature: XML parsing in JAVA
 
  Scenario: Read an xml file and print
    Given I parse an xml file "employees.xml"
    Then I print tag names
    And print dictionary of attributes and text for all the element