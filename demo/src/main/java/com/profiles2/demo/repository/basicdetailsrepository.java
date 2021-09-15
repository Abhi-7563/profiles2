package com.profiles2.demo.repository;

import com.profiles2.demo.models.basicdetails;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface basicdetailsrepository extends JpaRepository<basicdetails, Long> {
    
}
