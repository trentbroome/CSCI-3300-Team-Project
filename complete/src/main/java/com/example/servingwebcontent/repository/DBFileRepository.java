package com.example.servingwebcontent.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<com.example.servingwebcontent.model.DBFile, String> {

}