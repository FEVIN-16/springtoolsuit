package com.hexaware.collectionsandjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerTask {
	List <Seller> sellerList = new ArrayList <Seller> ();
	
	public void record() {
		sellerList.add(new Seller(01,"Fevin","fevin1@gmail.com","Kanyakumari"));
		sellerList.add(new Seller(02,"Fejin","fejin2@gmail.com","Kanyakumari"));
		sellerList.add(new Seller(03,"Vibi","vibi3@gmail.com","Chennai"));
		sellerList.add(new Seller(04,"Elsie","elsie4@gmail.com","Chennai"));
	}
	
	public void displaySeller() {
		sellerList.stream()
				  .forEach(System.out::println);
	}
	public void addSeller(int sellerId, String sellerName, String sellerEmail, String sellerLocation) {
		sellerList.add(new Seller(sellerId,sellerName,sellerEmail,sellerLocation));
				 
	}
	public void searchId(int sellerId) {
		sellerList.stream()
				  .filter((i)->sellerId ==i.getSellerId())
				  .forEach((i) -> System.out.println(i));
	}
	public void deleteId(int sellerId) {
		sellerList.stream()
				  .filter((i)->sellerId != i.getSellerId())
				  .collect(Collectors.toList());
		sellerList.stream()
				  .forEach((i)-> System.out.println(i));
				  
	}
	public void updateId(int sellerId, String sellerName, String sellerEmail, String sellerLocation) {
		sellerList.stream()
				  .filter((i) -> sellerId == i.getSellerId())
				  .forEach((i) -> {
					  	i.setSellerId(sellerId);
					  	i.setSellerName(sellerName);
					  	i.setSellerEmail(sellerEmail);
					  	i.setSellerLocation(sellerLocation);
		});
		
		sellerList.stream()
				  .forEach((i) -> System.out.println(i));

	}
	public void displayLocation(String sellerLocation) {
		sellerList.stream()
				  .filter((i)->sellerLocation==i.getSellerLocation())
				  .forEach((i)->System.out.println(i));
	}
	
}
