package com.university.user_service.service;

import com.university.user_service.model.User;
import com.university.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void initialize() {
        UserServiceConfig config = UserServiceConfig.getInstance();
        config.loadConfig();
    }

    public void createUsers() {
        User admin = (User) UserFactory.createUser("admin");
        admin.displayRole(); // Вывод: I am an Admin user.

        User customer = (User) UserFactory.createUser("customer");
        customer.displayRole(); // Вывод: I am a Customer user.
    }
}