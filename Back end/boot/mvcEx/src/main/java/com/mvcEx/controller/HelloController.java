package com.mvcEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.Date;

@Controller
public class HelloController {
   @GetMapping("/hi")
   public ModelAndView getMessage() {
	   return new ModelAndView("welcome");
   }
   
   /*public String getMessage() {
	  return "welcome";
   }*/
   @GetMapping("/info")
   public String getInfo(Model m) {
	    m.addAttribute("msg","Hello welcome"+new Date());
	    return "home";
   }
}

