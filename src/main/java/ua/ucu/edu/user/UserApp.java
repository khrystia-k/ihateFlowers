package ua.ucu.edu.user;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class UserApp {
    @Id
    public Integer id;
    public String email;
    public Integer age;

    @Transient
    public LocalDate dob = LocalDate.now();
    
    public Period getLoginTime() {
        return Period.between(LocalDate.now(), dob);
    }
}