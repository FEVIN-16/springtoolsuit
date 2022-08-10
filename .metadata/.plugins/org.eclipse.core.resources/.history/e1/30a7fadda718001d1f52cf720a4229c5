package com.hexaware.collectionsandjava8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class TestSeller {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		SellerTask st=new SellerTask();
		st.record();
		System.out.print("choice \n1:Display\n2:Search id\n3:Delete id\n4:Update\n5:Add seller\nEnter your Choice:");
		int choice=input.nextInt();
		switch(choice) {
		case 1:
			st.displaySeller();
			break;
		case 2:
			st.searchId(01);
			break;
		case 3:
			st.deleteId(01);
			break;
		case 4:
			st.updateId(01,"Fevin","fevin1@gmail.com","Bangalore");
			break;
		case 5:
			st.addSeller(05,"Berlin","berlin@gmail.com","Kochi");
		default:
			System.out.println("Please Enter a valid choice");
		}
	}

}
