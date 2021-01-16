package com.gradle.tutorial;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FizzBuzzProcessorTest {
    @Test(groups = {"gr1"})
    public void FizzBuzzNormalNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        assertEquals("1", fb.convert(1));
        assertEquals("2", fb.convert(2));
    }

    @Test(groups = {"gr2"})
    public void FizzBuzzThreeNumbers() {

        FizzBuzzProcessor fb = new FizzBuzzProcessor();
        assertEquals("Fizz", fb.convert(3));
    }
}