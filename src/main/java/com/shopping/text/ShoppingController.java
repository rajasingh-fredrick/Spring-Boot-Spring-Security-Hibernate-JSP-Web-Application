package com.shopping.text;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ShoppingController {

	@RequestMapping("/user")	
	  public Principal user(Principal user) {
	    return user;
	  }

	 @RequestMapping("/json")
	  public Map<String,Object> jsonoutput() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("username", "Rajasingh");
	    model.put("info", "Hello Java World!");
	    return model;
	  }
	 
	  @RequestMapping( method=RequestMethod.GET, value="/welcome" )
	  public ModelAndView welcome() {
	    ModelAndView model = new ModelAndView("welcome");
	    return model;
	  }
	  
	  @RequestMapping( method=RequestMethod.GET, value="/login" )
	  public ModelAndView login(@RequestParam(value ="error", required= false ) String error,
			                    @RequestParam(value ="logout", required= false ) String logout) {
	    ModelAndView model = new ModelAndView("login");
	    if ( error != null )
	    {
	    	model.addObject("error", true);
	    }
	    if ( logout != null ) 
	    {
	    	model.addObject("logout", true);
	    }
	    return model;
	  }
	  
	  @RequestMapping( method=RequestMethod.GET, value="/admin/list" )
	  public ModelAndView itemList() {
	    ModelAndView model = new ModelAndView("itemlist");
	    return model;
	  }
	  
}
