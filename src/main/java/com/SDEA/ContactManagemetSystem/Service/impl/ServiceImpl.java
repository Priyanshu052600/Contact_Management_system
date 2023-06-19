package com.SDEA.ContactManagemetSystem.Service.impl;

import com.SDEA.ContactManagemetSystem.Model.PersonDetails;
import com.SDEA.ContactManagemetSystem.PersonDto.PersonDetailsDto;
import com.SDEA.ContactManagemetSystem.PersonDto.PersonRequestDto;
import com.SDEA.ContactManagemetSystem.Repository.PersonRepository;
import com.SDEA.ContactManagemetSystem.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Component
public class ServiceImpl implements ServiceInterface{
    @Autowired
    PersonRepository personRepo;


    //to Create or update
    @Override
    public List<PersonDetails> saveNew(PersonRequestDto requestDto){
        List<PersonDetailsDto> reqDto=requestDto.getPersonDetailsDtos();
        List<PersonDetails> respList=new ArrayList<>();
        for(PersonDetailsDto person:reqDto){
            PersonDetails newobj= new PersonDetails();
            System.out.println("Before"+person.toString());
            BigDecimal id=person.getId();
            System.out.println(id);
            Optional<PersonDetails> update=personRepo.findById(id);

            if(update.isPresent()){
                PersonDetails updateobj=update.get();
                updateobj.setContact(person.getContact());
                updateobj.setfName(person.getfName());
                updateobj.setlName(person.getlName());
                updateobj.setEmail(person.getEmail());
                respList.add(update.get());
                personRepo.save(updateobj);
                System.out.println("userUpdated");
            }
            else{
                newobj.setEmail(person.getEmail());
                newobj.setfName(person.getfName());
                newobj.setlName(person.getlName());
                newobj.setContact(person.getContact());
                respList.add(newobj);
                personRepo.save(newobj);
                System.out.println("userSaved");
            }
        }
       return respList;
    }

    // to search by first name
    @Override
    public List<PersonDetails> getByfName(String fName) {
        return personRepo.findByfName(fName);
    }

    // to search by last Name
    @Override
    public List<PersonDetails> getBylName(String lName) {
        return personRepo.findBylName(lName);
    }

    //to search by email
    @Override
    public List<PersonDetails> getByEmail(String email) {
        return personRepo.findByEmail(email);
    }

    //to search by Id
    @Override
    public Optional<PersonDetails> getById(BigDecimal id){
        return personRepo.findById(id);
    }

    //to search all
    @Override
    public List<PersonDetails> getAll(){
        return personRepo.findAll();
    }

    //to delete
    public void deleteById(BigDecimal id){
        personRepo.deleteById(id);
    }



}
