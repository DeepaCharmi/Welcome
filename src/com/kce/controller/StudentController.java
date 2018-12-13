package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping("/")
	public String dostart(Model model)
	{
		model.addAttribute("stu", "welcome");
		return "welcome";
	}

}

  