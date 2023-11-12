package ua.ucu.edu.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserApp, Integer> {
    
}