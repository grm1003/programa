package br.com.levelup.programa.services;

import br.com.levelup.programa.modelo.User;
import br.com.levelup.programa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public List<User> select(){
        return repository.findAll();
    }

    public User save(User a){
       return repository.save(a);
    }

    public User selectone(Long a){
        return repository.findById(a).get();
    }
}
