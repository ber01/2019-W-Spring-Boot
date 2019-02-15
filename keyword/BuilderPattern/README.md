# Builder Pattern
- 생성자에 매개변수가 많을 때, 가독성이 떨어질 때, 이를 해결하기 위한 좋은 방법

~~~java
public class Board{
  private Long idx;
  private String title;
  private String content;
  private LocalDateTime createDate;
}
~~~

## 방법1
- 각 매개변수에 대한 생성자 생성
~~~java
public class Board{

  ...

  public Board(){

  }

  public Board(Long idx){
    this.idx = idx;
  }

  public Board(Long idx, String title){
    this.idx = idx;
    this.title = title;
  }

  public Board(Long idx, String title, String content){
    this.idx = idx;
    this.title = title;
    this.content = content;
  }

  public Board(Long idx, String title, String content, LocalDateTime createDate){
    this.idx = idx;
    this.title = title;
    this.content = content;
    this.createDate = createDate;
  }
}
~~~
~~~java
Board board = new Board();
Board board = new Board(1);
Board board = new Board(1, "title");
Board board = new Board(1, "title", "content");
Board board = new Board(1, "title", "content", LocalDateTime.now());
~~~

## 방법2
- setter 함수 생성
~~~java
public class Board{

  ...

  public void setIdx(Long idx) {
       this.idx = idx;
   }

   public void setTitle(String title) {
       this.title = title;
   }

   public void setContent(String content) {
       this.content = content;
   }

   public void setCreatedDate(LocalDateTime createdDate) {
       this.createdDate = createdDate;
   }
}
~~~
~~~java
Board board = new Board();
board.setIdx(1);
board.setTitle("title");
board.setContent("content");
board.setCreatedDate(LocalDateTime.now());
~~~

## 방법3
- Builder Pattern 사용
- 기본 생성자를 생성하지는 않기 때문에 `@NoArgsConstructor` 선언
~~~java
@NoArgsConstructor
public class Board{

  ...

  @Builder
  public Board(Long idx, String title, String content, LocalDateTime createdDate) {
    this.idx = idx;
    this.title = title;
    this.content = content;
    this.createdDate = createdDate;
  }
}
~~~
~~~java
Board.builder()
  .idx(1);
  .title("title")
  .content("content")
  .createDate(LocalDateTime.now())
  .build();
~~~
