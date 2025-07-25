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
    public List<Post> postList(@RequestParam(value = "title", required = false) String title) {
        if (title == null || title.isEmpty()) {
            return postService.postList();
        }
        return postService.findByTitle(title);
    }
    // @GetMapping("/{postId}")
    // public Post postDetail(@PathVariable String postId){
    //     return new Post(UUID.randomUUID(), "블로그 제목", "블로그 내용...", "작성자", LocalDateTime.now());
    // }
    // @GetMapping("/update")
    // public Post updatePost(@RequestParam String postId){
    //     return new Post(UUID.randomUUID(), "수정된 블로그 제목", "수정된 블로그 내용", "작성자", LocalDateTime.now());
    // }
}
