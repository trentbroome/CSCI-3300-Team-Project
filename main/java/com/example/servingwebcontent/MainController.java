package com.example.servingwebcontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.example.servingwebcontent.model.DBFile;
import com.example.servingwebcontent.repository.DBFileRepository;
import com.example.servingwebcontent.service.DBFileStorageService;

@Controller
public class MainController {
   @Autowired
   DiagnosticReportRepository diagnosticReportRepository;
   @Autowired
   PatientRepository patientRepository;
   @Autowired
   RoleRepository roleRepository;
   @Autowired
   DBFileStorageService dbFileStorageService;
   @Autowired
   DBFileRepository dbFileRepository;

   @GetMapping("/createPatient")
   public String createProjectForm(Model model) {
      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());
      return "createPatientOrder";
   }

   @PostMapping("/savePatientInfo")
   public String addNewPatient(@ModelAttribute("patient") Patient patient, Model model)
   {
      patientRepository.save(patient);
      return "redirect:/createPatient";
   }
   @PostMapping("/saveReport")
      public String saveReport(@ModelAttribute("diagnosticReport") DiagnosticReport diagnosticReport, Model model)
      {
         System.out.println(diagnosticReport.getReport());

         diagnosticReportRepository.save(diagnosticReport);
         return "redirect:/radiologistsPanel";
      }


    @GetMapping("/login")
	public String viewLoginPage(Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}

   @GetMapping("/home")
   public String home(Model model)
   {       
     User loggedInUser = ((MyUserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
      Set<Role> userRoles = loggedInUser.getRoles();

      System.out.println(loggedInUser.getId());

      System.out.println(userRoles.size());

      for(Role role : roleRepository.findAll())
      {
         System.out.println(role.getName());
      }

      for(Role role : userRoles)
      {
         System.out.println(role.getName());
         if(role.getId() == 1)      //  ADMIN
         {
            return "redirect:/adminPanel";
         }
         else if(role.getId() == 2)
         {
            return "redirect:/refDrPanel";
         }
         else if(role.getId() == 3)
         {
            return "redirect:/techPanel";
         }
         else if(role.getId() == 4)
         {
            return "redirect:/radiologistsPanel";
         }
         else if(role.getId() == 5)
         {
            return "redirect:/receptionistsPanel";
         }      
         else if(role.getId() == 6)
         {
            return "redirect:/patientPage";
         }  
      }



      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());

      return "createPatientOrder";

   }
   @GetMapping("/adminPanel")
   public String adminPanel(Model model)
   {
      return "adminPanel";
   }

   @GetMapping("/refDrPanel")
   public String refDrPanel(Model model)
   {
      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());
      return "refDrPanel";
   }
   @GetMapping("/adminBackendPage")
   public String adminBackendPageButton(Model model)
   {
      model.addAttribute("employee_list", patientRepository.findAll());
      model.addAttribute("employee", new Employee());
      return "adminBackendPage";
   }

   @PostMapping("/searchPatients")
   public String searchPatient(@ModelAttribute Patient patient, Model model)
   {
       System.out.println(patient.getDOB());
       Iterable<Patient> patient_list = patientRepository.getPatientByDOB(patient.getDOB());
       for(Patient pat : patient_list)
       {
          System.out.println(pat.getEmail());
       }

       model.addAttribute("patient", new Patient());
       return "searchPatients";
   }

   @GetMapping("/createPatientOrder")
   public String createPatientOrderButton(Model model)
   {
      return "createPatientOrder";
   }
   @GetMapping("/radiologistsPanel")
   public String radiologistsPanel(Model model)
   {
      Iterable<Patient> patient_list = patientRepository.findAll();
      for(Patient patient : patient_list)
      {
         patient.setFileList(dbFileRepository.getAllFileUploadsByOrderId(patient.getPatientId()));
         System.out.println("File list: " + patient.getFileList());
      }

      model.addAttribute("patient_list", patient_list);
      model.addAttribute("patient", new Patient());
      model.addAttribute("dbFiles", dbFileStorageService.listAllFiles());
      model.addAttribute("report_list", diagnosticReportRepository.findAll());
      model.addAttribute("diagnosticReport", new DiagnosticReport());
	   return "radiologistsPanel";
   }

   @GetMapping("/receptionistsPanel")
   public String receptionistsPanel(Model model)
   {
      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());
	   return "receptionistsPanel";
   }

   @GetMapping("/techPanel")
   public String techPanel(Model model)
   {
      
      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());
	   return "techPanel";
   }
   @GetMapping("/listFiles")
   public String listFiles(Model model)
   {
	   return "listFiles";
   }
   @GetMapping("/patientPage")
   public String patientPage(Model model)
   {
	   return "patientPage";
   }
}