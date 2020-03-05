package com.codetest.fizzbuzz.rules;

/**
 * Abstract class for Rule
 * @author arunvivek
 *
 */
public abstract class Rule
{
	/**
	 * Registers next rule to the chain
	 * 
	 * @param nextRule
	 * @return Rule used for further chaining
	 */
    public Rule registerNext(Rule nextRule)
    {
        next = nextRule;
        return next;
    }
    
    /**
     * Object to chain next rule 
     */
    protected Rule next;
 
    /**
     * Matches with the FizzBuzz rule and returns appropriate String value
     * @param number
     * @return
     */
    public abstract String matches(Integer number);
}
