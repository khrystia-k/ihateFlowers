package ua.ucu.edu.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserApp> getUsers() {
        return userRepository.findAll();
    }
    public void addUser(UserApp user) {
        userRepository.save(user);
    }
}