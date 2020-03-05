package com.codetest.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.codetest.fizzbuzz.rules.FizzRule;

public class FizzRuleTest {

	private FizzRule fizzRule;
	
	@Before
	public void setUp() {
		fizzRule = new FizzRule();
	}
	
	@Test
	public void testFizzRule() {
		Assert.assertEquals(fizzRule.matches(3), "Fizz");
		Assert.assertEquals(fizzRule.matches(37), "Fizz");
	}
}
