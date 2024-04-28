package com.jsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {
	
	@GetMapping("/msg")
	public ModelAndView getMessage()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("username","Ram");
		mv.setViewName("home.jsp");   //response
		return mv;
	}
	
	@GetMapping("/display")
	public ModelAndView getdisplay()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("password","123");
		mv.setViewName("hello.jsp");
		return mv;
	}
	
	
                                                                  //   in this class create restAPI
}                                                                     
