package com.example.servingwebcontent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MainController {

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
	   return "adminPanel";
   }
}