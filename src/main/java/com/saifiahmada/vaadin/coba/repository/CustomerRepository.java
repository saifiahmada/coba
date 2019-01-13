package com.saifiahmada.vaadin.coba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saifiahmada.vaadin.coba.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	List<Customer> findAll();
}
