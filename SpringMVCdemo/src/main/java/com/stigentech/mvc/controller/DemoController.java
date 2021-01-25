
package com.Stigentech.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DemoController {

	@RequestMapping("/home")
	public String m1() {
		System.out.println("working");
		
		return"p1";
	}
	@RequestMapping(value="/modeltest",method = RequestMethod.GET)
	//@GetMapping(value="/modeltest")
	public String m2(Model model) {
		
		String name="angular";
		model.addAttribute("ename",name);
		return "two";
		
	}
	@RequestMapping("/cities")
	public String m3(Model data) {
		String cities[]= {"hyd","chennai","rjy","pune"};
		data.addAttribute("myCities" , cities);
		return"thr";
	}
	
	
	
}
