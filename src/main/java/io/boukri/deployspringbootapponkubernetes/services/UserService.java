package io.boukri.deployspringbootapponkubernetes.services;

import io.boukri.deployspringbootapponkubernetes.entities.User;
import io.boukri.deployspringbootapponkubernetes.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    public List<User> getAllUsers() {
        return new ArrayList<>(userRepository.findAll());
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
