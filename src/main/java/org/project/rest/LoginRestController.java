package org.project.rest;

import org.project.blindings.LoginRequest;
import org.project.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class LoginRestController {
 
    @Autowired
    private LoginService service;
	
	public String login(@RequestBody LoginRequest request) {
		return service.login(request);
		
	}
	
	
}
