package com.hanaa.iti.testcoverage;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest {
    @Test
    public void fun() {
        TestClass testClass = new TestClass();
        assertTrue(testClass.is());
    }
}