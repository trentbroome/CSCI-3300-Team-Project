package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<Session,Integer> {
    
}
