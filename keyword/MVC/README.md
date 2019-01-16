# MVC Pattern
- `Model`, `View`, `Controller`의 약자로 애플리케이션을 세 가지의 역할로 구분한 개발 방법

![mvc](../../images/2.png)
[출처](https://ko.wikipedia.org/wiki/%EB%AA%A8%EB%8D%B8-%EB%B7%B0-%EC%BB%A8%ED%8A%B8%EB%A1%A4%EB%9F%AC)

## Model
- 데이터를 가지고 있는 객체 또는 JAVA POJO
- 데이터가 변경되었을 때 Controller의 데이터를 업데이트 하는 로직도 포함

## View
- Model에 포함된 데이터의 시각화를 담당
- html/css/javascript들을 모아둔 컨테이너

## Controller
- 모델과 뷰에 전부 영향을 미치며 모델 객체로의 데이터 흐름을 제어
- 데이터가 update 되었을 때 뷰를 갱신, 뷰와 모델의 역할을 분리
