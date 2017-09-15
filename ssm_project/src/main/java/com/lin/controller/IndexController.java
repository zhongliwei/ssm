package com.lin.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lin.bean.User;
import com.lin.service.UserService;

@Controller  
public class IndexController {

	@Autowired 
	     private UserService userService;  
	       
	
	    @RequestMapping("/toIndex")    
	     public ModelAndView getIndex(HttpServletRequest request,HttpServletResponse response){      
	         ModelAndView mav = new ModelAndView();   
	       
	         List<User> list = new ArrayList<User>();
	         list = userService.selectUser();
	      
	        
	        String name = request.getParameter("userName");
	        String password = request.getParameter("password");
	        
	        for(int i=0;i<list.size();i++){
	        	User user = list.get(i);
	        
	        	if(user.getUserName().equals(name)&&user.getUserPassword().equals(password)){
		        	
	        	mav.addObject("user", user);
	 	    	   mav.setViewName("index");
	 	    	   
	 	        }else{
	 	        		
	 	        	mav.setViewName("welcome");
	 	        	
	 	        }
	        }
	       
	       	        	
	      
	         return mav;    
	     }    

}
