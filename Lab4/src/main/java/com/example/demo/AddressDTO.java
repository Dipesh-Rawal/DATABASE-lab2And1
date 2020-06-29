package com.example.demo;

public class AddressDTO {
	private String country;
	private String city;
	private String street;
	private int homeNumber;

	public AddressDTO() {

	}

	public AddressDTO(int homeNumber, String street, String city, String country) {
		super();
		this.homeNumber = homeNumber;
		this.street = street;
		this.city = city;
		this.country = country;

	}

	@Override
	public String toString() {
		return "AddressDto [country=" + country + ", city= " + city + ", street=" + street + ", homeNumber="
				+ homeNumber + "] ";

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
		this.homeNumber = homeNumber;
	}

}
