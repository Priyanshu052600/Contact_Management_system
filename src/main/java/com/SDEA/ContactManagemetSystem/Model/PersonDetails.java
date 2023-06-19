package com.SDEA.ContactManagemetSystem.Model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="PERSON")
public class PersonDetails  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="PERSON_ID",updatable = true,nullable = false)
    private BigDecimal personId;

    @Column(name="FIRST_NAME")
    private String fName;

    @Column(name = "LAST_NAME")
    private String lName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name="CONTACT")
    private String Contact;

    public BigDecimal getPersonId() {
        return personId;
    }

    public void setPersonId(BigDecimal personId) {
        this.personId = personId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

}
