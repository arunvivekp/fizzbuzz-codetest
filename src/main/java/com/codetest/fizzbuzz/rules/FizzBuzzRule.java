package com.codetest.fizzbuzz.rules;

import static com.codetest.fizzbuzz.rules.Constants.FIVE;
import static com.codetest.fizzbuzz.rules.Constants.THREE;
import static com.codetest.fizzbuzz.rules.Constants.FIZZBUZZ;

/**
 * Covers FizzBuzz Rule (i.e when number is divisible by 3 or contains 3 and 
 * number is divisible by 5 or contains 5)
 * @author arunvivek
 *
 */
public class FizzBuzzRule extends Rule
{
	/**
	 * Returns FizzBuzz if input number matches FizzBuzz rule
	 */
	@Override
    public String matches(Integer number)
    {
        if ((number%3 == 0 || number.toString().contains(THREE)) &&
        		(number%5 == 0 || number.toString().contains(FIVE))) {
            return FIZZBUZZ;
        }
        return next.matches(number);
    }
}
