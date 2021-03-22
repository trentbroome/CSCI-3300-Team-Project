package com.example.servingwebcontent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import java.util.List;

@Controller
public class MainController {

   @Autowired
   PatientRepository patientRepository;

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
	@RequestMapping(value = "/redirect")
   public String redirect() {
      return "redirect:adminPanel";
   }

   @GetMapping("/home")
   public String adminPanel(Model model)
   {       
      model.addAttribute("patient_list", patientRepository.findAll());
      model.addAttribute("patient", new Patient());
      return "techPanel";
   }
   @GetMapping("/refDrPanel")
   public String refDrButton(Model model)
   {
      return "refDrPanel";
   }
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