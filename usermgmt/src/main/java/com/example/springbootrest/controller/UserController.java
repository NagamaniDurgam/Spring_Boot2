package com.example.springbootrest.controller;

import java.net.URI;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.springbootrest.domain.User;
import com.example.springbootrest.domain.Users;
import com.example.springbootrest.repository.UserDao;

@Configuration	
@RestController
public class UserController {
	
	@Autowired
    private UserDao employeeDao;
	
		
	@GetMapping(path="/", produces = "application/json")
    public Users getEmployees()
    {
		return employeeDao.getAllEmployees();
        
    }
	 @GetMapping("/login")
	    public String sayHello(Principal principal) {
	        return "Hello, " + principal.getName();
	    }
	
	@GetMapping(path="/logout")
    public Users getLogout()
    {
		return employeeDao.getAllEmployees();
        
    }
	
	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody User employee)
    {
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);
         
        employeeDao.addEmployee(employee);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(employee.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }	
}
