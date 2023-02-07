package com.xworkz.servlet.component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.servlet.dto.BeverageDTO;
import com.xworkz.servlet.dto.ChatsDTO;
import com.xworkz.servlet.dto.EducationDTO;
import com.xworkz.servlet.dto.FamilyDTO;
import com.xworkz.servlet.dto.MobileDTO;

@Component
@RequestMapping("/")
public class Manu {
	
	public Manu() {
		System.out.println("created:"+this.getClass().getSimpleName());
	}
	

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("running onEmail");
		String email = "manu.xworkz@gmail.com" ;
		model.addAttribute("Email",email);
		return "index.jsp";
	}
	@GetMapping("/mob")
	public String onMobile(Model model) {
		System.out.println("running onMobile");
		long mob = 9845306163L;
		model.addAttribute("mob",mob);
		return "index.jsp";
	}
	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("running onAadhar");
		long aadh=912345478281L;
		model.addAttribute("Aadhar",aadh);
		return "index.jsp";
	}
	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("running onAge");
		int age = 25;
		model.addAttribute("Age",age);
		return "index.jsp";
	}
	@GetMapping("/date")
	public String onDob(Model model) {
		System.out.println("running onDob");
		
		model.addAttribute("Dob",LocalDateTime.of(1999,07,15,11,30));
		return "index.jsp";
	}
	@GetMapping("/sal")
	public String onSalary(Model model) {
		System.out.println("running onSalary");
		double sal =573115;
		model.addAttribute("sal",sal);	
		return "index.jsp";
	}
	@GetMapping("/best")
	public String onFriends(Model model) {
		System.out.println("running onFriends");
		ArrayList<String> frds = new ArrayList<String>(Arrays.asList("shinchuu","priyaa","nata","others","Akshay","shubham"));
		model.addAttribute("frds",frds);
		return "index.jsp";
	}
	@GetMapping("/place")
	public String onPlaces(Model model) {
		System.out.println("running onPlaces");
		
		ArrayList<String> place = new ArrayList<String>(Arrays.asList("goa","dandali","ckm","mysore","temple"));
		
		model.addAttribute("place", place);
		return "index.jsp";
	}
	@GetMapping("/set")
	public String onSkill(Model model) {
		System.out.println("running onSkills");
		ArrayList<String> skill = new ArrayList<String>(Arrays.asList("java","html","sql","bootstrap","css","jpa","jdbc"));
		model.addAttribute("skill", skill);
		return "index.jsp";
	}
	@GetMapping("/education")
	public String onEducationDto(Model model) {
		System.out.println("running EDdto");
		EducationDTO edudto = new EducationDTO("gendehalli","belur", "ckm", "tiptur", 65,62, 75, false);
		model.addAttribute("edudto", edudto);
		return "index.jsp";
	}
	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("running onFamily");
		FamilyDTO fadto = new FamilyDTO("patel","manu", "puttegowda", "manjula","nischitha","bharath","manjegowda","gottila",67,85);
		
		model.addAttribute("fadto", fadto);
		return "index.jsp";
	}
	@GetMapping("/mobile")
	public String onMoblie(Model model) {
		System.out.println("running onMObile");
		 
		MobileDTO Mob = new MobileDTO("realme","lenavo","shubya", 20000, 6);
		model.addAttribute("mob", Mob);
		return "index.jsp";
	}
	@GetMapping("/beverage")
	public String onBeverges(Model model) {
		System.out.println("running onBevergers");
		
		BeverageDTO bedto= new BeverageDTO("fanta", "cchjnjkn", "jeera", "more",30,200, false, false);
		
		model.addAttribute("bedto", bedto);
		return "index.jsp";
	}
	@GetMapping("/chat")
	public String onChats(Model model) {
		System.out.println("running onChats");
		ChatsDTO gobi = new  ChatsDTO("bonda", "karnataka","manu","akshay", "rajajinagr","puri","imli", 30, false, false, 3, false);
		model.addAttribute("gobi", gobi);
		return "index.jsp";
	}

}
