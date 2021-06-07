package com.personal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LocationController {
	
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
	
	@RequestMapping("restAjax.do")
	public String restAjax() {
		System.out.println("[TRACE] restAjax");
		
		return "restAjax";
	}
	
	@RequestMapping("uploadImg.do")
	public String uploadImg() {
		System.out.println("[TRACE] uploadImg");
		
		return "uploadImg";
	}
	
	@RequestMapping("dragAndDrop.do")
	public String dragAndDrop() {
		System.out.println("[TRACE] dragAndDrop");
		
		return "dragAndDrop";
	}
}
