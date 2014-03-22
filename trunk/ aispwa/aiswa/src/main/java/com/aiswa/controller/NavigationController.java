package com.aiswa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NavigationController {
	
	@RequestMapping(method=RequestMethod.GET,value="/navigator.do")
	public String redirectMenu(@RequestParam(value="page") String tilesRedirectPage){
		System.out.println("ENTERED");
		return tilesRedirectPage;
	}
	
	
}
