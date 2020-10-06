package com.cts.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.springcloud.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long> {

}
