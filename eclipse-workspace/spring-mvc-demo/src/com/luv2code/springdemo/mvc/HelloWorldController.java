package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") //request controller tanımladık çünkü sillycontrollerda showForm requesti var. çakışmaması için yaptık.
public class HelloWorldController{

	//need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm") // show form sitede linkteki ismini girdiği yeri gösteriyor.
	public String showForm(){ 
		return "helloworld-form";
	}
	
	//need a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return"helloworld";
	}
	
	//new a controller method to read form data and 
	//add data to model
	
	@RequestMapping("/processFormVersionTwo")
	public String letsgo(HttpServletRequest request,Model model) {
		
		//read the request parameter from the HTML form
		String theName=request.getParameter("studentName");
		
		//convert the data to all caps  
		theName=theName.toUpperCase();
		
		//create the message
		String result="Yo!"+theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return"helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String letsgo2(
			@RequestParam("studentName")String theName,Model model) {
		
		//convert the data to all caps  
		theName=theName.toUpperCase();
		
		//create the message
		String result="Hey My Friend!"+theName;
		
		//add message to the model
		model.addAttribute("message", result);
		
		return"helloworld";
	}
}

