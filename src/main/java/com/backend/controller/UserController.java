package com.backend.controller;

import com.backend.entity.UserEntity;
import com.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("save")
    public void save(@RequestBody UserEntity userEntity){
        userService.save(userEntity);
    }

    @GetMapping("read")
    public List<UserEntity> findAll(){
        return userService.read();
    }

    @PutMapping("update/{id}")
    public void updateUser(@PathVariable Long id, @RequestBody UserEntity userEntity){
        userService.update(id, userEntity.getUsername(), userEntity.getPassword());
    }
    @DeleteMapping("delete/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.delete(id);
    }

}
