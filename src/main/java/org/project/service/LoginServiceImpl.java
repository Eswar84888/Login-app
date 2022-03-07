package org.project.service;

import org.project.blindings.LoginRequest;
import org.project.entities.UserEntity;
import org.project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginServiceImpl implements LoginService{
	@Autowired
	private UserRepository userRepo;

	@Override
	public String login(LoginRequest request) {
	UserEntity user=userRepo.findByUserEmailAndUserPwd(request.getEmail(),request.getPwd());
	
	if(null==user) {
		return "invalid credentials";
	}
	if(user.getUserAccStatus().equals("LOCKED")) {
		return "your Account Locked";
}
	return "SUCESS";
	}
}
