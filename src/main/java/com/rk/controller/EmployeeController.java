package com.rk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public String View() {
		return "Employee";
	}

}
