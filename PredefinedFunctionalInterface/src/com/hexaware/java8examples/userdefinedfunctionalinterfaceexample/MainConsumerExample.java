package com.hexaware.java8examples.userdefinedfunctionalinterfaceexample;

import java.util.ArrayList;
import java.util.List;

public class MainConsumerExample {

	//new syntax of main from Java 8
	public static void main(String...args) {
		ConsumerExample ce = new ConsumerExample();
		ce.acceptExample();
		ce.squareNumbersInArrayList();
	}

}