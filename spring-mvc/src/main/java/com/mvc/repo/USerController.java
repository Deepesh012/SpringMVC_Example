package com.mvc.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.entity.User;

@Controller
public class USerController {

	@Autowired
	private UserRepo repo;
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@ModelAttribute User user) {
		ModelAndView view=new ModelAndView("home.jsp");
		view.addObject("a",user);
		repo.save(user);
		return view;
	}
}
