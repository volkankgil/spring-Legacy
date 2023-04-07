package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello2")//eğer ki farklı bir sayfa açılsın ister isek request mapten farklı isim vereceğiz
public class SillyController {
	
	@RequestMapping("/showForm")
	public String displayTheForm() {
		return "silly";
	}
}
	