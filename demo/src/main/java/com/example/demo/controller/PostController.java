package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;
import com.example.demo.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/list")
    public List<Post> postList(){
        /*
        return List.of(
            new Post(UUID.randomUUID(), "첫 번째 블로그", "블로그 내용 1", "작성자1", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "두 번째 블로그", "블로그 내용 2", "작성자2", LocalDateTime.now()),
            new Post(UUID.randomUUID(), "세 번째 블로그", "블로그 내용 3", "작성자3", LocalDateTime.now())
        );  
        */ 
        if(postService.getDataCount() < 1){
            postService.initData();
        }
        return postService.postList();
    }
    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(UUID.randomUUID(), "블로그 제목", "블로그 내용...", "작성자", LocalDateTime.now());
    }
    @GetMapping("/update")
    public Post updatePost(@RequestParam String postId){
        return new Post(UUID.randomUUID(), "수정된 블로그 제목", "수정된 블로그 내용", "작성자", LocalDateTime.now());
    }
    @GetMapping("/initdata")
    public List<Post> initData(){
        postService.initData();
        return postService.postList();
    }
}
