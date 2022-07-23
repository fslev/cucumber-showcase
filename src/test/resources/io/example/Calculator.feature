@all
Feature: Concurrency feature

  @serial1 @test
  Scenario: Concurrency test 1
    * Wait 3s

  @serial1 @test
  Scenario: Concurrency test 2
    * Wait 3s

  @test
  Scenario: Concurrency test 11
    * Wait 3s

  @test
  @isolated
  Scenario: Concurrency test 3
    * Wait 3s

  @test
  Scenario: Concurrency test 6
    * Wait 3s

  @test
  Scenario: Concurrency test 7
    * Wait 3s

  @test
  Scenario: Concurrency test 8
    * Wait 3s

  Scenario: Concurrency test 9
    * Wait 3s

  Scenario: Concurrency test 10
    * Wait 3s

