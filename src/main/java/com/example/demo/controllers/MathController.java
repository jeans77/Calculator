package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.models.Adder;

@Controller
@RequestMapping({"/HelloWorld"})
public class MathController {
	
//	private String title;
	
	public MathController() {
//		title = "Hello there!";
	}
	
/*	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}
*/

	@PostMapping("adder")
	public String addTwoNumbers(@RequestParam(name="left") int first, @RequestParam(name="right") double second, Model model) {
	//Declaring variable and decoration required importing the Adder Class from resources
		Adder adder = new Adder (first, second);
		double result = adder.calculate();
		model.addAttribute("sum", result);
		return "helloworld/adder-result";
	}

	
}
