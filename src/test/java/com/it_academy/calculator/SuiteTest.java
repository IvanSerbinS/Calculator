package com.it_academy.calculator;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;



@Suite
@SelectClasses({MathOperationTest.class,InputOperationTest.class,InputDoubleTest.class, CalculatorTest.class})
public class SuiteTest {
}
