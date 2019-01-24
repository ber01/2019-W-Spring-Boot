# p136 ~ p137 코드 정리

- `@EnableWebSecurity`
  1. 웹에서 시큐리티 기능을 사용하겠다는 어노테이션
  2. 어노테이션을 선언한 것만으로는 유용하지 않고 두 가지의 설정 방법이 존재
      1. WebSecurityConfigurer 구현
      2. WebSecurityConfigurerAdapter를 확장하여 클래스를 설정
</br> 
- `WebSecurityConfigurerAdapter`
  1. `configure()` 메소드를 오버라이드하여 웹 보안 설정가능
  2. 세 가지의 configure()메소드 존재
      1. configure(WebSecurity)
      2. configure(HttpSecurity)
      3. configure(AuthenticationManagerBuilder)
</br>
- `configure(HttpSecurity http)`
  1. 스프링 보안에서 폼 기반 인증을 지원하는 메소드
  1. `WebSecurityConfigurerAdapter` 클래스에서 오버라이드 하는 세가지 메서드 중 하나
  2. 특정 http요청에 대하여 웹 기반 보안을 구성할 수 있음
</br>
- `CharacterEncodingFilter filter = new CharacterEncodingFilter`
  - 요청에 대한 문자 인코딩을 지정할 수 있게 해주는 서블릿 필터 객체 생성
</br>
- `.authorizeRequest()`
  - 응용 프로그램에 대한 요청이 사용자의 인증을 요구
</br>
- `.antMatchers(path)`
  - 지정한 path를 리스트 형식으로 설정
</br>
- `.permitAll()`
  - 설정된 요청 path를 누구나 접근할 수 있게 설정
</br>
- `.anyRequest().authenticated()`
  - 이 외의 요청에 대해서는 인증이 필요함을 명시
</br>
- `.headers().frameOptions().disable()`
  - `Spring Security`와 `Spring Boot`를 같이 사용하게 되면 H2 데이터 베이스 콘솔 접근이 차단되는 상황을 막기 위해 사용
</br>
- `.authenticationEntryPoint(new LoginUrlAuthenticationEntrtyPoint())`
  1. 인증되지 않은 사용자가 허용되지 않은 경로에 요청할 경우 지정한 경로로 리다이렉트
  2. 로그인 양식의 위치를 보유하고 이를 사용하여 로그인 페이지에 대한 라다이렉션 URL을 보유
</br>
- `formLogin().successForwardUrl(path)`
  - 로그인 성공시 지정된 path로 이동
</br>
- `.logout()`
  - 로그아웃 지원을 제공, `WebSecurityConfigurerAdapter`를 사용할 때 자동으로 적용
</br>
- `.logoutUri(path)`
  - 로그아웃을 유발하는 URL, default 값은 `/logout`
</br>
- `.logoutSuccessUrl(path)`
  - 로그아웃 후 리다이렉션 할 URL, default 값은 `/login?logout`
</br>
- `.deleteCookies(str)`
  - 로그아웃 성공시 제거할 쿠키의 이름 지정
</br>
- `.invalidateHttpSession(true)`
  - 로그아웃 할 때 HttpSession을 무효화 여부 결정
</br>
- `.addFilterBefore(filter1, filter2)`
  - filter2실행 후 filter1 실행
</br>
- `CsrfFilter.class`
  - 사이트간 요청 위조를 방지하는 필터
</br>
- `csrf().disable()`
  - `Spring Security`와 `Spring Boot`를 같이 사용하게 되면 H2 데이터 베이스 콘솔 접근이 차단되는 상황을 막기 위해 사용
</br>
- `H2`가 `Spring boot`와 `Spring Security`를 연동하게 되면 작동하지 않는 상황이 발생 이를 해결하기 위하여 세 가지 행위가 필요햐다.
  1. h2 데이터베이스 콘솔 url 요청 허용(`.antMatchers("/console/**")`)
  2. csrf 중지(`.csrf().disable`)
  3. X-Frame-Options 중지(`.headers().frameOptions().disable()`)
