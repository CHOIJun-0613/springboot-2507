package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {
//public class DemoApplication  {

    private final PostRepository postRepository;

    // 애플리케이션 시작 시 타임존을 KST로 설정
    @PostConstruct
    public void setTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // 초기 데이터 세팅 또는 애플리케이션 시작 시 실행할 로직을 작성합니다.
        postRepository.save(new Post(UUID.randomUUID(), "첫 번째 게시글", "내용1","작성자1", LocalDateTime.now()));
        postRepository.save(new Post(UUID.randomUUID(), "두 번째 게시글", "내용2","작성자2", LocalDateTime.now()));
        postRepository.save(new Post(UUID.randomUUID(), "세 번째 게시글", "내용3","작성자3" ,LocalDateTime.now()));
    }
}
