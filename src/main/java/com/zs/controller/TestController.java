package com.zs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
/*@RequestMapping("/test")*/
public class TestController {

	@RequestMapping("/hello")
/*	@ResponseBody*/
	public ModelAndView  Hello() {
		return new ModelAndView("top");
	}
	
}
