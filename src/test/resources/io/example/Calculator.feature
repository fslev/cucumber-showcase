Feature: Calculator feature

  @happy
  Scenario: Add two numbers (happy)
    * Check 3 + 2 = 5

  @negative
  Scenario: Add two numbers (negative)
    * Check 3 + 2 != 4

  @wait
  Scenario Template: Concurrency test: take <take>
    * Wait 3s
    Examples:
      | take |
      | 1    |
      | 2    |
      | 3    |
      | 4    |
      | 5    |
      | 6    |
      | 7    |
      | 8    |
      | 9    |
      | 10   |