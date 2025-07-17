# Gemini Project Context: Spring Boot Demo

이 문서는 Gemini가 이 프로젝트를 이해하는 데 도움을 주기 위해 작성되었습니다.

## 프로젝트 개요

이 프로젝트는 Spring Boot를 사용하여 구축된 간단한 웹 애플리케이션입니다. `PostController`와 `Post` 모델이 있는 것으로 보아, 게시물을 관리하는 REST API를 제공하는 것으로 보입니다.

## 주요 명령어

- **프로젝트 빌드:** `./gradlew build`
- **애플리케이션 실행:** `./gradlew bootRun`
- **테스트 실행:** `./gradlew test`

## 주요 파일

- `src/main/java/com/example/demo/DemoApplication.java`: Spring Boot 애플리케이션의 메인 진입점입니다.
- `src/main/java/com/example/demo/controller/PostController.java`: HTTP 요청을 처리하는 컨트롤러입니다.
- `src/main/java/com/example/demo/model/Post.java`: 게시물을 나타내는 데이터 모델입니다.
- `build.gradle`: 프로젝트의 의존성 및 빌드 구성을 정의합니다.
- `src/main/resources/application.yml`: 애플리케이션의 설정을 정의합니다.
