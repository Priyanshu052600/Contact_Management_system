package com.SDEA.ContactManagemetSystem.Controller;


import com.SDEA.ContactManagemetSystem.Model.PersonDetails;
import com.SDEA.ContactManagemetSystem.PersonDto.PersonRequestDto;
import com.SDEA.ContactManagemetSystem.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/details")
public class DetailsController {

    @Autowired
    ServiceInterface service;

    //to Get all Data
    @GetMapping("/find")
    public ResponseEntity<List<PersonDetails>> getAllData(){
        return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
    }

    //to find data by ID


    @GetMapping("/find/id/{id}")
    public ResponseEntity<Optional<PersonDetails>> getById(@PathVariable BigDecimal id){
        return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
    }

    //to Create New Record
    @PreAuthorize("permitAll()")
    @PostMapping("/saveandupdate")
    public ResponseEntity<List<PersonDetails>> createNew(@RequestBody PersonRequestDto personRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveNew(personRequestDto));
    }

    //to find by fName
    @GetMapping("/find/firstname/{fName}")
    public ResponseEntity<List<PersonDetails>> getByfName(@PathVariable String fName){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByfName(fName));
    }


    //to find by lName
    @GetMapping("/find/lastname/{lName}")
    public ResponseEntity<List<PersonDetails>> getBylName(@PathVariable String lName){
        return ResponseEntity.status(HttpStatus.OK).body(service.getBylName(lName));
    }

    //to find by Email
    @GetMapping("/find/emailid/{email}")
    public ResponseEntity<List<PersonDetails>> getByEmail(@PathVariable String email){
        return ResponseEntity.status(HttpStatus.OK).body(service.getByEmail(email));
    }

    //to delete by id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteById(@PathVariable BigDecimal id){
        return ResponseEntity.status(HttpStatus.OK).body("Data with Id "+id+" has been deleted");
    }

}
