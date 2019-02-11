package com.zs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/hello")
	@ResponseBody
	public String Hello() {
		return "zou hello";
	}
	
}
