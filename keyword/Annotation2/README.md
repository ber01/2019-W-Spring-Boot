## Annotation2
#### 1. @Service
- `Repository`를 통하여 `DB`에서 `데이터`를 가져온 후 `Controller`에게 전달해 주는 클래스임을 명시

#### 2. Pageable
- 쿼리 메소드에 `페이징`기능을 제공하는 `인터페이스`
- [메소드 요약](https://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/domain/Pageable.html)

#### 3. @Controller
- `클라이언트`로부터 전달된 `데이터`를 가공하기 위한 `Controller`임을 명시
- `@RequestMapping`을 통하여 경로 설정을 하게 됨

#### 4. @RequestMapping
- `Controller 구현` 이란 클라이언트의 요청을 처리하는 `메소드를 구현`하는 것
- `클라이언트 요청`은 `URL`로 이루어짐
- 요청 URL을 어떠한 `메소드`가 처리할지 결정하는 어노테이션

#### 5. @RequestParam
- 단일 `HTTP 요청 파라미터`를 `메소드 파라미터`에 넣어주는 어노테이션

#### 6. @PageableDefault
- Pageable을 사용할 때 `사이즈`, `정렬방법`을 정의하는 어노테이션
