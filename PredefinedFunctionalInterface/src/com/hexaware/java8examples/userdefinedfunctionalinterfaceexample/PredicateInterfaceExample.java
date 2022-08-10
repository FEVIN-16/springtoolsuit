package com.hexaware.java8examples.userdefinedfunctionalinterfaceexample;

import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		
		//creating predicate
		Predicate<Integer>  checkValue = (value) -> value > 21;
		
		//calling predicate
		System.out.println(checkValue.test(35));

	}

}