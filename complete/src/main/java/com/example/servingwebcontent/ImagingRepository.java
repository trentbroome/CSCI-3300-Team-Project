package com.example.servingwebcontent;

import org.springframework.data.repository.CrudRepository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
 
public interface ImagingRepository extends CrudRepository<Imaging, Long> {
 
    @Query(value = "SELECT * FROM imaging WHERE id = ?1", nativeQuery = true)
    public Iterable<Imaging> getAllFileUploadsByOrderId(Long order);
}