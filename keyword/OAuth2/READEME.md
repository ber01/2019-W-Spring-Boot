# OAuth2
- 사용자가 패스워드 없이 가입된 서비스의 API를 사용할 수 있도록 권한을 부여하는 기술
- 소셜 미디어를 사용하여 편리하게 인증하는 방식
- `액세스 토큰(Access Token)`을 발급하는 것


## 용어정리
- Resource Server : 데이터를 가지고 있는 서버(페이스북, 구글, 카카오)
- Resource Owner : 자원을 사용하는 사람(나)
- Client : 웹 사이트(경성포탈)
- Authorization Server : 인증과 관련된 처리를 전담하는 서버(페이스북, 구글, 카카오)

# OAuth 절차
- OAuth2에서 제공하는 4가지의 승인타입 중 `권한 부여 코드 승인 타입`에 해당하는 절차
### 1. 등록(register)
- `Client`가 `Resource Server`를 이용하기 위하여 사전에 등록을 하는 행위
- `Client ID`, `Client Secret`, `Authorization redirect URL`를 공통적으로 받는다.
  1. Client ID : application을 식별하는 `식별자`
  2. Client Secret : Client ID에 해당하는 `비밀번호`
  3. Authorization redirect URL : 권한을 부여받는 과정에서 `Authorization Code`를 전달받는 주소
- 등록을 완료하면 `Client`와 `Resource Server`는 세 가지의 정보를 알게 된다.

### 2. Resource Owner 승인
- `Resource Owner`가 `Resource Server`에게 `Client`의 접근을 승인하는 행위
- `Resource Owner`가 `Client`에 접속하는 과정에서 `Resource Server`를 사용하려면?
  1. `Client`가 `Resource Owner`에게 소셜 로그인 화면을 보여준다.(페이스북, 구글, 카카오 로그인)
  2. 로그인 버튼을 클릭하게 되면 `Resource Owner`가 로그인에 동의하게 된다.
      - 로그인 버튼은 `Client ID`, `Scope`, `redirect uri`로 구성된다.
        1. Client ID : application을 식별하는 `식별자`
        2. Scope : Resource Server로 부터 사용하고자 하는 기능
        3. redirect uri : `Authorization Code`를 전달받는 주소
- 로그인 버튼의 주소를 통하여 `Resource Owner`가 `Resource Server`로 접속
  1. `Resource Server`는 `Resource Owner`의 접속 유무 파악
      - 로그인이 되어 있지 않았을 경우 : 로그인 화면을 보여줌
      - 로그인이 되어 있을 경우
        1. 로그인 버튼의 주소에 있는 `Client ID`와 `Resource Server`가 들고 있는 `Client ID`를 비교
        2. 로그인 버튼의 주소에 있는 `redirect uri`와 `Resource Server`가 들고 있는 `redirect uri`비교
            - redirect uri가 다를 경우 : 작업종료
            - redirect uri가 같을 경우
                1. `Scope`에 해당하는 권한을 `Client`에 부여할 것인지 확인
                2. 확인버튼 후 `Resource Server`는 `User Id`와 `Scope`에 대한 추가 정보를 얻게 됨
                    1. User Id : `Resource Owner`를 식별하는 `식별자`
                    2. Scope : Resource Server로 부터 사용하고자 하는 기능
### 3. Resource Server 승인
- `Resource Owner`의 승인 이후 `Resource Server`의 승인을 받는 행위
- `authorization code`를 통하여 인증 과정을 한번 더 거친다.
- `Resource Server`는 `authorization code`를 생성하여 `Resource Owner`에게 전송한다.
- `Resource Owner`는 `Client`에게 전송받은 `authorization code`를 전달한다.
- `Client`는 `Resource Server`에게 직접 접근을 시도한다.
  - 접근을 시도할 때 `Client ID`, `Client Secret`, `Client ID`, `redirect uri`, `authorization code` 4가지의 정보를 담은 주소를 요청한다.
- `Resource Server`는 자신의 정보와 요청 정보를 비교한다.
  1. `authorization code` 비교
  2. `Client ID` 비교
  3. `Client Secret` 비교
  4. `redirect uri` 비교
      - 요청 정보가 모두 일치한다면 `Access Token` 발급준비

### 4. 액세스 토큰(Access Token)발급
- `Client`가 `Resource Server`로 부터 `Access Token`을 발급받는 행위
- 요청 정보가 모두 일치하였기에 `Client`와 `Resource Server`는 `authorization code`에 관한 정보 삭제
- `Resource Server`는 `Access Token` 생성
- `Access Token`을 `Client`에게 응답
