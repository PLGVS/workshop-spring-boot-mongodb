package com.plgvs.workshopmongo.services;

import com.plgvs.workshopmongo.domain.User;
import com.plgvs.workshopmongo.repository.UserRepository;
import com.plgvs.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(String id){
        Optional<User> user = userRepository.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
