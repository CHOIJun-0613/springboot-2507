# Spring Boot Demo Project

## 🚀 프로젝트 개요

이 프로젝트는 Spring Boot를 사용하여 개발된 간단한 데모 애플리케이션입니다. 주로 RESTful API를 통해 게시물(Post)을 관리하는 기능을 시연합니다. 백엔드 API와 기본적인 프론트엔드(HTML) 페이지를 포함하고 있어, Spring Boot 애플리케이션의 기본적인 구조와 동작 방식을 이해하는 데 도움이 됩니다.

## ✨ 주요 기능

- **게시물 목록 조회:** 모든 게시물의 목록을 조회합니다.
- **특정 게시물 조회:** ID를 통해 특정 게시물의 상세 정보를 조회합니다.
- **게시물 수정 (임시):** 게시물 정보를 업데이트합니다. (현재는 임시 구현)
- **정적 리소스 제공:** `index.html`과 같은 정적 파일을 제공합니다.

## 🛠️ 개발 환경 설정

이 프로젝트를 로컬에서 실행하기 위한 최소 요구 사항은 다음과 같습니다.

- **Java Development Kit (JDK):** 17 이상 (프로젝트 `build.gradle`에 따라 다를 수 있음)
- **Gradle:** 빌드 자동화 도구 (프로젝트에 포함된 `gradlew` 사용 권장)

### 프로젝트 클론

```bash
git clone [프로젝트_레포지토리_URL]
cd [프로젝트_폴더_이름]
```

## 📦 프로젝트 빌드

프로젝트를 빌드하려면 다음 Gradle 명령을 사용합니다:

```bash
./gradlew build
```

Windows 환경에서는 `gradlew.bat build`를 사용합니다.

## ▶️ 애플리케이션 실행

빌드 후 애플리케이션을 실행하려면 다음 명령을 사용합니다:

```bash
./gradlew bootRun
```

Windows 환경에서는 `gradlew.bat bootRun`을 사용합니다.

애플리케이션은 기본적으로 `http://localhost:8081` 포트에서 실행됩니다. 웹 브라우저에서 `http://localhost:8081/index.html`로 접속하여 테스트 페이지를 확인할 수 있습니다.

또는 빌드된 JAR 파일을 직접 실행할 수 있습니다:

```bash
java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
```

## 🧪 테스트 실행

프로젝트의 테스트를 실행하려면 다음 명령을 사용합니다:

```bash
./gradlew test
```

Windows 환경에서는 `gradlew.bat test`를 사용합니다.

## 📂 프로젝트 구조

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── DemoApplication.java
│   │       ├── controller/PostController.java
│   │       └── model/Post.java
│   └── resources/
│       ├── application.yml
│       └── static/index.html
└── test/
    └── java/
        └── com/example/demo/
            └── DemoApplicationTests.java
```