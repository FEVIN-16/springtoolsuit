package com.hexaware.functionlinterface;

public class Test {
	public static void main(String args[]) {
		Message mg=()->{
			System.out.println("method quation gets called");
		};
		mg.quation();
	}

}
