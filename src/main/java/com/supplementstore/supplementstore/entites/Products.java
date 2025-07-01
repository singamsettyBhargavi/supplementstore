package com.supplementstore.supplementstore.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productdetails")
public class Products {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name= "productid")
	 private Long id;
	@Column(name= "proname")
	 private String proname;
	@Column(name= "proprice")
	 private String proprice;
	@Column(name= "prodetails")
	 private String prodetails;
	@Column(name= "procategory")
	 private String procategory;
	@Column(name= "proquantity")
	 private String proquantity;
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getProname() {
		 return proname;
	 }
	 public void setProname(String proname) {
		 this.proname = proname;
	 }
	 public String getProprice() {
		 return proprice;
	 }
	 public void setProprice(String proprice) {
		 this.proprice = proprice;
	 }
	 public String getProdetails() {
		 return prodetails;
	 }
	 public void setProdetails(String prodetails) {
		 this.prodetails = prodetails;
	 }
	 public String getProcategory() {
		 return procategory;
	 }
	 public void setProcategory(String procategory) {
		 this.procategory = procategory;
	 }
	 public String getProquantity() {
		 return proquantity;
	 }
	 public void setProquantity(String proquantity) {
		 this.proquantity = proquantity;
	 }
	 

}

