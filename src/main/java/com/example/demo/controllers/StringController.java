package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Case;

@Controller
@RequestMapping({"/HelloWorld"})
public class StringController {
	
	private String title;
	
	public StringController() {
		title = "Hello there!";
	}
	
	@GetMapping("")
	public String index() {
		return "helloworld/index";
	}

//	//If we change the message?
//	@GetMapping("message-path") //URL to which the form submits
//	public ModelAndView MessageMethod(@RequestParam(required=false, defaultValue="«silence»") String submittedMessage) {
//		Yeller theInstanceThatMakesLoudWords = new Yeller(submittedMessage);
//		ModelAndView mv = new ModelAndView("helloworld/message");
//	// This is the path src/main/resources/templates/helloworld/message.html
//		mv.addObject("title", title);
//		String result = cap.capitalize();
//		mv.addObject("thisIsWhatShouldShow", resultingLoudWord);
//		//thisIsWhatShouldShow is the field in the template message.html
//			//      <b>Message:</b>
//   		//		{{ thisIsWhatShouldShow }}
//		return mv;
//	}

/*	@GetMapping("Decap")
	public ModelAndView Decap(@RequestParam(required=false, defaultValue="«silence»") String submittedMessage) {
		ModelAndView mv = new ModelAndView("helloworld/message");
		mv.addObject("title", title);
		Decap decap = new Decap(submittedMessage);
		String result = decap.decapitalize();
		mv.addObject("decap", result);
		return mv;
	}
*/	
	@GetMapping("Case")
	public ModelAndView Cap(@RequestParam(required=false, defaultValue="«silence»") String kase) {
		ModelAndView mv = new ModelAndView("helloworld/case");
		mv.addObject("title", title);
		Case Kase = new Case(kase);

		String result = Kase.capitalize();
//		String result = case.capitalize();
		mv.addObject("case", result);
		return mv;
	}
	
}
