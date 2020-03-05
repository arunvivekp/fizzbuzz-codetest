package com.codetest.fizzbuzz.rules;

/**
 * Covers default Rule i.e if no. doesn't satisfy Fizz, Buzz and FizzBuzz rules
 * @author arunvivek
 *
 */
public class DefaultRule extends Rule
{
	/**
	 * Returns the input number as a String
	 */
	@Override
    public String matches(Integer number)
    {
        return number.toString();
    }
}
