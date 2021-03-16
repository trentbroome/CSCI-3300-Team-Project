package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;


public interface OrderinfoRepository extends CrudRepository<Orderinfo, Integer> {
    
}
