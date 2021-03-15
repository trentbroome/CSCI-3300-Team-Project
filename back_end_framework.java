package beans;

/* These are JUST the setter and getter classes. These still need their repository classes and i also need to learn
 * how to to fully assimilate them into spring I.E. access mySQL and MainController classes. Again, these are just 
 * here to make later copy and paste easier. I will let everyone know when i get it working in our system
 */ 

public class back_end_framework {


	//this is the class that came with the spring demo for reference
	public class user {
		
		  private Integer id;
		  private String name;
		  private String email;

		  public Integer getId() {
		    return id;
		  }

		  public void setId(Integer id) {
		    this.id = id;
		  }

		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public String getEmail() {
		    return email;
		  }

		  public void setEmail(String email) {
		    this.email = email;
		  }
		}	
	
	//From here down, these are the classes within Jira, and the variable are from the ERD in the deliverables
	
	public class userLogin{
		
		private String password;
		private String username;
		private Integer ID_key;
		
		
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
		
		public String getUsername() {
			return username;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}

		public Integer getID_key(Integer ID_key) {
			return ID_key;
		}
			
		public void setID_key(Integer ID_key) {
			this.ID_key = ID_key;
		}
	}
	
	
	public class orderInfo{ //not sure how to integrate image... Separate class maybe?
		
		
		//private data type img
		private Integer orderID;
		private String visitReason;
		private String Modality;
		private String orderNotes;
		
		public Integer getOrderID() {
			return orderID;
		}
		
		public void setOrderID(Integer orderID) {
			this.orderID = orderID;
		}
		
		public String getVisitReason() {
			return visitReason;
		}
		
		public void setVisitReason(String visitReason) {
			this.visitReason = visitReason;
		}
		
		public String getModality() {
			return Modality;
		}
		
		public void setModality(String modality) {
			Modality = modality;
		}
		
		public String getOrderNotes() {
			return orderNotes;
		}
		
		public void setOrderNotes(String orderNotes) {
			this.orderNotes = orderNotes;
		}
	}
	
	
	public class patientTable{
		
		private String firstName;
		private String lastName;
		private char middleInitial;
		private Integer dOB;
		private Integer phoneNumber;
		private String email;
		private String asthmaAllergy;
		private String notes;
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public char getMiddleInitial() {
			return middleInitial;
		}
		
		public void setMiddleInitial(char middleInitial) {
			this.middleInitial = middleInitial;
		}
		
		public Integer getdOB() {
			return dOB;
		}
		
		public void setdOB(Integer dOB) {
			this.dOB = dOB;
		}
		
		public Integer getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(Integer phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getAsthmaAllergy() {
			return asthmaAllergy;
		}
		
		public void setAsthmaAllergy(String asthmaAllergy) {
			this.asthmaAllergy = asthmaAllergy;
		}
		
		public String getNotes() {
			return notes;
		}
		
		public void setNotes(String notes) {
			this.notes = notes;
		}	
		
	}
	
	public class imagingTable{ //again, can not do img file. Will have to add to when at desktop
		
		//private data type img
		private Integer imagingID;
		private Integer timeStamp;
		private String User;
		
		public Integer getImagingID() {
			return imagingID;
		}
		public void setImagingID(Integer imagingID) {
			this.imagingID = imagingID;
		}
		public Integer getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(Integer timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getUser() {
			return User;
		}
		public void setUser(String user) {
			User = user;
		}
	}
	
	public class session{
		
		private String sessionKey;
		private Integer expireDate;
		private Integer sessionDate;
		
		public String getSessionKey() {
			return sessionKey;
		}
		
		public void setSessionKey(String sessionKey) {
			this.sessionKey = sessionKey;
		}
		
		public Integer getExpireDate() {
			return expireDate;
		}
		
		public void setExpireDate(Integer expireDate) {
			this.expireDate = expireDate;
		}
		
		public Integer getSessionDate() {
			return sessionDate;
		}
		
		public void setSessionDate(Integer sessionDate) {
			this.sessionDate = sessionDate;
		}
	}
	
	
	public class task{
		
		private Integer id;
		private Integer priority;
		private Long repeat;
		private Integer runAtDate;
		private String taskHash;
		private String taskName;
		private String taskParams;
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public Long getRepeat() {
			return repeat;
		}
		
		public void setRepeat(Long repeat) {
			this.repeat = repeat;
		}
		
		public Integer getPriority() {
			return priority;
		}
		
		public void setPriority(Integer priority) {
			this.priority = priority;
		}
		
		public Integer getRunAtDate() {
			return runAtDate;
		}
		
		public void setRunAtDate(Integer runAtDate) {
			this.runAtDate = runAtDate;
		}
		
		public String getTaskHash() {
			return taskHash;
		}
		
		public void setTaskHash(String taskHash) {
			this.taskHash = taskHash;
		}
		
		public String getTaskName() {
			return taskName;
		}
		
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		
		public String getTaskParams() {
			return taskParams;
		}
		
		public void setTaskParams(String taskParams) {
			this.taskParams = taskParams;
		}
	}
	
	public class completedTask{
		
		private Integer id;
		private Integer priority;
		private Long repeat;
		private Integer runAtDate;
		private String taskHash;
		private String taskName;
		private String taskParams;
		
		public Integer getId() {
			return id;
		}
		
		public void setId(Integer id) {
			this.id = id;
		}
		
		public Long getRepeat() {
			return repeat;
		}
		
		public void setRepeat(Long repeat) {
			this.repeat = repeat;
		}
		
		public Integer getPriority() {
			return priority;
		}
		
		public void setPriority(Integer priority) {
			this.priority = priority;
		}
		
		public Integer getRunAtDate() {
			return runAtDate;
		}
		
		public void setRunAtDate(Integer runAtDate) {
			this.runAtDate = runAtDate;
		}
		
		public String getTaskHash() {
			return taskHash;
		}
		
		public void setTaskHash(String taskHash) {
			this.taskHash = taskHash;
		}
		
		public String getTaskName() {
			return taskName;
		}
		
		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}
		
		public String getTaskParams() {
			return taskParams;
		}
		
		public void setTaskParams(String taskParams) {
			this.taskParams = taskParams;
		}
	}






/* 
 * 
 * 
 * package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.ModelAttribute;

@Controller // This means that this class is a Controller
//@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
            // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;

    @GetMapping("/demo")
    public String demoForm(Model model)
    {
        model.addAttribute("user", new User());
        return "demo";
    }

    @PostMapping("/demo")
    public Iterable<User> demoPost(@ModelAttribute User user, Model model)
    {
        model.addAttribute("user", user);
        userRepository.save(user);
        return userRepository.findAll();
    }

    @GetMapping("/demo_table")
    public String demoTable(Model model)
    {
        model.addAttribute("user_list", userRepository.findAll());
        return "demo_table";
    }
}
 */





















}
