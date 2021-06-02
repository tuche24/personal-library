package com.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class locationController {
	
	@RequestMapping("")
	public String index() {
		System.out.println("[TRACE] index");
		
		return "index";
	}
	
	@RequestMapping("servletHandler.do")
	public String servletHandler() {
		System.out.println("[TRACE] servletHandler");
		
		return "servletHandler";
	}
	
	@RequestMapping("postCode.do")
	public String postCode() {
		System.out.println("[TRACE] postCode");
		
		return "postCode";
	}
	
	@RequestMapping("keyDown.do")
	public String keyDown() {
		System.out.println("[TRACE] keyDown");
		
		return "keyDown";
	}
}
