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
| Day_1 | 1일 차에 진행 한 소스코드 |
| Day_2 | 2일 차에 진행 한 소스코드 |
| ... | ... |
| KeyWord | 각 Chapter 별 용어 정리 |

---

### [KeyWord](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword)
- Chapter 용어 정리

### [Day_1](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_1)
- application.yml 생성 및 테스트 프로퍼티값 추가
- @Value 어노테이션
- @ConfigurationProperties 어노테이션

### [Day_2](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_2)
- H2 Console 자동 설정 적용
- @SpringBootTest 어노테이션
- @WebMvcTest 어노테이션

### [Day_3](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_3)
- @DataJpaTest 어노테이션
- @RestCilentTest 어노테이션
- @JsonTest 어노테이션

### [Day_4](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_4)
- 게시판 프로젝트 생성
- 프로젝트 의존성 구성(Devtools, Lombok, Web, Thymeleaf, JPA, H2)
- 도메인 매핑
  1. 도메인 클래스 생성
  2. DB와 도메인 클래스 연결
- 도메인 테스트하기
  1. @DataJpaTest를 사용

### [Day_5](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_5)
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


### [Day_6](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_6)
- 스프링 부트 시큐리티 개념
- OAuth2 승인 타입 중 권한 부여 코드 승인 타입 방법
- 소셜 미디어 타입 정보 객체 생성
- USER 클래스 인증 컬럼 추가(principal, socialType)
- 스프링 부트 시큐리티 + OAuth2 의존성 설정
- 클라이언트 ID, Secret발급 받기(페이스북, 구글, 카카오)

### [Day_7](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_7)
- 1.5.14 버전 다운그레이드
- 시큐리티 설정
- OAuth2 설정

### [Day_8](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_8)
- User 정보를 가져온 후 세션에 저장
- 이해가 안가서 처음으로 되돌아감

### [Day_9](https://github.com/ber01/Study-Spring-Boot/tree/master/Day_9)
- 소셜 미디어 타입 정보를 나타내는 열거형 생성(facebook, google, kakao)
- User 테이블 컬럼 추가
  - principal : OAuth2 인증으로 제공받는 키 값
  - socialType : 어떤 소셜 미디어로 인증받았는지 여부
- SNS 연동을 위한 리소스 정보 추가하기
- SNS 리소스 정보를 객체로 매핑하는 ClientResources 클래스 생성
- 각 SNS의 프로퍼티 값을 호출하는 SecurityConfig 클래스 생성 후 빈 등록
- 시큐리티 설정을 위한 SecurityConfig 수정
