package com.SDEA.ContactManagemetSystem.PersonDto;

import java.io.Serializable;
import java.util.List;

public class PersonRequestDto implements Serializable {
    //to collect the request body from the user
    private List<PersonDetailsDto> personDetailsDtos;

    public PersonRequestDto() {
    }

    public List<PersonDetailsDto> getPersonDetailsDtos() {
        return personDetailsDtos;
    }

    public void setPersonDetailsDtos(List<PersonDetailsDto> personDetailsDtos) {
        this.personDetailsDtos = personDetailsDtos;
    }
}
