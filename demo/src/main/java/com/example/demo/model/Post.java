package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor
@AllArgsConstructor 
@Entity
@Builder
public class Post{

    @Id
    private UUID postId; // @GeneratedValue 제거
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;
}