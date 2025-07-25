package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PostMapper;
import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper;

    public List<Post> postList() {
        // return List.of(
        //     new Post(UUID.randomUUID(), "첫 번째 블로그", "블로그 내용 1", "작성자1", LocalDateTime.now()),
        //     new Post(UUID.randomUUID(), "두 번째 블로그", "블로그 내용 2", "작성자2", LocalDateTime.now()),
        //     new Post(UUID.randomUUID(), "세 번째 블로그", "블로그 내용 3", "작성자3", LocalDateTime.now())
        // );
        return postRepository.findAll();
        //return postMapper.listPost();
    }

    public List<Post> findByTitle(String title) {
        //return postRepository.findByTitle(title);
        //return postRepository.findByTitleContaining(title);
        return postMapper.findByTitle(title);

    }


}
