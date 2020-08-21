package com.example.blog.services;

import com.example.blog.models.Post;
import com.example.blog.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;

    @Autowired
    public void setPostRepository(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    public Post blogPostAdd(Post post) {
        return postRepository.save(post);
    }


    public Optional<Post> findById(long id) {
        return postRepository.findById(id);
    }

    public Post save(Post post) {
        return  postRepository.save(post);
    }

    public int delete(Post post) {
        postRepository.delete(post);
        return 200;
    }

}
