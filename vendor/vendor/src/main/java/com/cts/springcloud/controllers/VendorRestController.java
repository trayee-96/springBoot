package com.cts.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.springcloud.model.Vendor;
import com.cts.springcloud.service.VendorService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/vendors")
public class VendorRestController {
	
	@Autowired
	private VendorService vendorService;
	
	@GetMapping(value="/getvendors/{productId}" )
	public List<Vendor> getVendors(@PathVariable long productId )
	{
		return vendorService.getVendors(productId);
	}
	
	
}
