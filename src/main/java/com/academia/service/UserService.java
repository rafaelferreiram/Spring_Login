package com.academia.service;

import com.academia.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
	public void saveTreinador(User user);
}
