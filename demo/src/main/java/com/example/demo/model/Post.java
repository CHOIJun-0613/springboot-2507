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
    private String postId;
    private String title;
    private String contents;
    private String author;
    private LocalDateTime createdDateTime;

    // 엔티티 생성 시 postId 자동 할당 예시
    public static Post create(String title, String contents, String author, LocalDateTime createdDateTime) {
        return Post.builder()
            .postId(java.util.UUID.randomUUID().toString())
            .title(title)
            .contents(contents)
            .author(author)
            .createdDateTime(createdDateTime)
            .build();
    }
}