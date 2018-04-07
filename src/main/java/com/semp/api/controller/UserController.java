package com.semp.api.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.semp.api.domain.TbsUser;
import com.semp.api.service.impl.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
 public UserController() {
	 System.out.println("UserController");
 }
 @Resource
 private IUserService userService;
 
 @RequestMapping("/showUser")
 public String toIndex(HttpServletRequest request,Model model) {
	System.out.println("UserController showuser");
	String id=request.getParameter("userId");
	TbsUser user=userService.GetUserById(id);
	model.addAttribute("user", user);
	return "showUser";
}
}
