package com.cts.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.springcloud.model.Vendor;
import com.cts.springcloud.repo.VendorRepo;


@Service
public class VendorService {

	@Autowired
	VendorRepo repo;
	
	public List<Vendor> getVendors(long productId)
	{
		
		return (List<Vendor>) repo.findAll();
	}
}
