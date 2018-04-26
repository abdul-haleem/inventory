package com.polaris.inventory.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import com.polaris.inventory.domain.User;
import com.polaris.inventory.repository.UserRepository;
import com.polaris.inventory.service.request.NewUserRequest;
import com.polaris.inventory.service.response.ServiceResponse;
import com.polaris.inventory.service.response.UserResponse;

public class UserService extends ServiceBase {

	@Autowired
	private UserRepository userRepository;
	
	public ServiceResponse<?> createProduct(NewUserRequest userRequest)
	{
		User user = modelObjectFactory.newUser(userRequest);
		user = userRepository.save(user);
		UserResponse userResponse = new UserResponse();
		userResponse = userResponse.assemble(user);
		response.setData(userResponse);
		return response;
		
	}
	
	public ServiceResponse<?> getUserByUserName(NewUserRequest userRequest)
	{
		User user = new User();
		user.setUsername(userRequest.getUsername());
		Example<User> criteria = Example.of(user);
		Optional<User> usr = userRepository.findOne(criteria);
		response.setData(usr);
		return response;
		
	}
	public ServiceResponse<?> getUserByFirstandLastName(NewUserRequest userRequest)
	{
		User user = new User();
		user.setFirstname(userRequest.getFirstname());
		user.setLastname(userRequest.getLastname());
		Example<User> criteria = Example.of(user);
		Optional<User> usr = userRepository.findOne(criteria);
		response.setData(usr);
		return response;
		
	}
	
	
 
}
