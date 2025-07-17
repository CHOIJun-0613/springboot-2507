package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {
    @GetMapping("/list")
    public String postList(){
        return "블로그 목록입니다.";     
    }
    @GetMapping("/{postId}")
    public String postDetail(@PathVariable String postId){
        return postId + "번 블로그 상세입니다.";
    }
    @GetMapping("/update")
    public String updatePost(@RequestParam String postId){
        return postId + "번 블로그 수정 페이지입니다.";
    }

}
