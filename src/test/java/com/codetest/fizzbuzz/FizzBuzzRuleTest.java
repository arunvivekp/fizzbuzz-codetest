package com.codetest.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.codetest.fizzbuzz.rules.FizzBuzzRule;

public class FizzBuzzRuleTest {

	private FizzBuzzRule fbRule;
	
	@Before
	public void setUp() {
		fbRule = new FizzBuzzRule();
	}
	
	@Test
	public void testFizzBuzzRule() {
		Assert.assertEquals(fbRule.matches(35), "FizzBuzz");
		Assert.assertEquals(fbRule.matches(53), "FizzBuzz");
		
		Assert.assertEquals(fbRule.matches(15), "FizzBuzz");
		Assert.assertEquals(fbRule.matches(45), "FizzBuzz");
	}
}
