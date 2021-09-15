package com.profiles2.demo.repository;

import com.profiles2.demo.models.bankdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bankdetailsrepository extends JpaRepository<bankdetails,Long> {
    
}
