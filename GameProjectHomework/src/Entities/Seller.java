package Entities;

import java.time.LocalDate;

public class Seller extends Customer {
	private int sellerId;
	

	public Seller(int id, String firstName, String lastName, String email, String nationlityId, LocalDate dateOfBirth, int sellerId) {
		super(id, firstName, lastName, email, nationlityId, dateOfBirth);
		this.setSellerId(id);
	}


	public int getSellerId() {
		return sellerId;
	}


	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

}
