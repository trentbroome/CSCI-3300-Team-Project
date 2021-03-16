package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface PatientRepository extends CrudRepository<Patient, Integer> {
    
}
