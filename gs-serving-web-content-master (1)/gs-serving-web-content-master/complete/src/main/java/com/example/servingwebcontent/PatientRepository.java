package com.example.servingwebcontent;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface PatientRepository extends CrudRepository<Patient, Integer> {

}