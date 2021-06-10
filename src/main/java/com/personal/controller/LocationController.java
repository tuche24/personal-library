package com.personal.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.personal.service.LocationService;

@Controller
@RequestMapping("/")
public class LocationController {
	
	@Autowired
	private LocationService locationService; 
	
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
	
	@RequestMapping("mapToJson.do")
	public String mapToJson(Model model) {
		System.out.println("[TRACE] mapToJson");
		
		List<HashMap<String, Object>> findAllMTJ =  locationService.findAllMTJ();
		model.addAttribute("MTJ", findAllMTJ);
		
		return "mapToJson";
	}
	
	@RequestMapping("regex.do")
	public String regex() {
		System.out.println("[TRACE] regex");
		
		return "regex";
	}
}
