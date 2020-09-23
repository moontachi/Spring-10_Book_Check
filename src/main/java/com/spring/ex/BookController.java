package com.spring.ex;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	@RequestMapping(value="input", method = RequestMethod.GET) 
	public String input() {
		return "input"; 
	}
	
	
	@RequestMapping(value="input", method = RequestMethod.POST) 
	public String input2( @ModelAttribute("b") @Valid BookDTO book, BindingResult result) {
		//BindingResult -> Errors Error 대체가능 최상위요소임
		String page = "result";
		if(result.hasErrors()) {
			page = "input";
		}
		return page; 
	}
}
