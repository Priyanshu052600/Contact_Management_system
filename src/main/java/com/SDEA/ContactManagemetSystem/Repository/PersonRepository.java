package com.SDEA.ContactManagemetSystem.Repository;

import com.SDEA.ContactManagemetSystem.Model.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonDetails, BigDecimal> {

    @Query("select pd from PersonDetails pd where pd.fName=?1")
    public List<PersonDetails> findByfName( String fName);

    @Query("select pd from PersonDetails pd where pd.email=?1")
    public List<PersonDetails> findByEmail( String email);

    @Query("select pd from PersonDetails pd where pd.lName=?1")
    public List<PersonDetails> findBylName(String lName);



}
