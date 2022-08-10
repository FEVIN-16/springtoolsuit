package com.hexaware.java8examples.userdefinedfunctionalinterfaceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	
	public void acceptExample() {
		//Consumer to display square of a number
		Consumer<Integer> sqrNumber = (num) -> System.out.println( num * num);
		
		//calling the sqrNumber
		sqrNumber.accept(20);
	}
	
	public void squareNumbersInArrayList() {
		Consumer<List<Integer>> sqrNumbersInList = (list) ->{
			for(int i =0 ;i<list.size();i++) {
				list.set(i, (int) Math.pow(list.get(i),2));
			}
		};
		
		//calling squareNumbersInArrayList
		List<Integer> listOfValues = new ArrayList<>();
		listOfValues.add(2);
		listOfValues.add(4);
		listOfValues.add(6);
		sqrNumbersInList.accept(listOfValues);
		
		//printing List of values which are squared
		Consumer<List<Integer>> displaySqrList = 
				list -> list.stream().forEach(value -> System.out.println(value));
		//calling displaySqrList
				displaySqrList.accept(listOfValues);
	}

}