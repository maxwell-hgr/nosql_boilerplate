package com.maxwellhgr.no_sql.controllers;

import com.maxwellhgr.no_sql.DTO.UserDTO;
import com.maxwellhgr.no_sql.models.User;
import com.maxwellhgr.no_sql.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody User user) {
        UserDTO updatedUser = userService.update(user);
        return ResponseEntity.ok().body(updatedUser);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User user) {
        UserDTO newUser = userService.create(user);
        return ResponseEntity.ok().body(newUser);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody User user) {
        userService.delete(user.getId());
        return ResponseEntity.ok().body("Deleted");
    }
}
