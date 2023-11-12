package ua.ucu.edu.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user/")
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/list")
    public List<UserApp> list() {
        return userService.getUsers();
    }
    
    @PostMapping
    public void addUser(UserApp user) {
        userService.addUser(user);
    }
}
