package com.codetest.fizzbuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.codetest.fizzbuzz.rules.BuzzRule;

public class BuzzRuleTest {

	private BuzzRule buzzRule;
	
	@Before
	public void setUp() {
		buzzRule = new BuzzRule();
	}
	
	@Test
	public void testBuzzRule() {
		Assert.assertEquals(buzzRule.matches(5), "Buzz");
		Assert.assertEquals(buzzRule.matches(51), "Buzz");
	}
}
