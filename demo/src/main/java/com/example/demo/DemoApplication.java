package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.TimeZone;
import java.util.UUID;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.example.demo.model.Post;
import com.example.demo.repository.PostRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
@RequiredArgsConstructor
public class DemoApplication  {

    //private final PostRepository postRepository;

    // 애플리케이션 시작 시 타임존을 KST로 설정
    @PostConstruct
    public void setTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }



    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    @Profile("dev")
    public CommandLineRunner initPostData(PostRepository postRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String[] args) throws Exception {
                if (postRepository.count() == 0) {
                    postRepository.save(new Post(
                            UUID.randomUUID(),
                            "title1",
                            "블로그 내용 1",
                            "작성자1",
                            LocalDateTime.now()
                    ));
                    postRepository.save(new Post(
                            UUID.randomUUID(),
                            "title2",
                            "블로그 내용 2",
                            "작성자2",
                            LocalDateTime.now()
                    ));
                    postRepository.save(new Post(
                            UUID.randomUUID(),
                            "title  3",
                            "블로그 내용 3",
                            "작성자3",
                            LocalDateTime.now()
                    ));
                    postRepository.save(new Post(
                            UUID.randomUUID(),
                            "title 4",
                            "블로그 내용 4",
                            "작성자4",
                            LocalDateTime.now()
                    ));
                    postRepository.save(new Post(
                            UUID.randomUUID(),
                            "title 5",
                            "블로그 내용 5",
                            "작성자5",
                            LocalDateTime.now()
                    ));
 
                }
            }
        };
    }
}
