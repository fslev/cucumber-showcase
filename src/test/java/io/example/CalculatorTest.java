package io.example;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines({"cucumber"})
@SelectClasspathResource("io/example")
public class CalculatorTest {
}
