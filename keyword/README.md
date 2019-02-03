# 용어정리

## (1) Ch.1, Ch.2

#### 1. Dependency
- 코드에서 두 모듈간의 연결
- 두 개의 클래스 간의 관계

#### 2. DI(Dependency Injection)
- instance의 생성 및 생명 주기를 외부로 맡기는 행위
- 필요한 경우에 따라 instance를 외부로 부터 주입 받아서 사용
- instance의 생성 및 관리의 주체가 개발자가 아닌 외부이기 때문에 제어의 역전이 됨

#### 3. REST API
- REST : 웹에 존재하는 모든 자원에 고유한 URI를 부여해 활용하는 것
- REST의 특징을 지키는 API

#### 4. JPA
- 어플리케이션과 JDBC 사이에서 동작하는 ORM의 표준 인터페이스
- ORM : 데이터베이스와 객체 지향 프로그래밍 언어 간의 호환되지 않는 데이터 변환 기법
- JDBC : 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 인터페이스

#### 5. Gradle
- Groovy를 이용한 빌드 자동화 시스템

#### 6. @RestController
- REST 방식의 데이터 자체를 서비스로 제공
- JSP처럼 뷰를 생성하는 것이 아닌 데이터 자체를 반환(단순 문자열, JSON, XML)

#### 7. @GetMapping
- 요청 URL을 어떠한 메서드가 처리할 지 맵핑
- controller 내부에서 URI 경로 지정

#### 8. YAML 파일
- 사람이 쉽게 읽을 수 있는 데이터 직렬화 양식
- JSON, XML과 같은 가독성을 고려한 데이터 포맷 형식

#### 9. @Value
- 프로퍼티의 키를 사용하여 특정한 값 호출

#### 10. @ConfigurationProperties
- 다양한 형의 프로퍼티값 매핑
- 접두사를 사용하여 값을 바인딩

#### 11. @Data
- 아래 어노테이션을 한 번에 처리하는 어노테이션
- @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredAndConstructor
- @ToString : 모든 필드를 출력하는 toString() 메소드 생성
- @EqualsAndHashCode : hashcode 와 equals 메소드를 생성
- @Getter/@Setter : getter, setter를 생성하지 않도록 지원
- @RequiredAndConstructor : 생성자 생성 관련 지원

### 12. Spring Bean
- 스프링 컨테이너에서 생성 된 자바 객체

#### 13. @Bean, @Component
- 목적이 명확하지 않은 자바 객체(Bean)를 생성할 때 사용하는 어노테이션
- @Bean : 개발자가 컨트롤이 불가능한 외부 라이브러리를 Bean으로 등록하고 싶을 때 사용
- @Component : 개발자가 직접 컨트롤이 가능한(생성한) 클래스의 경우 사용

#### 14. H2
- 자바로 작성된 인 메모리 관계형 데이터베이스 관리 시스템
---

## (2) Ch.3

#### 1. @JUnit
- 자바의 대표적인 단위 테스트 프레임워크

#### 2. @RunWith
- JUnit 프레임워크 테스트 실행 방법을 확장할 때 사용
- Runner 클래스 설정 시 내장 된 Runner 대신 해당 하는 클래스 실행

#### 3. @SpringBootTest
- 통합 테스트를 제공하는 기본적인 스프링 부트 어노테이션
- 애플리케이션이 실행될 때의 설정을 임의로 바꾸어 테스트를 진행할 수 있음

#### 4. @WebMvcTest
- MVC를 위한 테스트, 웹에서 테스트하기 힘든 컨트롤러를 테스트 하는데 적합
- 웹 상에서 요청과 응답에 대해 테스트 할 수 있음

#### 5. @DataJpaTest
- JPA관련 테스트 설정만 로드 가능
- JPA를 사용하여 데이터를 생성, 수정, 삭제등의 테스트 가능
- 실제 데이터베이스가 아닌 내장형 데이터베이스를 사용할 수 있음

#### 6. @RestCilentTest
- REST관련 테스트를 도와주는 어노테이션
- JSON 형식이 예상대로 응답을 반환하는지 테스트

#### 7. @JsonTest
- JSON의 직렬화와 역직렬화를 수행하는 라이브러리 제공
- 문자열로 나열된 JSON 데이터를 객체로 변환하여 변한된 객체의 값 테스트

---

## (3) Ch.4
#### 1. [MVC 패턴](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword/MVC)

#### 2. [타임리프(Tymeleaf), 템플릿, 템플릿 엔진](https://github.com/rhkd4560/Study-SpringBoot/tree/master/Spring%204day/homework)

#### 3. [의존 라이브러리](https://github.com/dongh9508/Study-SpringBoot2/tree/master/keyword/LINK/dependency%20library)
- Web
- 타임리프
- JPA
- Devtools
- 롬복
- H2

#### 4. [각종 어노테이션 모음](https://github.com/etg6550/2019WinterProject/tree/master/Day4/HomeWork)
- Serializable
- @Getter
- @NoArgsConstructor
- @Entity
- @Table
- @Id
- @Column
- @Builder

#### 5. [각종 어노테이션 모음2](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword/Annotation2)
- @Service
- Pageable
- @Controller
- @RequestMapping
- @RequestParam
- @PageableDefault

---

## (4) Ch.5
#### 1. [스프링 부트 시큐리티, OAuth2](https://github.com/etg6550/2019WinterProject/tree/master/Day6)
- 소개
- 인증 수행 방법
- 권한 부여 코드 승인타입

#### 2. [각종 어노테이션 및 인터페이스](https://github.com/pdh6547/study-spring-boot/blob/master/Keyword/Homework/Annotaion%20and%20Interface.md)
- @NestedConfigurationProperty
- AuthorizationCodeResourceDetails
- ResourceServerProperties
  - OAuth2 리소스 값
- @Configuration
- 동기, 비동기 통신

#### 3. [각종 어노테이션 및 인터페이스2](https://github.com/hagome0/Study-Spring-Boot/tree/master/keyword/Annotaion%20and%20Interface2)
- @EnableWebSecurity
- WebSecurityConfigurerAdapter
- HttpServletRequest
- XFrameOptionsHeaderWriter
- CharacterEncodingFilter
- CsrfFilter

#### 4. [각종 어노테이션 및 인터페이스3](https://github.com/woghd9072/study-spring-boot/tree/master/Keyword/Homework)
- @EnableOAuth2Client
- OAuth2ClientContext
- BasicAuthenticationFilter
- FilterRegistrationBean
- Filter
- CompositeFilter
- OAuth2ClientAuthenticationProcessingFilter
- OAuth2RestTemplate
- UserInfoTokenService

#### 5. [OAuth2 정리](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword/OAuth2)
- 권한 부여 코드 승인타입 인증 절차

#### 6. [p136 ~ p137 코드 정리](https://github.com/ber01/Study-Spring-Boot/tree/master/keyword/p136)

---
## (5) Ch.6
#### 1. [용어정리 #1](https://github.com/mkshin96/study-spring-boot/blob/master/%EC%9A%A9%EC%96%B4%20%EC%A0%95%EB%A6%AC/REST.md)
- REST
- RESTful
- HATEOAS
