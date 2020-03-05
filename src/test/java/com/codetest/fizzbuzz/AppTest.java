package com.codetest.fizzbuzz;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.codetest.fizzbuzz.rules.RuleChain;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;

@RunWith(JUnit4.class)
public class AppTest {

	static RuleChain chain;
	
	@BeforeClass
    public static void setUpClass() {
		chain = new RuleChain();    
	}
	
	@Test
	public void testFizz() {
		assertEquals("Fizz", chain.matches(3));
	}
	
	@Test
	public void testBuzz() {
		assertEquals("Buzz", chain.matches(5));
	}
	
	@Test
	public void testFizzBuzz() {
		assertEquals("FizzBuzz", chain.matches(15));
	}
	
	@Test
	public void testDefault() {
		assertEquals("7", chain.matches(7));
	}

	@Test
	public void testFizzWithCharacterMatch() {
		assertEquals("Fizz", chain.matches(32));
	}
	
	@Test
	public void testBuzzWithCharacterMatch() {
		assertEquals("Buzz", chain.matches(55));
	}
	
	@Test
	public void testFizzBuzzWithCharacterMatch() {
		assertEquals("FizzBuzz", chain.matches(53));
	}
	
	@AfterClass
    public static void tearDownClass() {
        chain = null;
    }
}
