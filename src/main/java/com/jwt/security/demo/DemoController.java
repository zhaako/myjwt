package com.jwt.security.demo;

import com.jwt.security.user.User;
import com.jwt.security.user.UserService;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/halo")
@RequiredArgsConstructor
public class DemoController {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secured endpoint");
    }
    @GetMapping("/info")
    public List<User> getInfo(){
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public User getUser(@PathVariable(name ="id") int id){
        for(User user : userService.getAllUser()){
            return user;
        }
        return null;
    }
}
