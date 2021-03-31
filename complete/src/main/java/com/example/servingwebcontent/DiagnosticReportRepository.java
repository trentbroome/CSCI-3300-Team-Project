package com.example.servingwebcontent;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;



public interface DiagnosticReportRepository extends CrudRepository<DiagnosticReport, Integer> {
    @Query(value = "SELECT * FROM diagnostic_report WHERE patient_id = ?1", nativeQuery = true)
    public Iterable<DiagnosticReport> getAllFilesByOrderId(Integer patient);


}
