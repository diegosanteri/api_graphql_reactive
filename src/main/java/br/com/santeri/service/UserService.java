package br.com.santeri.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santeri.model.User;
import br.com.santeri.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
	
	
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User> findAll() {
		
		return userRepository.findAll().toStream().collect(Collectors.toList());
	}

	public User findOne(final String id) {

		return  userRepository.findById(id).block();
	}

	public List<User> findUsers(List<String> ids) {

		return userRepository.findAllById(ids);
	}

	public User save(User user) {

		return userRepository.save(user).block();
	}
}
