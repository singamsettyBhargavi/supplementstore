package com.supplementstore.supplementstore.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "addressdetails")
public class Address {
	
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="addressid")
	private Long addressid;
    @Column(name="doorno")
	private String doorno;
    @Column(name="area")
	private String area;
    @Column(name="city")
	private String city;
    @Column(name="pincode")
	private String pincode;
    @Column(name="state")
	private String state;
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	public String getDoorno() {
		return doorno;
	}
	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
