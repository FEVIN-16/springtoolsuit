package com.hexaware.designpatternexamples.factorymethodpatternexample;

public interface Computer {
	
	// public, abstract, default, static and strictfp
	 String getRAM();
	 String getHDD();
	 String getCPU();
	 
	 //From java 8 we can add default and static implement methods 
	 public static String toStringValue() {
		return "returns values of Computer";
		 
	 }
	 
	 public default String toPrint() {
		return "toPrint method is executed...";
		 
	 }

}
