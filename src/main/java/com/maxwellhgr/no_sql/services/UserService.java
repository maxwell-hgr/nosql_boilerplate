package com.maxwellhgr.no_sql.services;

import com.maxwellhgr.no_sql.DTO.UserDTO;
import com.maxwellhgr.no_sql.models.User;
import com.maxwellhgr.no_sql.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO create(User user) {
        if(this.findById(user.getId()) == null) {
            this.userRepository.save(user);
            return new UserDTO(user.getName());
        }
        return null;
    }

    public User findById(String id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> response = new ArrayList<>();
        for(User user : users) {
            response.add(new UserDTO(user.getName()));
        }

        return response;
    }

    public UserDTO update(User newUser) {
        String id = newUser.getId();
        User old = this.findById(id);
        if(old != null) {
            old.setName(newUser.getName());
            old.setEmail(newUser.getEmail());
            this.userRepository.save(old);

            return new UserDTO(old.getName());
        }

        return null;
    }

    public void delete(String id) {
        if(findById(id) != null) {
            this.userRepository.deleteById(id);
        }
    }
}
