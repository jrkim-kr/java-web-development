package chapter06.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpController {
	@Autowired
	private EmpService service;
	
	@GetMapping("/emp/emp.do")
	public String emp(Model model) {
		model.addAttribute("list", service.list());
		return "/emp/emp";
	}

}