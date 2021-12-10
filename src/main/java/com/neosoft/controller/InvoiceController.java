package com.neosoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.entity.Invoice;
import com.neosoft.service.IInvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	private IInvoiceService service;

	

	@PostMapping("/save")
	public Invoice saveInvoice(@RequestBody Invoice invoice) {
		return service.saveInvice(invoice);
		
	}

	@GetMapping("/getAllInvoices")
	public List<Invoice> getAllInvoices() {
		return service.getAllInvoices();
	}

	

	@GetMapping("/delete/{id}")
	public void deleteInvoice(@PathVariable Long id) {
		
		service.deleteInvoiceById(id);
		
	}
}