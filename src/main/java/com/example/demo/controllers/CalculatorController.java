package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Calculator;

@Controller
@RequestMapping({"/","/HelloWorld"})

public class CalculatorController {
	
	private String title;
	
	public CalculatorController() {
//		title = "The CalculatorController is me";
	}

	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}
	
	
	@GetMapping("calc")
	public String justShowTheForm() {
		return "helloworld/calc";
	}
	
	@PostMapping("calc")
	public String calculator(@RequestParam(name="left") double first, @RequestParam(name="right") double second, Model model, String action) {
		Calculator calc = new Calculator (first, second);
		double result = -999999999;
		String operator = action;
	
		if (operator.equals("add")) {
			result = calc.add();
		}
		else if (operator.equals("sub")) {
			result = calc.sub();
		}
		
		else if (operator.equals("mlt")) {
			result = calc.mlt();
		}
		
		else if (operator.equals("div")) {
			result = calc.div();
		}
		
		else if (operator.equals("mod")) {
			result = calc.mod();
		}
		
		else if (operator.equals("exp")) {
			result = calc.exp();
		}

		model.addAttribute("calc", result);
		model.addAttribute("first", first);
		model.addAttribute("second", second);
		model.addAttribute("operator", operator); 
		return "helloworld/calc-result";
	}

}
