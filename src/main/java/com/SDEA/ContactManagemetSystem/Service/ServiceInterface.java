package com.SDEA.ContactManagemetSystem.Service;

import com.SDEA.ContactManagemetSystem.Model.PersonDetails;
import com.SDEA.ContactManagemetSystem.PersonDto.PersonRequestDto;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public interface ServiceInterface {

    public List<PersonDetails> getAll();

    public Optional<PersonDetails> getById(BigDecimal id);

    public List<PersonDetails> saveNew(PersonRequestDto requestDto);

    List<PersonDetails> getByfName(String fName);
    List<PersonDetails> getBylName(String lName);
    List<PersonDetails> getByEmail(String email);

}
