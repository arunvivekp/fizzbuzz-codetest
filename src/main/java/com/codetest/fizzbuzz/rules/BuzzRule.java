package com.codetest.fizzbuzz.rules;

import static com.codetest.fizzbuzz.rules.Constants.FIVE;
import static com.codetest.fizzbuzz.rules.Constants.BUZZ;

/**
 * Covers Buzz Rule i.e when the number is divisible by 5 or number contains 5
 * @author arunvivek
 *
 */
public class BuzzRule extends Rule
{
	/**
	 * Override method that returns Buzz if number matches Buzz rule
	 */
	@Override
    public String matches(Integer number)
    {
        if (number%5 == 0 || number.toString().contains(FIVE)) {
            return BUZZ;
        }
        return next.matches(number);
    }
}