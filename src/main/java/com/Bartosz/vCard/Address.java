package com.Bartosz.vCard;

public class Address {
	String streetAddress;
	String addressLocality;
	String addressCountry;

	@Override
	public String toString() {
		return "Address{" +
				"streetAddress='" + streetAddress + '\'' +
				", addressLocality='" + addressLocality + '\'' +
				", addressCountry='" + addressCountry + '\'' +
				'}';
	}
}
