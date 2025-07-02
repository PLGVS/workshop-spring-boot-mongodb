package com.plgvs.workshopmongo.services;

import com.plgvs.workshopmongo.domain.Post;
import com.plgvs.workshopmongo.repository.PostRepository;
import com.plgvs.workshopmongo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post findById(String id){
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
