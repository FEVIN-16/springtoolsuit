package com.hexaware.collectionsandjava8;

public class Seller {

	private int sellerId;
	private String sellerName;
	private String sellerEmail;
	private String sellerLocation;
	
	public Seller(int sellerId,String sellerName,String sellerEmail,String sellerLocation) {
		this.sellerId=sellerId;
		this.sellerName=sellerName;
		this.sellerEmail=sellerEmail;
		this.sellerLocation=sellerLocation;
	}
	
	//setter methods
	public void setSellerId(int sellerId) {
		this.sellerId=sellerId;
	}
	public void setSellerName(String sellerName) {
		this.sellerName=sellerName;
	}
	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail=sellerEmail;
	}
	public void setSellerLocation(String sellerLocation) {
		this.sellerLocation=sellerLocation;
	}
	//getter methods
	public int getSellerId() {
		return sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public String getSellerEmail() {
		return sellerEmail;
	}
	public String getSellerLocation() {
		return sellerLocation;
	}
	//toString()
	public String toString() {
		return "seller Id:"+sellerId+" seller Name:"+sellerName+" seller Email:"+sellerEmail+" seller Location:"+sellerLocation;
	}
}
