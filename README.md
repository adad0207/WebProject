# WebProject
MVC패턴을 이용한 웹프로젝트
***
### 스프링으로 웹 프로젝트를 만들기 위해 MVC 패턴에 대해 알기
![image](https://user-images.githubusercontent.com/77110648/161750430-938c5cce-460d-49f6-b62e-67a79124126e.png)

MVC 패턴은 Model, View, Controller 이 3가지로 나뉘어 역할을 분할하여 처리
나누어 처리하기 때문에 결함도가 낮아져 유지보수하기 편하다.   

#### 순서는   
* 사용자의 요청을 Controller가 받고 Controller가 요청(URL)에 맞는 메소드를 호출 
* Service와 함께 *Buisness Logic*을 처리
* 최종적으로 나온 결과를 Model에 저장하고 View에 던져준다
* View는 Controller에게 받은 데이터를 사용자에게 표시

(여기서 *Buisness Logic*은 업무에 필요한 데이터 처리를 수행하는 응용프로그램의 일부 ex) 회원 정보 저장, 조회 등)
