package com.example.servingwebcontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ref")
public class RefDrController {
    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private UserRepository userRepository;
    /*
    @Autowired
    private ProductService service;
     
    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword) {
        List<Product> listProducts = service.listAll(keyword);
        model.addAttribute("listProducts", listProducts);
        model.addAttribute("keyword", keyword);
         
        return "index";
    }
    */

    @GetMapping("/refDrPanel")
    public String refDrPanel(Model model)
    {
        model.addAttribute("patient", new Patient());
        return "refDrPanel";
    }

    @PostMapping("/searchPatients")
    public String searchPatient(@ModelAttribute Patient patient, Model model)
    {
        System.out.println(patient.getDOB());
        

        model.addAttribute("patient", new Patient());
        return "refDrPanel";
    }
     
}
