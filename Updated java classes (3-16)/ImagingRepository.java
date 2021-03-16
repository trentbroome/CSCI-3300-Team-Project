package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface ImagingRepository extends CrudRepository<Imaging, Integer> {
    
}