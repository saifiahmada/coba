package com.saifiahmada.vaadin.coba.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nama;
	
	public Customer() {

	}
	
	public Customer(String nama) {
		this.nama = nama;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	@Override
	public String toString() {
		return String.format("Customer[id=%d, nama='%s']", id,	nama);
	}
}
