package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Post;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping("/list")
    public List<Post> postList(){
        return List.of(
            new Post("1", "첫 번째 블로그", "블로그 내용 1", "작성자1", LocalDateTime.now()),
            new Post("2", "두 번째 블로그", "블로그 내용 2", "작성자2", LocalDateTime.now()),
            new Post("3", "세 번째 블로그", "블로그 내용 3", "작성자3", LocalDateTime.now())
        );     
    }
    @GetMapping("/{postId}")
    public Post postDetail(@PathVariable String postId){
        return new Post(postId, "블로그 제목...", "블로그 내용...", "작성자", LocalDateTime.now());
    }
    @GetMapping("/update")
    public Post updatePost(@RequestParam String postId){
        return new Post(postId, "수정된 블로그 제목", "수정된 블로그 내용", "작성자", LocalDateTime.now());
    }
  
}
