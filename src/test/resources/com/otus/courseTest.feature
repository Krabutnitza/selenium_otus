#language: en

Feature: Otus test

  @filter
  Scenario: : Choose course by name
    And Open main page
    Then Find course by filter 'C++ Developer. Professional'
