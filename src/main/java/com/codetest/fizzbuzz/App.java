package com.codetest.fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.codetest.fizzbuzz.rules.RuleChain;

/**
 * Picks up integer range from 1 to 100 and prints 
 * Fizz, Buzz, FizzBuzz or default number
 * @author arunvivek
 *
 */
public class App {

	private static final Logger log = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		
		RuleChain chain = new RuleChain();
		List<Integer> list = IntStream.rangeClosed(1, 100).distinct().boxed().collect(Collectors.toList());
    	
		for(int i : list) {
			log.info(chain.matches(i));
		}
	}
}
