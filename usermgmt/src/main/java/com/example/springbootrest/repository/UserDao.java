package com.example.springbootrest.repository;

import org.springframework.stereotype.Repository;

import com.example.springbootrest.domain.User;
import com.example.springbootrest.domain.Users;

@Repository	
public class UserDao {

	    private static Users list = new Users();
	     
	    static
	    {
	        list.getEmployeeList().add(new User(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
	        list.getEmployeeList().add(new User(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
	        list.getEmployeeList().add(new User(3, "David", "Kameron", "titanic@gmail.com"));
	    }
	     
	    public Users getAllEmployees()
	    {
	        return list;
	    }
	     
	    public void addEmployee(User employee) {
	        list.getEmployeeList().add(employee);
	    }
		
}
