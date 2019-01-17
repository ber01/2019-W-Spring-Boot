# Study-Spring-Boot

![교재](./images/1.jpg)

### 2019 겨울방학 Spring Boot Study
- 교재 : 처음 배우는 스프링 부트2(한빛 미디어)
- 인원 : [민경환](https://www.github.com/ber01), [박동현](https://www.github.com/pdh6547), [신무곤](https://www.github.com/mkshin96), [신재홍](https://www.github.com/woghd9072), [양기석](https://www.github.com/yks095), [엄태균](https://www.github.com/etg6550), [임동훈](https://www.github.com/dongh9508), [최광민](https://www.github.com/rhkd4560), [하상엽](https://www.github.com/hagome0)
- JDK : JDK 8
- 개발 툴 : 인텔리제이
- 운영체제 : Mac OS

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
