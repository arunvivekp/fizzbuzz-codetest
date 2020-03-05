package com.codetest.fizzbuzz.rules;

import static com.codetest.fizzbuzz.rules.Constants.THREE;
import static com.codetest.fizzbuzz.rules.Constants.FIZZ;

/**
 * Covers Fizz Rule (i.e when number is divisible by 3 or number contains 3)
 * @author arunvivek
 *
 */
public class FizzRule extends Rule
{
	/**
	 * Returns "Fizz" if input number matches Fizz rule
	 */
	@Override
    public String matches(Integer number)
    {
        if (number%3 == 0 || number.toString().contains(THREE)) {
            return FIZZ;
        }
        return next.matches(number);
    }
}