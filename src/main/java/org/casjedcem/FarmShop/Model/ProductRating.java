package org.casjedcem.FarmShop.Model;

import javax.persistence.*;
import java.time.LocalDate;






@Entity
public class ProductRating implements Comparable<ProductRating> {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	
	 @OneToOne
	 private Product item;
	 
	 private String comment;
	 
	 private LocalDate date;
	 
	 @ManyToOne
	 private Client client;
	 
	 private int value;
	 
	
	 public ProductRating (Product anItem,String comment, Client client, int aValue) {
	     this.item = anItem;
	     this.value = aValue;
	     this.date = LocalDate.now();
	     this.comment = comment;
	     this.client = client;
	 }
	

	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public Product getItem() {
		return item;
	}



	public void setItem(Product item) {
		this.item = item;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public int compareTo(ProductRating other) {
	     if (value < other.value) return -1;
	     if (value > other.value) return 1;
	     
	     return 0;
	 }
	 
}
