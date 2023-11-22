package io.boukri.deployspringbootapponkubernetes.api;

import io.boukri.deployspringbootapponkubernetes.entities.User;
import io.boukri.deployspringbootapponkubernetes.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public void addUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
