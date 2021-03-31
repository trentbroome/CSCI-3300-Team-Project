package com.example.servingwebcontent;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface PatientRepository extends CrudRepository<Patient, Integer> {

    @Query(value = "SELECT * FROM patient_table p WHERE p.dob = ?1", nativeQuery = true)
    Iterable<Patient> getPatientByDOB(String dob);

}