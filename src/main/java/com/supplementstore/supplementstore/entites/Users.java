package com.supplementstore.supplementstore.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "storedetails")
public class Users {

@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name= "userid")
 private Long id;
@Column(name= "firstname")
private String firstname;
@Column(name= "lastname")
 private String lastname;
@Column(name= "email")
 private String email;
@Column(name= "phone")
 private String phone;
@Column(name= "password")
 private String password;
 
 public Long getId() {
	return id;
 }
 public void setId(Long id) {
	this.id = id;
 }
 public String getFirstname() {
	return firstname;
 }
 public void setFirstname(String firstname) {
	this.firstname = firstname;
 }
 public String getLastname() {
	return lastname;
 }
 public void setLastname(String lastname) {
	this.lastname = lastname;
 }
 public String getEmail() {
	return email;
 }
 public void setEmail(String email) {
	this.email = email;
 }
 public String getPhone() {
	return phone;
 }
 public void setPhone(String phone) {
	this.phone = phone;
 }
 public String getPassword() {
	return password;
 }
 public void setPassword(String password) {
	this.password = password;
 }
 
 
}
