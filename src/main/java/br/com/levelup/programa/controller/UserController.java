package br.com.levelup.programa.controller;

import br.com.levelup.programa.modelo.User;
import br.com.levelup.programa.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getUsers(){
        return service.select();
    }

    @PostMapping
    public User postdata(@RequestBody User b){
       return service.save(b);
    }

    @GetMapping("{a}")
    public User getUsersbyId(@PathVariable Long a){
        return service.selectone(a);
    }




}
