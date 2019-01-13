package com.saifiahmada.vaadin.coba;

import com.saifiahmada.vaadin.coba.entity.Customer;
import com.saifiahmada.vaadin.coba.repository.CustomerRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final CustomerRepository repo;
	final Grid<Customer> grid;

	public MainView(CustomerRepository repo) {
		this.repo = repo;
		this.grid = new Grid<>(Customer.class);
		add(grid);
		listCustomers();
	}

	private void listCustomers() {
		grid.setItems(repo.findAll());
	}

}
