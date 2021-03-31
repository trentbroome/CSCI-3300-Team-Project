package com.example.servingwebcontent.repository;


import com.example.servingwebcontent.model.DBFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<com.example.servingwebcontent.model.DBFile, String> {
    @Query(value = "SELECT * FROM files WHERE patient_id = ?1", nativeQuery = true)
    public Iterable<DBFile> getAllFileUploadsByOrderId(Integer patient);


}