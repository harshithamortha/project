package com.cg.bookmydoctor.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.bookmydoctor.dto.User;
import com.cg.bookmydoctor.exception.UserException;
import com.cg.bookmydoctor.repository.IUserRepository;
import com.cg.bookmydoctor.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		Optional<User> userDb = this.userRepository.findById(user.getUserId());
		if(userDb.isPresent()) {
			throw new UserException("User already exists");
		} else if(userDb.isEmpty()){
			throw new UserException("Passed object can't be null");
		} else {
			return userRepository.save(user);
	}
	}
	
	@Override
	public User removeUser(User user) {
		userRepository.delete(user);
		return user;	
	}
	

	@Override
	public User updateUser(User user) {
		Optional<User> userDb = this.userRepository.findById(user.getUserId());
		if(userDb.isPresent()) {
			User existingUser = userDb.get();		
			existingUser.setPassword(user.getPassword());
			existingUser.setUserName(user.getUserName());
			existingUser.setRole(user.getRole());			
			return userRepository.save(existingUser);
		}
		else {
			throw new UserException("Record not found with id : " + user.getUserId());
		}

	}
}
