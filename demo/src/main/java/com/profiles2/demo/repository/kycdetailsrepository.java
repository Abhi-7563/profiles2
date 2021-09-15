package com.profiles2.demo.repository;

import com.profiles2.demo.models.kycdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kycdetailsrepository extends JpaRepository<kycdetails, Long> {
    
}
