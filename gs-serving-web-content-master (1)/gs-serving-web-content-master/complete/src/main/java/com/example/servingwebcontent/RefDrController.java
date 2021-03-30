package com.example.servingwebcontent;

import org.springframework.beans.factory.annotation.Autowired;

public class RefDrController {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private OrderInfoRepository orderInfoRepository;

    @Autowired
    private UserRepository userRepository;
    
}
