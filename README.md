# Study-Spring-Boot

![교재](./images/1.jpg)

### 2019 겨울방학 Spring Boot Study
- 교재 : 처음 배우는 스프링 부트2(한빛 미디어)
- 인원 : [민경환](https://www.github.com/ber01), [박동현](https://www.github.com/pdh6547), [신무곤](https://www.github.com/mkshin96), [신재홍](https://www.github.com/woghd9072), [양기석](https://www.github.com/yks095), [엄태균](https://www.github.com/etg6550), [임동훈](https://www.github.com/dongh9508), [최광민](https://www.github.com/rhkd4560), [하상엽](https://www.github.com/hagome0)
- JDK : JDK 8
- 개발 툴 : 인텔리제이
- 운영체제 : Mac OS

---

### 기획
- 스프링 부트의 기본 개념을 이해하고 커뮤니티 게시판 구축
- 참여 인원 모두가 개인 프로젝트 진행
- 용어 정리 및 공유, 소스코드 피드백

| 폴더 이름 | 설명 |
|:--------:|:--------:|
| [src](https://github.com/ber01/Study-Spring-Boot/tree/master/src) | 진행한 소스코드 |
| images | 이미지 |
| [KeyWord](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword) | 각 Chapter 별 용어 정리 |

---

### 1일차
- application.yml 생성 및 테스트 프로퍼티값 추가
- @Value 어노테이션
- @ConfigurationProperties 어노테이션

### 2일차
- H2 Console 자동 설정 적용
- @SpringBootTest 어노테이션
- @WebMvcTest 어노테이션

### 3일차
- @DataJpaTest 어노테이션
- @RestCilentTest 어노테이션
- @JsonTest 어노테이션

### 4일차
- 게시판 프로젝트 생성
- 프로젝트 의존성 구성(Devtools, Lombok, Web, Thymeleaf, JPA, H2)
- 도메인 매핑
  1. 도메인 클래스 생성
  2. DB와 도메인 클래스 연결
- 도메인 테스트하기
  1. @DataJpaTest를 사용

### 5일차
- Service 클래스 생성
- Controller 클래스 생성
- DataBase에 데이터 넣기(CommandLineRunner활용)
- 타임리프를 사용하여 게시글 리스트 및 등록 폼 생성
- H2-console 확인

`application.properties`
~~~
spring.thymeleaf.cache=false

spring.jpa.hibernate.ddl-auto=update
spring.jpa.generate-ddl=true
spring.jpa.show-sql=true

spring.h2.console.enabled=true

logging.level.org.hibernate=info
logging.level.org.springframework.web=info
~~~
`url : http://localhost:8080/h2-console/`


### 6일차
- 스프링 부트 시큐리티 개념
- OAuth2 승인 타입 중 권한 부여 코드 승인 타입 방법
- 소셜 미디어 타입 정보 객체 생성
- USER 클래스 인증 컬럼 추가(principal, socialType)
- 스프링 부트 시큐리티 + OAuth2 의존성 설정
- 클라이언트 ID, Secret발급 받기(페이스북, 구글, 카카오)

### 7일차
- 1.5.14 버전 다운그레이드
- 시큐리티 설정
- OAuth2 설정

### 8일차
- User 정보를 가져온 후 세션에 저장
- 이해가 안가서 처음으로 되돌아감

### 9일차
- 소셜 미디어 타입 정보를 나타내는 열거형 생성(facebook, google, kakao)
- User 테이블 컬럼 추가
  - principal : OAuth2 인증으로 제공받는 키 값
  - socialType : 어떤 소셜 미디어로 인증받았는지 여부
- SNS 연동을 위한 리소스 정보 추가하기
- SNS 리소스 정보를 객체로 매핑하는 ClientResources 클래스 생성
- 각 SNS의 프로퍼티 값을 호출하는 SecurityConfig 클래스 생성 후 빈 등록
- 시큐리티 설정을 위한 SecurityConfig 수정

### 10일차
- OAuth2 설정
  - 웹에서 OAuth2를 사용하기 위하여 @EnableOAuth2Client 추가
    1. 현재 요청과 컨텍스트를 저장하는 필터 빈 생성
    2. AccessTokenRequest 타입 빈 생성
  - 권한 서버의 응답값을 받기 위한 OAuth2ClientContext 객체 생성
  - 1)을 수행하는 oauth2ClientFilterRegistration 메소드 생성
    - FilterRegistrationBean : 필터를 추가하는 방법
    - OAuth2ClientContextFilter : 요청 처리 동안에 인증을 필요로 하는 경우 OAuth 인증 URI로 오고 가는 리다이렉트 관리
  - facebook, google, kakao 로그인 관련 필터를 생성하는 oauth2Filter() 메소드 생성

### 11일차
- MySQL 연동 및 테스트
  - MySQL, MySQL_WorkBench 다운로드
    - connection, schema 생성
  - MySQL 런타임 의존성 추가(build.gradle)
  - MySQL 연동을 위한 YAML파일 설정 추가(application.yml)
  - [MySQL 테이블 확인](./images/3.png)
- REST API 프로젝트 생성(Spring-Boot-Rest)
  - 그레이들 멀티 프로젝트 구성(data-rest, rest-web)
    - rest-web : 스프링 부트 MVC 패턴으로 REST API 구현
    - data-rest : 스프링 부트 데이터 레스트로 REST API 구현
  - 의존성 설정(build.gradle)
- REST API 구현하기(rest-web)
  - DB 설정 프로퍼티 datasource 설정(application.yml) 및 포트 설정
  - 커뮤니티 게시판 코드 입력
  - [페이징 된 Board 객체 데이터 읽어오기](./images/4.png)

### 12일차
- 서로 다른 도메인의 접근을 허용 권한을 위한 CORS 적용
- 생성, 수정, 삭제 구현
  - form.html 수정 : 페이지 변화 없이 데이터 요청/응답
  - 생성 : @PostMapping
  - 수정 : @PutMapping
  - 삭제 : @DeleteMapping
