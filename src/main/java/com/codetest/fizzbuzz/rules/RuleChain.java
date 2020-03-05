package com.codetest.fizzbuzz.rules;

/**
 * Class to chain different rule checks
 * Registers Fizz, Buzz, FizzBuzz and Default rules
 * @author arunvivek
 *
 */
public class RuleChain
{
	private Rule startingPoint;
	
	/**
	 * Constructor to initialize rule object and register applicable rules
	 */
    public RuleChain()
    {
    	startingPoint = new FizzBuzzRule();
    	startingPoint.registerNext(new BuzzRule()).registerNext(new FizzRule())
				.registerNext(new DefaultRule());
    }
    
    /**
     * Matches number against rules in the chain
     * @param number
     * @return String (Fizz, Buzz, FizzBuzz or input number)
     */
    public String matches(Integer number) {
    	return startingPoint.matches(number);
    }
}
