package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Post;

@Mapper
public interface PostMapper {
    public List<Post> listPost();

}
