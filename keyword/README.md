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

#### 8. @Value
- 프로퍼티의 키를 사용하여 특정한 값 호출

#### 8. @ConfigurationProperties
- 다양한 형의 프로퍼티값 매핑
- 접두사를 사용하요 값을 바인딩

---
