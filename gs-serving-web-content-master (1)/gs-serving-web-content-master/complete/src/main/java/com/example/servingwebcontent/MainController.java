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


import java.util.Collection;
import java.util.List;
import java.util.Set;

@RequestMapping("/admin")
@Controller
public class MainController {

   @Autowired
   PatientRepository patientRepository;
   @Autowired
   RoleRepository roleRepository;

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
            return "redirect:/admin";
         }
         else if(role.getId() == 3)
         {
            return "redirect:/radiologistPanel";
         }
         else if(role.getId() == 4)
         {
            return "redirect:/techPanel";
         }
         else if(role.getId() == 5)
         {
            return "redirect:/refDrPanel";
         }
         else if(role.getId() == 6)
         {
            return "redirect:/receptionistsPanel";
         }        
      }



      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());

      return "redirect:/login";

   }
   @GetMapping("/adminPanel")
   public String adminPanel(Model model)
   {
      return "adminPanel";
   }
   /*@GetMapping("/refDrPanel")
   public String refDrButton(Model model)
   {
      return "refDrPanel";
   }*/
   @GetMapping("/adminBackendPage")
   public String adminBackendPageButton(Model model)
   {
      return "adminBackendPage";
   }
   @GetMapping("/searchPatients")
   public String searchPatientsButton(Model model)
   {
      return "createPatientOrder";
   }
   @GetMapping("/createPatientOrder")
   public String createPatientOrderButton(Model model)
   {
      return "createPatientOrder";
   }
   /*@GetMapping("/radiologistsPanel")
   public String radiologistsPanel(Model model)
   {
	   return "radiologistsPanel";
   }
   @GetMapping("/receptionistsPanel")
   public String receptionistsPanel(Model model)
   {
	   return "receptionistsPanel";
   }
   @GetMapping("/refDrPanel")
   public String refDrPanel(Model model)
   {
	   return "refDrPanel";
   }
   @GetMapping("/techPanel")
   public String techPanel(Model model)
   {
	   return "techPanel";
   }*/
   
}