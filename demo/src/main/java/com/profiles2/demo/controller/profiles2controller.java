package com.profiles2.demo.controller;

import java.util.HashMap;
import java.util.Map;

import com.profiles2.demo.models.bankdetails;
import com.profiles2.demo.models.basicdetails;
import com.profiles2.demo.models.kycdetails;
import com.profiles2.demo.repository.bankdetailsrepository;
import com.profiles2.demo.repository.basicdetailsrepository;
import com.profiles2.demo.repository.kycdetailsrepository;
import com.staxrt.tutorial.exception.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles2")
@SuppressWarnings("all")
public class profiles2controller<bankdetailsrepo> {
        
    @Autowired
    private basicdetailsrepository basicdetailsrepo;
    @Autowired
    private bankdetailsrepository bankdetailsrepo;
    @Autowired
    private kycdetailsrepository kycdetailsrepo;
    private CrudRepository<kycdetails, Long> repo;

    //Rest API for getting Basic Details By Id
    @GetMapping("/basicdetails/{id}")
    public ResponseEntity<basicdetails>getBasicDetailsById(@PathVariable(value = "id")Long userId)
    throws ResourceNotFoundException{
        basicdetails obj = basicdetailsrepo
                .findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("user was not found ::" + userId));
        return ResponseEntity.ok().body(obj);
    }

    //Rest API for getting Bank Details By Id
    @GetMapping("/bankdetails/{id}")
    public ResponseEntity<bankdetails>getBankcDetailsById(@PathVariable(value = "id")Long userId)
    throws ResourceNotFoundException{
        bankdetails obj = bankdetailsrepo
                .findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException(" user was not found :: " +userId));
        return ResponseEntity.ok().body(obj);
    }
    
    //Rest API for getting KYC details By Id
    @GetMapping("/kycdetails/{id}")
    public ResponseEntity<kycdetails>getkycDetailsById(@PathVariable(value = "id")Long userId)
    throws ResourceNotFoundException{
        kycdetails obj = kycdetailsrepo
                .findById(userId)
                .orElseThrow(()-> new ResourceNotFoundException("user was not found ::" +userId));
        return ResponseEntity.ok().body(obj);
    };

    //Rest API for posting Basic Details
    @PostMapping("basicdetails")
    public Map postBasicDetails(@RequestBody basicdetails bDetails){
        basicdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success", true);
        response.put("userId", bDetails.getUserId());
        response.put("message", "Basic Details saved successfully");
        return response;
    }

    //Rest API for posting Bank Details
    @PostMapping("bankdetails")
    public Map postBankDetails(@RequestBody bankdetails bDetails){
        bankdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success", true);
        response.put("userId", bDetails.getUserId());
        response.put("message", "Bank Details saved successfully");
        return response;
    }

    //Rest API for posting KYC Details
    @PostMapping("/kycdetails")
    public Map postKycDetails(@RequestBody kycdetails bDetails){
        kycdetailsrepo.save(bDetails);
        Map response = new HashMap<>();
        response.put("success", true);
        response.put("userId", bDetails.getUserId());
        response.put("message", "KYC saved successfully");
        return response;
    }
    
}
