package com.Bartosz.vCard;

public class DataFromJson {
	String name;
	String image;
	String telephone;
	String email;
	String sameas;
	String url;
	Address address;

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setSameas(String sameas) {
		this.sameas = sameas;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getEmail() {
		return email;
	}

	public String getSameas() {
		return sameas;
	}

	public String getUrl() {
		return url;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "DataFromJson{" +
				"name='" + name + '\'' +
				", image='" + image + '\'' +
				", telephone='" + telephone + '\'' +
				", email='" + email + '\'' +
				", sameas='" + sameas + '\'' +
				", url='" + url + '\'' +
				", address=" + address.toString() +
				'}';
	}
}
