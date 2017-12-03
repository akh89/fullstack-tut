package com.fullstacktut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWroldController {
	@RequestMapping("/")
	public String sayHello(){
		return "index";
	}
}
