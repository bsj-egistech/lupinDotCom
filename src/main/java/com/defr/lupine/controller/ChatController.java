package com.defr.lupine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChatController {

	@RequestMapping(value="/chat")
	public ModelAndView chat() {		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("chat");
		
		return mav;
	}
	
	
	
	
	
	
}
