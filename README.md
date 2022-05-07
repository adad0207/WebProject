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


### 프로젝트 생성 후
* web.xml의 파일 삭제 및 스프링 관련 파일 삭제
* pom.xml의 수정 및 스프링 버전 변경
* Java설정 관련 패키지 생성

## 스프링의 주요 특징
### POJO 기반의 구성
* 다른 프레임들과 달리 관계를 구성할 때 별도의 API 등을 사용하지 않음
* Java코드를 이용해서 객체를 구성하는 방식을 그대로 스프링에서 사용할 수 있다는 얘기
### 의존성 주입(DI)을 통한 객체 간의 관계구성
* 의존성 이란 하나의 객체가 다른 객체 없이 제대로 된 역할을 할 수 없다는 것
* 주입 이란 외부에서 밀어 넣는 것, 주체가 능동적인지 수동적인지의 문제
* 합치면 어떤 객체가 필요한 객체를 외부에서 밀어넣는다. 는 의미
* ![image](https://user-images.githubusercontent.com/77110648/167125920-b2b090a1-d8d3-495f-952c-ebfd491596f3.png)
* 여기서 외부의 존재는 ApplicationContext라는 존재가 수행, 이 존재는 의존성이 필요한 객체에 필요한 객체를 찾아 주입.
* 따라서 객체와 객체를 분리해서 생성하고, 이러한 객체들을 엮는 작업을 하는 형태의 개발을 하게 됨
* ApplicationContext가 관리하는 객체들을 빈(Bean), 빈과 빈 사이의 의존관계를 처리하는 방식으로 XML 설정, 어노테이션 설정, Java 설정 방식을 이용
### AOP지원
* 비즈니스 로직은 아니지만, 반드시 처리가 필요한 부분인 '횡단 관심사'를 모듈로 분리하는 프로그래밍의 패러다임
* AspectJ의 문법을 통해서 작성가능, 비즈니스 로직에만 집중 가능, 코드의 수정을 최소화, 유지보수가 수월한 코드 구성
### 편리한 MVC구조
### WAS의 종속적이지 않은 개발 환경

## pom.xml 에서 오류가 발생했을 때
* m.2폴더에서 오류와 관련된 폴더를 삭제 후 이클립스 재 실행, 후에 maven - update project

## 의존성
### XML을 이용하는 의존성
* STS의경우 기본적으로 XML을 이용해서 스프링에서 관리해야하는 객체들을 처리
* root-context.xml은 빈을 설정하는 파일

* @Runwith은 현재 테스트 코드가 스프링을 실행하는 역할을 할 것이라는 것을 표시
* @ContextConfiguartion은 지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링 내에 객체로 등록 (빈으로 등록)
* @Autowired는 해당 인스턴스 변수가 스프링으로부터 자동으로 주입해 달라는 표시

* 1) 테스트 코드가 실행되기 위해서 스프링 프레임워크가 동작했고
* 2) 동작하는 과정에서 필요한 객체들이 스프링에 등록되었고
* 3) 의존성 주입이 필요한 객체는 자동으로 주입이 이루어졌다


## 어노테이션

### Lombok
 * @Setter : setter 메서드를 만들어주는 역할
 * @Setter 에서 onMethod : setter메서드 생성 시 메서드에 추가할 어노테이션을 지정 버전에 따라 '_' 사용
 * @Data : 한번에 자주 사용되는 메서드 생성
### Spring
 * @Component : 해당 클래스가 스프링에서 객체로 만들어서 관리하는 대상임을 명시하는 어노테이션
 * @Autowired : 스프링 내부에서 자신이 특정한 객체에 의존적이므로 자신에게 해당 타입의 빈을 주입해주라는 표시

## 오라클
![image](https://user-images.githubusercontent.com/77110648/167245763-55b74aa1-422b-4df3-a209-42436712e2af.png)

* 설치 후 사용자 생성 및 권한 부여
### JDBC연결 테스트 전 SQL Developer에서 연결이 가능한지 테스트 (SQL Developer는 내부적으로 JDBC를 이용하기 때문)
#### 8080 포트변경
* 오라클 11g의 경우 기본적으로 8080포트를 이용해서 웹환경으로도 데이터베이스에 접근 가능한데
* tomcat의 기본포트가 8080이기 때문
* ![image](https://user-images.githubusercontent.com/77110648/167246288-4ab54377-ebb9-4f46-abd6-36d7d00809c5.png)
* sys계정으로 접속 후 해당 구문을 이용해서 포트번호 확인후 포트번호 변경
#### JDBC연결
* jdbc 드라이버 jar파일 라이브러리에 추가
* jdbc 테스트 코드
* ```package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testConnection() {
		try(Connection con =
			DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"book_ex",
					"book_ex")){
			log.info(con);
			} catch (Exception e) {
				fail(e.getMessage());
			}
		
	}
	
}```
