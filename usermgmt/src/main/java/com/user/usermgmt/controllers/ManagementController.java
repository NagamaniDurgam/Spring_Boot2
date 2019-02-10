package com.user.usermgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class ManagementController {

	@RequestMapping(path="/")
	public String checkStatus(){
		return "ok";
	}
}
