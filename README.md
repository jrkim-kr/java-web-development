# 『자바 웹을 다루는 기술』

# 1장 프로그램의 발전 과정

## 1.1 클라이언트 PC 기반 프로그램

## 1.2 클라이언트-서버 기반 프로그램 동작 방식

## 1.3 웹 기반 프로그램 동작 방식

# 2장 웹 프로그래밍과 JSP

## 2.1 웹 프로그래밍의 기본

## 2.2 정적 웹 프로그래밍

## 2.3 동적 웹 프로그래밍

## 2.4 JSP 프로그램의 특징

# 3장 개발 환경 설정하기

## 3.1 JDK 설치하기

## 3.2 JDK 환경 변수 설정하기

## 3.3 톰캣 컨테이너 설치하기

## 3.4 이클립스 IDE 설치하기

## 3.5 Java EE API 문서 즐겨찾기에 추가하기

## 3.6 비주얼 스튜디오 코드 설치하기

## 3.7 Oracle DBMS 설치하기

## 3.8 SQL Developer 설치하기

## 3.9 exERD 설치하기

# 4장 웹 애플리케이션 이해하기

## 4.1 웹 애플리케이션

## 4.2 웹 애플리케이션의 기본 구조

## 4.3 컨테이너에서 웹 애플리케이션 실행하기

- Tomcat 9 다운로드 및 설치
    
    https://tomcat.apache.org/download-90.cgi
    
    - Winodws
        - Installer 파일 다운로드 및 설치
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/296e1573-8b5f-434b-adae-248638e41d60/image.png)
            
            - 설치 경로 : `./java/tomcat9`
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/f83c9eab-ed47-49e2-a241-05a6408ab6c5/image.png)
                
        - 브라우저 주소에 [http://localhost:8080/](http://localhost:8090/) 입력하고 이동 실패할 것임 (해결 방법은 아래 스탭 참고)
            - `Tomcat9w.exe` 실행
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/a94db172-7ce2-4712-9a44-972fdb337357/image.png)
                
            - 우선 Service Status를 Stopped로 수정
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/9ffd20bc-057f-4fbc-8f3f-a942f54a72b6/image.png)
                
            - conf 폴더의 `server.xml`를 VSCode로 열기
                - 8080 포트가 작동 안되기 때문에 포트 번호를 다른 번호로 바꾸려고 함
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/ee861fbf-b2c7-44eb-bbb8-66462a24e19c/image.png)
                
            - 71 행의 port 번호를 ‘8090’으로 수정하고 저장
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/30b32057-8b17-48c9-b120-c9ea3b8aff4c/image.png)
                
            - 그 다음에 브라우저 주소에 http://localhost:8090/ 입력하고 다음과 같이 나오면 성공
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/7f529990-3f30-44f8-bc24-58d06016dff5/image.png)
                
            - Win + R → service.msc → Apach Tomat 9.0 Tomcat9 를 통해서도 상태 확인 가능
                
                ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/df117696-46c9-4c09-b2d1-401a5bad1d3d/image.png)
                
    - MacOS
        - [tar.gz](https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz) ([pgp](https://downloads.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz.asc), [sha512](https://downloads.apache.org/tomcat/tomcat-9/v9.0.97/bin/apache-tomcat-9.0.97.tar.gz.sha512))
        - https://gist.github.com/emadpres/a17c310b9be8c41dc632b5b699af2e1c
        - https://earth-95.tistory.com/90

- Eclipse 설치
    - Servers → (서버 없는 경우) 파란색 문구 클릭해서 서버 추가
        - `Tomcat v9.0 Server` 선택 → `Next`
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/2666864a-7089-497b-ad92-f5148c91327f/image.png)
            
        - 폴더 경로 확인 →  `Finish`
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/32f3aa21-9ef7-45c1-808b-e85622746c00/image.png)
            
    - Dynamic Web Project 생성
        
        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/f70bf035-775e-4f85-a7e2-d1276644391f/image.png)
        
        - Project name : `test` → `Next`
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/f79fb8a6-20cb-481b-8393-77e5b7d42c6b/image.png)
            
        - Finish
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/ad35ce3e-9691-411e-803e-97336f6957b0/image.png)
            
        - Project Explorer 에서 `test` 폴더 생성 여부 확인
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/ffe7df89-9de8-4306-8f21-b423b09c817a/image.png)
            
    - index.jsp 파일 생성
        
        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/747c0838-94b9-405a-a75c-4a84c73fc1fe/image.png)
        
        - 생성한 index.jsp 파일에서  body 부분에 텍스트 입력
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/2f1ed719-256c-4b1f-a865-01b6e7ccbadd/image.png)
            
    - Servers 문구 부분에 우측 마우스로 클릭 → `Add and Remove`
        
        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/915da49a-507b-4762-8e6b-ba791ac31243/image.png)
        
        - 다음과 같이 `test` 클릭하고 `Add` 버튼 클릭 → `Finish`
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/9fb24c59-a884-4c7f-9ab1-8230bb75f642/image.png)
            
    - Servers 문구 부분에 우측 마우스로 클릭 → `Start` ( 안 될 것임, 해결 방법은 아래 참고)
        
        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/b45ab68f-fa30-4376-8135-83f46f55750f/image.png)
        
        - Servers 문구 부분 더블 클릭 → 오른쪽 `Port Name`에  Tomcat admin port에 해당한 `Port Number` 원래는 비어있을 것임 → `8091`(임의)로 설정 → Ctrl + S 로 저장
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/0f21e24a-2a3c-4edc-b2f1-8ac9d32e202c/image.png)
            
        - 다시 Servers 문구 부분 클릭하고 Console 창에서 확인해보면 아래와 같이 뜰 것임
            
            ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/c12f1661-7d14-45e8-b455-7e7e7664721e/image.png)
            
        
    - Preferences → `CSS Files`, `HTML Files`, `JSP Files` 의 `Encoding`을 `UTF-8`로 바꿈 → 새 JSP 파일 생성해서 charset이 UTF-8 맞는 지 확인
        
        ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/c19326e2-af9e-4728-9ef4-9275974a52e8/image.png)
        

## 4.4 이클립스에서 웹 애플리케이션 실습하기

## 4.5 웹 애플리케이션 서비스하기

# ⭐5장 서블릿 이해하기

https://velog.io/@daram9/%EC%84%9C%EB%B8%94%EB%A6%BFservlet#%EC%84%9C%EB%B8%94%EB%A6%BF-%EB%8F%99%EC%9E%91-%EA%B3%BC%EC%A0%95-1

https://velog.io/@falling_star3/Tomcat-%EC%84%9C%EB%B8%94%EB%A6%BFServlet%EC%9D%B4%EB%9E%80

## 5.1 서블릿이란?

### 서블릿 동작 과정

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/6cdcdcd9-c2a3-4f5a-869c-afcb32ec46df/image.png)

- 클라이언트가 웹 서버에 요청하면 웹 서버는 그 요청을 톰캣과 웹 애플리케이션 서버 (WAS)에 위임함
- 그러면 WAS는 각 요청에 해당하는 서블릿을 실행함
- 그리고 서블릿은 요청에 대한 기능을 수행한 후 결과를 반환하여 클라이언트에 전송함

### 서블릿 특징

- 서버 쪽에서 실행되면서 기능을 수행함 → HTML, CSS, JS는 브라우저에서 실행됨
- 기존의 정적 웹 프로그램의 문제점을 보완하여 동적인 여러 가지 기능을 제공
- 스레드 방식으로 실행됨
- 컨테이너에서 실행됨
- 자바로 만들어져 자바의 특징(객체 지향)을 가짐
- 컨테이너에서 실행되며, 컨테이너 종류(Windows, Linux)에 상관없이 실행됨
- 보안 기능을 적용하기 쉬움
- 웹 브라우저에서 요청 시 기능을 수행함

## 5.2 서블릿 API 계층 구조와 기능

> 여기서 API 는 → 자바 라이브러리
> 

### 서블릿 클래스 계층 구조

- 서블릿은 자바로 만들어져 클래스들 간의 계층 구조를 가짐
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/72d262ef-2ac4-4031-bd5e-800058e199bd/image.png)
    
- 서블릿 API는 Servlet과 ServletConfig 인터페이스를 구현해 제공하며 GenericServlet 추상 클래스가 이 두 인터페이스의 추상 메서드를 구현함
- 그리고 이 GenericServlet을 다시 HttpSerblet이 상속받음

### 서블릿 API 기능

- HttpServlet은 이름에서 알 수 있듯이 HTTP 프로토콜을 사용하는 서블릿 기능을 구현하는 클래스임
- 바로 이 HttpServlet을 상속받아 HTTP 프로토콜로 동작하는 웹 브라우저의 요청을 처리하는 서블릿이 바로 이책에서 만들어 사용할 서블릿임
    
    
    | **서블릿 구성 요소** | **기능** |
    | --- | --- |
    | Servlet 인터페이스 | - javax.servlet 패키지에 선언되어 사용함
    - Servlet 관련 **추상 메서드**를 선언하여 사용함
    - init(), service(), destroy(), getServletInfo(), getServletConfig()를 선언하여 사용함 |
    | ServletConfig 인터페이스 | - java.servlet 패키지에 선언되어 사용함
    - Servlet 기능 관련 **추상 메서드**를 선언하여 사용함
    - getInitParameter(), getInitParameterNames(), getServletContext(), getServletName()을 선언하여 사용함 |
    | GenericServlet 클래스 | - javax.servlet 패키지에 선언되어 사용함
    - 상위 두 인터페이스를 구현하여 일반적인 서블릿 기능을 구현한 클래스임
    - GenericServlet을 상속받아 구현한 사용자 서블릿은 사용되는 프로토콜에 따라 각각 service()를 **오버라이딩(재정의)**하여 사용함 |
    | HttpServlet 클래스 | - javax.servlet.http 패키지에 선언되어 사용함
    - **GenericServlet을 상속받아** HTTP 프로토콜을 사용하는 웹 브라우저에서 서블릿 기능을 수행함
    - 웹 브라우저 기반 서비스를 제공하는 서블릿을 만들 때 상속받아 사용함
    - 요청 시 service()가 호출되면서 요청 방식에 따라 doGet()이나 doPost()가 차례대로 호출됨 |
- HttpServlet의 주요 메소드와 기능
    - 클라이언트 요청 시 `public service()` 메소드를 먼저 호출한 후 다시 `protected service()` 메소드를 호출함
    - 그런 다음 다시 request 종류에 다라 doXXX() 메소드를 호출하는 과정으로 실행됨
    
    | **메소드** | **기능** |
    | --- | --- |
    | doGet() | HTTP GET 요청을 처리하는 메소드로, 클라이언트의 요청에 대한 응답을 생성함 |
    | doPost() | HTTP POST 요청을 처리하는 메소드로, 클라이언트가 서버에 데이터를 전송할 때 사용됨 |
    | doPut() | HTTP PUT 요청을 처리하는 메소드로, 클라이언트가 서버의 자원을 업데이트할 때 사용됨 |
    | doDelete() | HTTP DELETE 요청을 처리하는 메소드로, 클라이언트가 서버의 자원을 삭제할 때 사용됨 |
    | doHead() | HTTP HEAD 요청을 처리하는 메소드로, 응답 본문 없이 헤더 정보만을 반환함 |

## 5.3 서블릿의 생명주기 메서드

- **서블릿 생명주기 메소드**란 서블릿 실행 단계마다 호출되어 기능을 수행하는 콜백 메소드임
- 생명주기 메소드 기능
    - `init()`, `destroy()` 기능은 생략 가능
    - `do`로 시작하는 메소드는 서블릿의 핵심 기능을 처리하므로 반드시 구현
    
    | **생명주기 단계** | **호출 메서드** | **특징** |
    | --- | --- | --- |
    | 초기화 | init() | - 서블릿 요청 시 **맨 처음 한 번만 호출됨**
    - 서블릿 생성 시 **초기화 작업**을 주로 수행함 |
    | 작업 수행 | doGet(), 
    doPost() | - 서블릿 **요청 시 매번 호출됨**
    - 실제로 클라이언트가 요청하는 작업을 수행함 |
    | 종료 | destroy() | - 서블릿이 기능을 수행하고 **메모리에서 소멸될 때 호출됨**
    - 서블릿의 마무리 작업을 주로 수행함 |

## ⭐5.4 FirstServlet을 이용한 실습

### 이클립스에서 서블릿을 만들고 실행하는 과정

1. 새 프로젝트(`Dynamic Web Project`) 생성
    - Target runtime → Tomcat9
    - `web.xml` 생성 옵션 체크
2. 톰캣에 새 프로젝트 등록하기 (`Add and Remove`)
3. 사용자 정의 서블릿 클래스 만들기
4. 서블릿 생명주지 메소드 구현
5. 서블릿 매핑 작업
6. 웹 브라우저에서 서블릿 매핑 이름으로 요청하기

### 예제 코드 1 : 단 하나의 서블릿 매핑

- 서블릿 생성 → `FirstServlet.java`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import javax.servlet.ServletConfig;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    @WebServlet("/first")
    public class FirstServlet extends HttpServlet {  // HttpServlet 를 상속 받기
    
    	private static final long serialVersionUID = 1L;
    
    	@Override
    	public void init(ServletConfig config) throws ServletException {
    		System.out.println("init 메소드 호출");
    	}
    
    	@Override
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		System.out.println("doGet 메소드 호출");
    	}
    
    	@Override
    	public void destroy() {
    		System.out.println("destroy 메소드 호출");
    	}
    
    }
    ```
    

- ⭐**서블릿 매핑**
    - 방법 1 : 각 프로젝트에 있는 `web.xml`에서 설정
        - <servlet> 태그와 <servlet-mapping> 태그 이용
        
        ```html
        <servlet>
        	<servlet-name>aaa</servlet-name>
        	<servlet-class>sec01.ex01.FirstServlet</servlet-class>
        </servlet>
        
        <servlet-mapping>
        	<servlet-name>aaa</servlet-name>
        	<url-pattern>/first</url-pattern>
        </servlet-mapping>
        ```
        
    - 방법 2 : 어노테이션(annotation) 방법 → `@WebServlet("")`
        
        ```java
        @WebServlet("/first")
        public class FirstServlet extends HttpServlet {}
        ```
        
    - 웹 브라우저에서 서블릿 요청
        - `http://IP주소:포트번호/프로젝트이름(컨텍스트이름)/서블릿매핑이름`
            - `http://127.0.0.1:8080/pro05/first`
        - 톰캣이 로컬 PC에 설치된 경우에는 다음과 같이 입력해도 됨
            - `http://localhost:8080/pro05/first`

### 예제 코드 2 : 다수의 서블릿 매핑

- 일반적인 웹 애플리케이션은 각 기능에 대한 서블릿을 다로 만들어서 서비스를 제송함
- 즉 프로젝트에서 여러 개의 서블릿을 만들어 사용함
- `SecondServlet.java`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/second")
    public class SecondServlet extends HttpServlet {
    	@Override
    	public void init() throws ServletException {
    		System.out.println("init 메소드 호출>>>");
    	}
    	
    	@Override
    	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		System.out.println("doGet 메소드 호출>>>");
    	}
    	
    	@Override
    	public void destroy() {
    		System.out.println("destroy 메소드 호출>>>");
    	}
    }
    
    ```
    
- `web.xml`
    - <servlet> 태그끼리 위치시킴, <servlet-mapping> 태그끼리 위치시킴
    
    ```html
    <servlet>
    	<servlet-name>aaa</servlet-name>
    	<servlet-class>sec01.ex01.FirstServlet</servlet-class>
    </servlet>
    <servlet>
    	<servlet-name>bbb</servlet-name>
    	<servlet-class>sec01.ex01.SecondServlet</servlet-class>
    </servlet>
    
    <servlet-mapping>
    	<servlet-name>aaa</servlet-name>
    	<url-pattern>/first</url-pattern>
    </servlet-mapping>
    <servlet-mapping>
    	<servlet-name>bbb</servlet-name>
    	<url-pattern>/seocnd</url-pattern>
    </servlet-mapping>
    ```
    

## 5.5 서블릿 동작 과정

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/9a74e7de-9a71-4012-8c35-87b0ac35ce53/image.png)

- **스레드 방식**으로 동작하므로 최초 요청 시에만 init()메소드를 호출
    
    → 동일한 작업의 경우 서블릿은 메모리에 존재하는 서블릿을 재사용함으로써 훨씬 빠르고 효율적임
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/0291292f-c958-47f2-868d-8c712a7ca3f6/image.png)
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/06d2b474-32b8-4314-975e-29e73fe3c76a/image.png)
    

## 5.6 애너테이션을 이용한 서블릿 매핑

# ⭐6장 서블릿 기초

https://gptjs409.github.io/java/2019/10/24/servlet-basic1.html

https://gptjs409.github.io/java/2019/10/24/servlet-basic2.html

### Extra : form submit 동작 과정

- 폼 제출(form submit)은 웹 애플리케이션에서 사용자 입력을 서버로 전송하는 과정임
    - 폼 생성
        - HTML 문서에 <form> 태그를 사용하여 사용자 입력을 받을 수 있는 폼을 생성합니다. 이 폼은 다양한 입력 요소(예: 텍스트 박스, 체크박스, 라디오 버튼 등)를 포함할 수 있습니다.
    - 사용자 입력
        - 사용자는 폼에 필요한 정보를 입력합니다.
    - 제출 버튼 클릭
        - 사용자가 폼 제출 버튼(예: <input type="submit"> 또는 <button>)을 클릭하면, 폼 데이터가 서버로 전송됩니다.
    - HTTP 요청 생성
        - 폼의 action 속성에 지정된 URL로 HTTP 요청이 생성됩니다. method 속성에 따라 GET 또는 POST 방식으로 요청이 이루어집니다.
            
            > GET: 폼 데이터가 URL의 쿼리 문자열로 추가되어 전송됨 (예: [example.com/form?name=value](http://example.com/form?name=value))
            > 
            > 
            > POST: 폼 데이터가 HTTP 요청 본문에 포함되어 전송됨.
            > 
    - 서버 처리
        - 서버는 수신한 요청을 처리하기 위해 서블릿이나 다른 서버 측 기술을 사용합니다. 이때 서버는 요청 데이터를 파싱하고, 필요한 비즈니스 로직을 수행합니다.
    - 응답 생성
        - 서버는 요청 처리 결과를 바탕으로 HTTP 응답을 생성합니다. 이 응답은 HTML 페이지, JSON 데이터, 파일 다운로드 등 다양한 형태일 수 있습니다.
    - 브라우저 업데이트
        - 클라이언트(브라우저)는 서버로부터 받은 응답을 처리하고, 사용자의 화면을 업데이트합니다.
        - 예를 들어, 새로운 페이지를 로드하거나, 결과 메시지를 표시할 수 있습니다.
        - 이 과정을 통해 사용자가 입력한 데이터가 서버로 전송되고, 서버의 처리를 통해 적절한 응답이 반환됩니다.

## 6.1 서블릿의 세 가지 기본 기능

### 서블릿 기본 기능 수행 과정

- 클라이언트로부터 요청을 받음
- 데이터베이스 연동과 같은 비즈니스 로직을 처리
- 처리된 결과를 클라이언트에 돌려줌

### **서블릿 응답과 요청 수행 API 기능**

- 요청이나 응답과 관련된 API는 모두 javax.servlet.http 패키지에 있음
    - 요청 관련 API : javax.servlet.http.HttpServletRequest 클래스
    - 응답 관련 API : javax.servlet.http.HttpSErvletResponse 클래스
- 서블릿의 doGet()이나 doPost()메서드의 매개변수로 사용되는 예
    - doGet(HttpServletRequest request, HttpServletResponse response)
    - doPost(HttpServletRequest request, HttpServletResponse response)
- 세 가지 주요 기능에는 이렇게 동작
    - 클라이언트로부터 **톰캣 컨테이너**가 요청을 받음
    - **사용자의 요청이나 응답에 대한 HttpServletRequest 객체와 HttpServletResponse 객체를 만듦**
    - **서블릿의 doGet()이나 doPost() 메서드를 호출하며 만든 객체들을 전달**
    - **서블릿은** 데이터베이스 연동과 같은 비즈니스 로직을 처리
    - 처리된 결과를 클라이언트에 돌려줌

### HttpServletRequest의 여러 가지 주요 메서드

| **반환형** | **메서드명** | **기능** |
| --- | --- | --- |
| **boolean** | **authenticate(HttpServletResponse response)** | 현재 요청한 사용자가 ServletContext 객체에 대한 인증을 하기 위한 컨테이너 로그인 메커니즘 사용 |
| **String** | **changeSessionId()** | 현재 요청과 연관된 현재 세션의 id를 변경하여 새 세션 id를 반환 |
| **String** | **getContextPath()** | 요청한 컨텍스트를 가리키는 URI를 반환 |
| **Cookie[]** | **getCookies()** | 클라이언트가 현재의 요청과 함께 보낸 쿠키 객체들에 대한 배열을 반환 |
| **String** | **getHeader(String name)** | 특정 요청에 대한 헤더 정보를 문자열로 반환 |
| **Enumeration<String>** | **getHeaderNames()** | 현재의 요청에 포함된 헤더의 name 속성을 enumeration 으로 반환 |
| **String** | **getMethod()** | 현재 요청이 GET, POST 또는 PUT 방식 중 어떤 HTTP 요청인지를 반환 |
| **String** | **getRequestURI()** | 요청한 URL의 컨텍스트 이름과 파일 경로까지 반환 |
| **String** | **getServletPath()** | 요청한 URL에서 서블릿이나 JSP 이름을 반환 |
| **HttpSession** | **getSession()** | 현재의 요청과 연관된 세션을 반환, 세션이 없다면 새로 만들어서 반환 |

### HttpServletResponse의 여러 가지 주요 메서드

| **반환형** | **메서드명** | **기능** |
| --- | --- | --- |
| **void** | **addCookie(Cookie cookie)** | 응답에 쿠키를 추가 |
| **void** | **addHeader(String name, String value)** | name과 value를 헤더에 추가 |
| **String** | **encodeURL(String url)** | 클라이언트가 쿠키를 지원하지 않을 때 세션 id를 포함한 특정 URL을 인코딩 |
| **Collection<String>** | **getHeaderNames()** | 현재 응답이 헤더에 포함된 name을 얻어옴 |
| **void** | **sendRedirect(String location)** | 클라이언트에게 리다이렉트(redirect) 응답을 보낸 후 특정 URL로 다시 요청하게 함 |
| PrintWriter | getWriter() |  |

## 6.2 [form] 태그 이용해 서블릿에 요청하기

### Extra : <form>, <input>, <label>

```html
<form action="http://validator.w3.org/check" method="get">
  <label for="uri">URL 주소 입력</label>
  <input id="uri" type="text" name="uri" />
  <input type="submit" value="전송" />
</form>
```

- <form>
    - action : 이 폼을 전송할 URL 지정
    - method : 폼에 전송할 방식을 지정
        - GET : URL로 값을 받는 방식(쿼리스트링)
        - POST : 서버에 값을 URL이 아닌 body에 숨겨서 보내는 방식
    - autocomplete : 폼 내부 요소의 자동 완성 기능을 사용할지 안할지 결정
    - accept-charset : 폼 전송시 인코딩 방식을 명시함(utf-8, euc-kr 등)
    - enctype : 인코딩 방법 지정, 어떤 문자를 인코딩할 지 등을 결정
    - 서버에 데이터를 보내는 양식이면 꼭 form 요소를 이용하는 것이 좋음
        - 자바스크립트를 이용해도 되지만 접근성을 떨어뜨림
        - 서버에 데이터를 보내지 않는다면 굳이 form안에 사용하지 않아도 됨
- <input>
    - 스스로 닫는 태그, 마지막을 /로 닫아줘야 함
    - type : 인풋의 형태 타입 결정
        - 속성에 따라 텍스트 입력 뿐만 아니라 전송 버튼, 라디오 버튼, 체크 박스 등 여러가지로 표현 될 수 있음
        - text : 텍스트
        - submit : 해당 폼 안에 있는 값들이 해당 서버로 전송 됨
    - value : 기본 요소의 할당 값
        - 텍스트 - 기본으로 적힌 텍스트 값
        - 버튼 - 버튼에 표시되는 테스트
        - submit - value가 없으면 해당 브라우저의 기본 텍스트로 보여짐 (크롬>제출, 파이어폭스>질의보내기, IE>쿼리전송)
    - name : 데이터가 서버로 전송될 때 할당되는 변수의 이름
        - 해당 변수로 value 값이 전송(name=”send” value=”전송” → “send=전송”)
- <label>
    - 해당 폼 요소에 어떤 값을 넣어야 하는지 라벨을 붙여주는 요소
    - 웹 접근성 기준 상, 폼 입력 요소가 있다면 이에 해당하는 label 요소를 반드시 가지고 있어야 함
    - for 속성에 해당하는 폼 요소의 id 입력을 연결해서 연결
        - <label for=”id:>아이디 입력</label>
        - 잘 매칭이 된다면 마우스로 label 클릭시 폼 입력 요소로 자동 포커싱
    - id값이 없다면 폼 요소를 label 안에 넣어서 표현할 수 있음
        - <label>아이디 입력<input type=”text” /></label>
        - 국내 스크린 리더 프로그램에서 지원하지 않을 수도 있음
        - id와 for 속성을 매칭시켜주는 것이 좋음

### **<form> 태그로 서블릿에 요청하는 과정**

- JSP, ASP, PHP가 나오기 전에는 HTML, CSS, 자바스크립트를 이용해 웹 프로그램을 만들었음
- 서블릿과 JSP는 이러한 HTML, CSS, 자바스크립트 같은 기존의 것을 버리는 것이 아님
    - 기존의 것에 자신의 기능을 추가하여, 즉 서로 연동하여 동작
    - 사용자의 요청은 HTML의 <form> 태그나 자바스크립트로부터 전송받아서 처리
- 여러가지 폼 태그 요소들을 이용하여 입력 서식에 입력 후 전송하면 사용자가 입력한 데이터가 서블릿으로 전송
    - 서블릿은 여러 가지 메서드를 이용해서 전송된 데이터를 받아옴

### <form>태그의 여러가지 속성

![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/43aefce4-46cf-4401-91cf-ab03a36753c3/image.png)

```html
<form name="/frmLogin" method="get" action="login" encType-"UTF-8">
  아이디 :<input type="text" name="user_id"><br>
  비밀번호 :<input type="password" name="user_pw"><br>
  <input type="submit" value="로그인"> <input type="reset" value="다시입력">
</form>
```

- 프로세스
    - 사용자가 자신의 ID와 비밀번호를 입력한 후 로그인을 클릭
    - <form> 태그의 action 속성은 데이터를 전송할 서블릿이나 JSP의 이름을 지정
    - 지정된 이름이 login인 서블릿으로 ID와 비밀번호가 전송
- 로그인을 클릭했을 때 실제로 데이터가 전송되는 과정
    - ❗실제 데이터는 각 <input> 태그의 name 속성 값과 쌍으로 전송
    - 예) user_id=(값), user_pw=(값)
- <form> 태그와 관련된 여러가지 속성
    
    
    | **속성** | **기능** |
    | --- | --- |
    | **name** | - <form> 태그의 이름을 지정- 여러 개의 form이 존재하는 경우 구분하는 역할- 자바 스크립트에서 <form> 태그에 접근할 때 자주 사용 |
    | **method** | - <form> 태그 안에서 데이터를 전송할 때 전송 방법을 지정- GET 또는 POST로 지정(미지정시 GET) |
    | **action** | - <form> 태그에서 데이터를 전송할 서블릿이나 JSP를 지정- 서블릿으로 전송할 때는 매핑 이름을 사용 |
    | **encType** | - <form> 태그에서 전송할 데이터의 encoding 타입을 지정- 파일을 업로드할 때는 multipart/form-data로 지정 |

## 6.3 서블릿에서 클라이언트의 요청을 얻는 방법 (실습)

- HttpServletRequest 클래스에서  <form>태그로 전송된 데이터를 받아오는 메소드
    
    
    | 리턴 타입 | 메소드 | 설명 |
    | --- | --- | --- |
    | String | getParameter() | 특정 파라미터의 값을 문자열로 반환하는 메소드로, GET 또는 POST 방식 모두 사용 가능 |
    | String[] | getParameterValues() | 특정 파라미터의 여러 값을 배열로 반환하는 메소드로, 동일한 이름의 파라미터가 여러 개일 때 사용함 |
    | Enumeration | getParameterNames() | 모든 파라미터 이름을 Enumeration 형태로 반환하는 메소드로, 요청에 포함된 모든 파라미터를 나열함 |

### HttpServletRequest로 요청 처리 실습

<aside>
💡

name 태그

서버는 클라이언트로부터 전송된 데이터를 받을 때 이 name 속성을 기준으로 해당 값을 추출합

</aside>

- 실제 이클립스에서 <form> 태그로 전송된 정보를 서블릿에서 받아 와서 출력함
- 로그인창에서 ID와 비밀번호를 입력 받아 HttpServletRequest로 처리함
- `login.html`
    - WebContent 폴더 하위에 다음과 같이 사용자 정보를 입력 받을 `login.html`을 생성함
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    </head>
    <body>
    	<form name="frmLogin"  method="get"  action="login" enctype="UTF-8"> 
    	<!--action : 입력된 데이터를 서블릿 매핑 이름이 login인 서블릿으로 전송함 -->
    		아이디 : <input type="text" name="user_id"><br>
    		<!-- name : 텍스트 박스에 입력된 ID를 user_id로 전송함-->
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type="submit"  value="로그인">
    		<input type="reset"  value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
    [2024-11-15 11 40 19.mp4](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/16692958-dc06-4fb2-949e-624ba2b2584b/2024-11-15_11_40_19.mp4)
    
- `LoginServlet.java`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet
     */
    @WebServlet("/login")
    public class LoginServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    	
      // 웹 브라우저에서 전송한 정보를 톰캣 컨테이너가 HttpServletRequest 객체를 생성한 후 doGet()으로 넘겨줌     
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		// 전송된 데이터를 UTF-8로 인코딩함
    		request.setCharacterEncoding("utf-8");
    		// getParameter()를 이용해 <input> 태그의 name 속성 값으로 전송된 value를 받아옴
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		System.out.println("아이디 : " + user_id);
    		System.out.println("비밀번호: " + user_pw);
    		// 입력을 안 하면 그녕 빈 문자열 반환 ""
    		// 하지만 getParameter의 value 명이 print할 때 지정한 변수명(user_pw)과 일치하지 않으면 null을 반환할 것임
    	}
    
    }
    ```
    

### 여러 개의 값을 전송할 때의 요청 처리 getParameterValues() & 
getParameterNames() 메소드를 이용한 요청 처리

- `login.html`
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    </head>
    <body>
    	<form name="frmLogin"  method="get"  action="login" enctype="UTF-8">
    		아이디 : <input type="text" name="user_id"><br>
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<!--name 속성이 모두 subject로 같음-->
    		<input type="checkbox"  name="subject" value="java" checked> 자바
    		<input type="checkbox"  name="subject" value="C언어" checked> C언어
    		<input type="checkbox"  name="subject" value="JSP" checked> JSP
    		<input type="checkbox"  name="subject" value="안드로이드" checked> 안드로이드 <br>
    		<input type="submit"  value="로그인"> 
    		<input type="reset"  value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/d4079e48-de98-496b-9747-8b6b00155787/image.png)
    
- `LoginServlet.java`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import java.util.Enumeration;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/login")
    public class LoginServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8");
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		System.out.println("아이디 : " + user_id); // 입력을 안 하면 그냥 빈 문자열 반환 ""
    		System.out.println("비밀번호: " + user_pw);
    		
    		String[] subject = request.getParameterValues("subject");
    		for (String str : subject) {
    			System.out.println("선택한 과목 : " + str);
    		}
    
    		// getParameterNames() 메소드를 이용한 요청 처리
    		Enumeration<String> enu = request.getParameterNames();
    		while (enu.hasMoreElements()) {
    			String name = enu.nextElement();
    			String[] values = request.getParameterValues(name);
    			for (String value : values) {
    				System.out.println("name=" + name + " , value=" + value);
    			}
    		}
    
    	}
    
    }
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/858f8f90-782c-4085-8877-8e9a86c713a4/image.png)
    

## 6.4 서블릿의 응답 처리 방법 (실습)

### 서블릿에서 응답을 처리하는 방법

- `doGet()`이나 `doPost()` 메서드 안에서 처리
- `javax.servlet.http.HttpServletResponse` 객체 이용
- `setContentType()`을 이용해 클라이언트에게 전송할 데이터 종류(MIME-TYPE) 지정
- 클라이언트(웹브라우저)와 서블릿의 통신은 자바 I/O의 스트림 이용

### MIME-TYPE

- Client ↔ Servlet 네트워크를 통해 서로 데이터를 주고 받음
    - 자바 I/O 스트림 클래스의 입출력 기능을 이용하면 쉽게 웹 어플리케이션의 네트워크 기능을 구현할 수 있음
- Servlet → Client 때는 어떤 종류의 데이터를 전송하는지 웹 브라우저에게 알려줘야 함
    - 웹 브라우저가 전송 받을 데이터의 종류를 미리 알고 있으면 더 빠르게 처리할 수 있음
    - 톰캣 컨테이너에서 미리 설정해놓은 데이터 종류들을 MIME-TYPE(마임 타입)이라 함
    
    > Multipurpose Internet Mail Extensions : 다목적 인터넷 메일 확장(전자 우편의 데이터 형식을 정의한 표준 포맷)
    > 
- 자바(서블릿)에서 자바 I/O의 스트림 클래스를 이용하여 웹 브라우저로 데이터를 전송할 때는 MIME-TYPE을 설정해서 전송할 데이터의 종류를 지정
- MIME_TYPE으로 지정하는 예
    - HTML 전송 : `text/html`
    - 일반 텍스트 전송 : `text/plain`
    - XML 데이터 전송 : `application/xml`
- 웹 브라우저는 기본적으로 HTML만 인식
    - 서블릿에서는 대부분 `text/html`을 사용
- 그 외 톰캣 컨테이너는 자주 사용하는 데이터 종류를 MIME-TYPE으로 지정
    - 종류를 지정 후 사용하면 됨
    - 새로운 종류의 데이터를 지정하고 싶으면 `CATALINA_HOME\conf\web.xml`에 추가

### HttpServletResponse를 이용한 서블릿 응답 실습

- 서블릿이 응답하는 예제
    - 사용자가 입력한 ID와 비밀번호를 전송하면 서블릿이 다시 브라우저에게 응답하는 예제
- 서블릿이 클라이언트(웹 브라우저)에 응답하는 과정
    - `setContentType()`을 이용해 MIME-TYPE을 지정
    - 데이터를 출력할 `printWriter` 객체를 생성
    - `PrintWriter`의 print()나 println()을 이용해 데이터를 출력
- `login.html`
    - `login.html` 복사 후 `action`만 `login2`로 변경
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    </head>
    <body>
    	<form name="frmLogin"  method="get"  action="login2" enctype="UTF-8">
    		아이디 : <input type="text" name="user_id"><br>
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type="checkbox"  name="subject" value="java" checked> 자바
    		<input type="checkbox"  name="subject" value="C언어" checked> C언어
    		<input type="checkbox"  name="subject" value="JSP" checked> JSP
    		<input type="checkbox"  name="subject" value="안드로이드" checked> 안드로이드 <br>
    		<input type="submit"  value="로그인"> 
    		<input type="reset"  value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/7849ae8a-3987-4143-a21e-a84922026c51/image.png)
    
- `LoginServlet2`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet
     */
    @WebServlet("/login2")
    public class LoginServlet2 extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		// 웹 브라우저에서 전송된 데이터의 인코딩 설정함
    		request.setCharacterEncoding("utf-8");
    		// setContenttype()을 이용해 응답할 데이터 종류가 HTML임을 설정함
    		response.setContentType("text/html; charset=utf-8");
    		// HttpServletResponse 객체의 getWrite()를 이용해 출력 스트림 PrintWriter 객체를 받아옴
    		PrintWriter out = response.getWriter();
    		
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		
    		String data = "<html>";
    			data += "<body>";
    			data += "아이디 : " + user_id;
    			data += "<br>";
    			data += "패스워드 : " + user_pw;
    			data += "</body>";
    			data += "</html>";
    		out.print(data); // 출력 -> 톰캑이 브라우저한테 전송 (응답)
    
    	}
    
    }
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/306801d9-1db2-4adf-9060-c1d2238f91f1/image.png)
    

### 서블릿을 이용한 환율 계산기 예제 실습

- `CalcServlet.java`
    - 최초 매핑명(/calc)으로 요청시 cammnd 값이 null이므로 if문 부분이 출력됨
    - 계산기에서 값을 입력해 요청할 경우 command 값이 calculate되 므로 전달된 원화를 이용해 외화로 변환된 결과 출력함
    
    ```java
    package pro06.sec02.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class CalcServlet
     */
    @WebServlet("/calc")
    public class CalcServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	private static final float USD_RATE = 1399.80F;
    	private static final float JPY_RATE = 895.21F;
    	private static final float CNY_RATE = 193.27F;
    	private static final float GBP_RATE = 1774.60F;
    	private static final float EUR_RATE = 1475.67F;
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    	 *      response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8");
    		response.setContentType("text/html;charset=utf-8");
    		PrintWriter pw = response.getWriter();
    
    		String command = request.getParameter("command");
    		String won = request.getParameter("won");
    		String operator = request.getParameter("operator");
    
    //		if (command != null && command.equals("calculate")) {
    		if ("calculate".equals(command)) { // 위 조건과 동일
    			String result = calculate(Float.parseFloat(won), operator);
    			pw.print("<html><font size=10>변환 결과</font><br>");
    			pw.print("<font size=10>" + result + "</font><br>");
    			pw.print("<a href='/pro06/calc'>환율 계산기</a></html>");
    //			pw.print("<a href='/pro06/calc?command=calculate&won=100&operator=en'>환율 계산기</a></html>"); // a tag로도 전송 가능
    			return;
    		}
    		
    		pw.print("<html>");
    		pw.print("<title>환율 계산기</title>");
    		pw.print("<font size=5>환율 계산기</font><br>");
    		// form 태그 이용하여 데이터 전송
    		pw.print("<form name='frmCalc' method='get' action='/pro06/calc'>"); // xml 문법에서 html태그 중에 닫는 태그가 없으면 마지막에 '/'을 써야 함(하지만 안 써도 됨)
    		pw.print("<input type='hidden' name='command' value='calculate'/>"); // hidden 태그를 이용해 계산기에서 서블릿으로 수행할 요청을 전달함
    		pw.print("원화 : <input type='text' name='won' size=10/>");
    		// select box 에서 선택된 값을 name으로 전송함
    		pw.print("<select name='operator'>"); 
    		pw.print("<option value='dollar'>달러</option>");
    		pw.print("<option value='en'>엔화</option>");
    		pw.print("<option value='wian'>위안</option>");
    		pw.print("<option value='pound'>파운드</option>");
    		pw.print("<option value='euro'>유로</option>");
    		pw.print("</select>");
    
    		pw.print("<input type='submit' value='변환'/>");
    		pw.print("</form>");
    		pw.print("</html>");
    		pw.close();
    	}
    	
    	// 원화를 선택한 외화로 환산함
    	private String calculate(float won, String operator) {
    		String result = null;
    		if ("dollar".equals(operator)) {
    			result = String.format("%.6f", won / USD_RATE);
    		} else if ("en".equals(operator)) {
    			result = String.format("%.6f", won / JPY_RATE);
    		} else if ("wian".equals(operator)) {
    			result = String.format("%.6f", won / CNY_RATE);
    		} else if ("pound".equals(operator)) {
    			result = String.format("%.6f", won / GBP_RATE);
    		} else if ("euro".equals(operator)) {
    			result = String.format("%.6f", won / EUR_RATE);
    		}
    		return result;
    	}
    }
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/32bf38be-6917-4c8a-9874-72f2b011eefd/image.png)
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/7b973eed-dddc-44f9-965d-b26d70c2c345/image.png)
    

## 6.5 웹 브라우저에서 서블릿으로 데이터 전송하기 (실습)

### GET/POST 전송 방식

- GET 방식
    - 서블릿에 데이터를 전송할 때 데이터가 URL 뒤에 name=value 형태로 전송
    - 여러 개의 데이터를 전송할 때 ‘&’로 구분해서 전송
    - 보안이 취약
    - 전송 최대 255자
    - 기본 전송방식, 사용이 쉬움
    - 웹 브라우저에서 직접 입력해서 전송 가능
    - 서블릿의 doGet()으로 처리
- POST 방식
    - 서블릿에 데이터를 전송할 때 TCP/IP 프로토콜 데이터의 HEAD 영역에 숨겨진 채 전송
    - 보안에 유리
    - 전송 데이터 용량 무제한
    - 전송시 서블릿에서 또 다시 가져오는 작업을 해야하므로 GET방식보다 처리속도가 느림
    - 서블릿의 doPost()로 처리

### GET 방식으로 서블릿에 요청

- HTML의 <form> 태그의 method 속성이 get
    - 서블릿에 GET 방식으로 데이터를 전송하겠다는 의미
    - `<form name="frmLogin" method="get" action="login" encType="UTF-8)">`
- `doGet()` 메서드
    - GET 방식으로 적용된 데이터를 처리
    
    ```java
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    	throws ServletException, IOException {}
    ```
    
- 브라우저 URL 뒤에 `‘name=value’`쌍
    - 어떤 데이터를 전송하는지 다 노출되므로 보안상으로 좋지 않음
    - `http://localhost:8090/pro06/calc?won=1&operator=dollar&command=calculate`

### POST 방식으로 서블릿에 요청

- `login3.html`
    - 데이터는 login.html과 동일, action을 login3으로, method는 post
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    </head>
    <body>
    	<form name="frmLogin"  method="post"  action="login3" enctype="UTF-8"> 
    	<!--action : 입력된 데이터를 서블릿 매핑 이름이 login인 서블릿으로 전송함 -->
    		아이디 : <input type="text" name="user_id"><br>
    		<!-- name : 텍스트 박스에 입력된 ID를 user_id로 전송함-->
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type="submit"  value="로그인">
    		<input type="reset"  value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/72e101d1-9934-4e55-9f1b-5f63ba4bf82a/image.png)
    
- `LoginServlet3.class`
    - mapping-`/login3`, init/doPost/destroy
    - POST는 TCP/IP헤더에 값이 숨겨진 채 전송되므로 URL 뒤에 아무것도 표시되지 않음
    - 서블릿에서는 웹 브라우저에서 전송되는 방식에 따라 doGet()이나 doPost() 메서드로 대응해서 처리해야 함
        - 만약 전송방식과 다른 메서드 사용시, 브라우저에서 오류가 발생
            
            > HTTP Status 405 - Method Not Allowed
            > 
    
    ```java
    package pro06.sec03.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet
     */
    @WebServlet("/login3")
    public class LoginServlet3 extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		
    		// 전송된 데이터를 UTF-8로 인코딩함
    		request.setCharacterEncoding("utf-8");
    		// getParameter()를 이용해 <input> 태그의 name 속성 값으로 전송된 value를 받아옴
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		System.out.println("아이디 : " + user_id);
    		System.out.println("비밀번호: " + user_pw);
    
    	}
    
    }
    
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/5f313c1e-6b3e-4c27-ae40-946f48ff8d9a/image.png)
    

## 6.6 GET 방식과 POST 방식 요청 동시에 처리하기 (실습)

### doHandle()을 호출해서 모든 기능을 구현하는 예제

- GET+POST 방식일 때, 두 기능을 각각 구분해서 구현하면 불편함
- 전송된 방식으로 doGet()이나 doPost()메서드로 처리 후 doHandle()을 호출하여 모든 기능을 구현하는 예제 실습
- `login4.html`
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    </head>
    <body>
    	<form name="frmLogin"  method="post"  action="login4" enctype="UTF-8"> 
    	<!--action : 입력된 데이터를 서블릿 매핑 이름이 login인 서블릿으로 전송함 -->
    		아이디 : <input type="text" name="user_id"><br>
    		<!-- name : 텍스트 박스에 입력된 ID를 user_id로 전송함-->
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type="submit"  value="로그인">
    		<input type="reset"  value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
- `LoginServlet4.java`
    
    ```java
    package sec03.ex02;
    
    import java.io.IOException;
    import javax.servlet.ServletConfig;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet4
     */
    @WebServlet("/login4")
    public class LoginServlet4 extends HttpServlet 
    {
    	private static final long serialVersionUID = 1L;
    
    	/**
    	 * @see Servlet#init(ServletConfig)
    	 */
    	public void init(ServletConfig config) throws ServletException 
    	{
    		System.out.println("init 메서드 호출. pro06.sec03.ex02.LoginServlet4.java");
    	}
    
    	/**
    	 * @see Servlet#destroy()
    	 */
    	public void destroy() 
    	{
    		System.out.println("init 메서드 호출. pro06.sec03.ex02.LoginServlet4.java");
    	}
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		System.out.println("doGet 메서드 호출. pro06.sec03.ex02.LoginServlet4.java");
    		doHandle(request, response);
    	}
    
    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		System.out.println("doPost 메서드 호출. pro06.sec03.ex02.LoginServlet4.java");
    		doHandle(request, response);
    	}
    
    	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    	{
    		request.setCharacterEncoding("utf-8");
    		String user_id = request.getParameter("user_id");
    		System.out.println("doHandle 메서드 호출. pro06.sec03.ex02.LoginServlet4.java");
    		String user_pw = request.getParameter("user_pw");
    		System.out.println("아이디 : " + user_id);
    		System.out.println("비밀번호 : " + user_pw);
    	}
    }
    ```
    
    - doGet()
        - 톰캣 재실행
        - 요청 : http://localhost:8090/pro06/login4.html
        - 요청 후 URL : http://localhost:8090/pro06/login4?user_id=sun&user_pw=sunny
        - 콘솔
            
            ```java
            init 메서드 호출. pro06.sec03.ex02.LoginServlet4.java
            doGet 메서드 호출. pro06.sec03.ex02.LoginServlet4.java
            doHandle 메서드 호출. pro06.sec03.ex02.LoginServlet4.java
            아이디 : sun
            비밀번호 : sunny
            ```
            
    - doPost()
        - login4.html method를 post로 변경
        - 요청 : http://localhost:8090/pro06/login4.html
        - 요청 후 URL : http://localhost:8090/pro06/login4
        - 콘솔 (초기화는 아까 되었기 때문에 X)
            
            ```java
            doPost 메서드 호출. pro06.sec03.ex02.LoginServlet4.java
            doHandle 메서드 호출. pro06.sec03.ex02.LoginServlet4.java
            아이디 : sun
            비밀번호 : sunny
            ```
            

## 6.7 자바스크립트로 서블릿에 요청하기 (실습)

- 자바스크립트로 서블릿에 요청하기
    - <form> : 바로 서블릿으로 전달
    - 자바스크립트 : 유효성 검사 등을 할 수 있음
- `login2.html`
    
    ```java
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script>
    function fn_validate() {
    	var frmLogin = document.frmLogin; // form 태그의 name 속성으로 <form> 태그 객체를 받아옴
    	var user_id = frmLogin.user_id.value; // form 태그 내 <input> 태그의 name 속성으로 입력한 ID와 비번을 받아옴
    	var user_pw = frmLogin.user_pw.value;
    	
    	if ((user_id.length == 0 || user_id == "") || (user_pw.length == 0 || user_pw == "")) {
    		alert('아이디와 비밀번호는 필수입니다.');
    		return false;
    	} else {
    		frmLogin.method = "post"; // <form> 태그의 전송 방식을 post로 설정함
    		frmLogin.action = "login5"; // action 속성을 서블릿 매핑 이름인 login5로 설정함
    		frmLogin.submit(); // 자바스크립트에서 서블릿으로 전송함
    	}
    }
    </script>
    </head>
    <body>
    
    <!-- 
    <form name="frmLogin"  method="post"  action="login2"  onsubmit="return fn_validate()">
    -->	
    	<form name="frmLogin"  method="post"  action="login2"  onsubmit="return false"> <!-- submit 자동 전송 막는 방법  -->
    		아이디 : <input type="text" name="user_id"><br>
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type='button'  onclick="fn_validate()" value="로그인">
    		<input type='reset'  value="다시 입력">
    		<input type="hidden"  name="user_address"  value="서울시 성북구"> <!-- <hidden> 태그를 이용해 화면에는 보이지 않게 하면서 값을 서블릿으로 전송함 -->
    	</form>
    </body>
    </html>
    ```
    
- `LoginServelet5.java`
    - http://localhost:8080/pro06/login5.html 브라우저로 호출
    - ID/PW 둘 중 하나라도 안 넣으면 `아이디와 비밀번호는 필수입니다`알림
    - 다 넣으면 웹 브라우저에서 ID/PW 출력, 주소는 Hidden 기본값으로 셋팅되 있던 게 출력됨
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet
     */
    @WebServlet("/login5")
    public class LoginServlet5 extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    	 *      response)
    	 */
    //	protected void doGet(HttpServletRequest request, HttpServletResponse response)
    //			throws ServletException, IOException {
    //		request.setCharacterEncoding("utf-8");  // 한글 처리하기 위한 인코딩 지정
    //		response.setContentType("text/html; charset=utf-8"); // MIME-TYPE 설정 (응답할 데이터 종류가 HTML임을 설정)
    //		
    //		String user_id = request.getParameter("user_id");
    //		String user_pw = request.getParameter("user_pw");
    //		String user_address = request.getParameter("user_address");
    //		PrintWriter out = response.getWriter();
    //		String data = "<html>";  // 사용자한테 응답할
    //		data += "<body>";
    //		data += "아이디 : " + user_id;
    //		data += "<br>";
    //		data += "패스워드 : " + user_pw;
    //		data += "<br>";
    //		data += "주소 : " + user_address;
    //		data += "</body>";
    //		data += "</html>";
    //		out.print(data); // 출력 -> 톰캑이 브라우저한테 전송 (응답)
    //		
    //	}
    	
    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    //		doGet(request, response);
    		
    		request.setCharacterEncoding("utf-8");  // 한글 처리하기 위한 인코딩 지정
    		response.setContentType("text/html; charset=utf-8"); // MIME-TYPE 설정 (응답할 데이터 종류가 HTML임을 설정)
    		PrintWriter out = response.getWriter();
    		
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		String user_address = request.getParameter("user_address");
    		
    		String data = "<html>";  // 사용자한테 응답할
    		data += "<body>";
    		data += "아이디 : " + user_id;
    		data += "<br>";
    		data += "패스워드 : " + user_pw;
    		data += "<br>";
    		data += "주소 : " + user_address;
    		data += "</body>";
    		data += "</html>";
    		out.print(data); // 출력 -> 톰캑이 브라우저한테 전송 (응답)
    	}
    
    }
    
    ```
    

## 6.8 서블릿을 이용한 여러 가지 실습 예제 (실습)

- 실습 전, WebContent 위치에 실습용 HTML파일을 따로 저장하는 test01 폴더를 만듦

### 실습 예제1 : 서블릿에 로그인 요청 시 유효성 검사하기 & 
실습 예제2 : 서블릿으로 로근인 요청 시 관리자 화면 나타내기

- 문제1 : ID를 정상적으로 입력했을 때는 로그인 메시지를 표시하고, ID를 입력하지 않았을 때는 다시 로그인하라는 메시지를 표시하도록 작성하시오.
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/4a30c2e8-3235-469b-9f07-f3c78ca497ef/image.png)
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/add92d20-2f5b-453a-9c93-ff4706fa923d/image.png)
    
- 문제2 : 실습 예제1을 이용해 로그인 시 admin ID로 로그인하면 회원 삭제 기능을 보여주도록 작성하시요.
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/2b1b672e-0397-4441-b3e4-7bd8607b0fc4/image.png)
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/1116d45d-9aae-49e8-a520-b75be43bfccb/image.png)
    
- `login.html`
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>로그인 창</title>
    </head>
    <body>
    	<!-- action에 서블릿을 지정할 때, test01에 위치한 HTML에서 요청하므로 프로젝트 이름을 붙여줘야 함(절대경로) -->
    	<form name="frmLogin"  method="post"  action="/pro06/loginTest" >
    		아이디 : <input type="text" name="user_id"><br>
    		비밀번호 : <input type="password" name="user_pw"><br>
    		<input type="submit"  value="로그인">
    		<input type="reset" value="다시 입력">
    	</form>
    </body>
    </html>
    ```
    
- `LoginTest.java`
    
    ```java
    package sec01.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class LoginServlet
     */
    @WebServlet("/loginTest")
    public class LoginTest extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    	 *      response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response)
    			throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 한글 처리하기 위한 인코딩 지정
    		response.setContentType("text/html; charset=utf-8"); // MIME-TYPE 설정 (응답할 데이터 종류가 HTML임을 설정)
    
    		String user_id = request.getParameter("user_id");
    		String user_pw = request.getParameter("user_pw");
    		PrintWriter out = response.getWriter();
    
    		if (user_id != null && user_id.length() != 0) {
    			
    			if ("admin".equals(user_id)) {
    				out.print("<html>");
    				out.print("<body>");
    				out.print("<font_size = '12'>관리자로 로그인 하셨습니다.</font><br>");
    				out.print("<input type='button' value='회원정보 수정하기'>");
    				out.print("<input type='button' value='회원정보 삭제하기'>");
    				out.print("</body>");
    				out.print("</html>");
    			} else {
    				out.print("<html>");
    				out.print("<body>");
    				out.print(user_id + " 님!! 로그인 하셨습니다.");
    				out.print("</body>");
    				out.print("</html>");
    			}
    			
    		} else {
    			out.print("<html>");
    			out.print("<body>");
    			out.print("아이디를 입력하세요!!!");
    			out.print("<br>");
    			out.print("<a href='http://localhost:8090/pro06/test01/login.html'>로그인 창으로 이동 </a>");
    			out.print("</body>");
    			out.print("</html>");
    		}
    
    	}
    
    }
    ```
    

### 실습 예제3 : 서블릿으로 요청 시 구구단 출력하기

- 문제 : 구구단 단수를 입력 받아 단수를 출력하시오. 배경색을 교대로 버꾸기.
- `gugu.html`
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>단수 입력창</title>
    </head>
    <body>
    	<h1>출력할 구구의 수를 지정해 주세요.</h1>
    	<form method="post" action="/pro06/guguTest">
    		출력할 구구단 : <input type="text" name="dan"><br>
    		<button type="submit">전송</button>
    	</form>
    </body>
    </html>
    ```
    
- `GuguTest.java`
    
    ```java
    package test01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/guguTest")
    public class GuguTest extends HttpServlet {
    	
    	public void init() {
    		System.out.println("init 메소드 출력");
    	}
    	
    	public void doPost(HttpServletRequest request, HttpServletResponse response) 
    			throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8");
    		response.setContentType("text/html;charset=utf-8");
    		PrintWriter out = response.getWriter();
    		
    		int dan = Integer.parseInt(request.getParameter("dan"));
    		out.print("<table border=1 width=800 align=center>");
    		out.print("<tr align=center bgcolor='#FFFF66'>");
    		out.print("<td colspan=2>" + dan + " 단 출력" + "</td></tr>");
    		
    		for (int i=1; i<10; i++) {
    			if (i%2 == 0) {
    				out.print("<tr align=center bgcolor='#ACFA58'>");				
    			} else {
    				out.print("<tr align=center bgcolor='#81BEF7'>");								
    			}
    			out.print("<td>" + dan + " * " + i + "</td>");
    			out.print("<td>" + dan * i + "</td>");
    		}
    		out.print("</table>");
    		
    		
    	}
    }
    ```
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/d4a5ab8f-d585-4754-bf5f-566d06f3710b/image.png)
    
    ![image.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/d21a1bd2-3189-4f59-b6b2-b4e05eb4ad8d/4fd92d8b-001d-412b-a6b4-30a47d0bdefc/image.png)
    

# ❗⭐7장 서블릿 비즈니스 로직 처리

https://gptjs409.github.io/java/2019/10/25/servlet-business-logic1.html

https://gptjs409.github.io/java/2019/10/26/servlet-business-logic2.html

https://gptjs409.github.io/java/2019/10/28/servlet-business-logic3.html

- 코드 실행 결과 정리

## 7.1 서블릿의 비즈니스 로직 처리 방법

## 7.2 서블릿의 데이터베이스 연동하기

## 7.3 DataSource 이용해 데이터베이스 연동하기

<aside>
💡

한번 읽기 필요

</aside>

- DB에 연결하여 작업하는 방식
    - [Java] 서블릿 비즈니스 로직 처리-(1)에서 헀음
    - 문제점 : DB 연결에 시간이 많이 걸림
    - 문제점을 극복하기 위해 커넥션풀이 등장함
- 커넥션 풀(Connection Pool)
    - 웹 애플리케이션이 실행됨과 동시에 연동할 데이터베이스와의 연결을 미리 설정
    - 필요할 때마다 미리 연결해 놓은 상태를 이용해 빠르게 데이터베이스와 연동하여 작업
    - 미리 데이터베이스와 연결시킨 상태를 유지하는 기술을 커넥션 풀이라 함

### 커넥션풀 동작 과정

- 동작 과정
    - 톰캣 컨테이너를 실행한 후 응용 프로그램을 실행
    - 톰캣 컨테이너 실행시 ConenctionPool 객체 생성
    - 생성된 ConnectionPool 객체는 DBMS와 연결
    - DB와의 연동 작업이 필요할 경우 응용 프로그램은 ConnectionPool에서 제공하는 메서드를 호출하여 연동
- 톰캣 컨테이너는 자체적으로 ConnectionPool 기능을 제공
    - 실행시 톰캣은 설정 파일에 설정된 DB 정보를 이용해 미리 DB와 연결하여 ConnectionPool 객체를 생성
    - 애플리케이션이 DB와 연동할 일이 생기면 ConnectionPool 객체의 메서드를 호출해 빠르게 연동하며 작업

### JNDI

- 웹 애플리케이션에서 Connection Pool 객체를 구현할 때
    - Java SE에서 제공하는 javax.sql.DataSource 클래스 이용
- 웹 애플리케이션 실행시 톰캣이 만들어놓은 ConnectionPool 객체 접근시
    - JNDI 이용
- JNDI(Java Naming and Directory Interface)란?
    - 필요한 자원을 키/값 (key/value) 쌍으로 저장한 후 필요할 때 키를 이용해 값을 얻는 방법
    - 접근할 자원에 미리 키를 지정한 후, 애플리케이션이 실행중일 때 이 키를 이용해 자원에 접근하여 작업
- JNDI 사용 예
    - 웹 브라우저에서 name/value 쌍으로 전송한 후 서블릿에서 getParameter(name)으로 값을 가져올 때
    - 해시맵(HashMap)이나 해시테이블(HashTable)에 키/값으로 저장한 후 키를 이용해 값을 가져올 때
    - 웹 브라우저에서 도메인 네임으로 DNS 서버에 요청할 경우 도메인 네임에 대한 IP 주소를 가져올 때
- 톰캣 컨테이너가 ConnectionPool 객체를 생성하면?
    - 이 객체에 대한 JNDI 이름(key)을 미리 설정
    - 웹 애플리케이션에서 DB 연동 작업을 할 때 설정해놓은 JNDI 이름(key)으로 접근하여 작업

### 톰캣의 DataSource 설정 및 사용 방법

- 톰캣 ConnectionPool 설정 과정
    - JDBC 드라이버를 /WEB-INF/lib 폴더에 설치
    - ConnectionPool 기능 관련 jar 파일을 /WEB-INF/lib 폴더에 설치
    - CATALINA_HOME/content.xml에 Connection 객체 생성시 연결할 데이터베이스 정보를 JNDI로 설정
    - DAO 클래스에서 데이터베이스와 연동시 미리 설정한 JNDI라는 이름으로 데이터베이스와 연결해서 작업
- 톰캣에서 ConnectionPool 기능을 사용하려면?
    - 이 기능을 제공하는 DBCP 라이브러리를 다운받아야 함(jar 파일로 제공됨)
    - 톰캣 9에도 DHCP 라이브러리가 있음(tomcat-dbcp.jar)

### ⭐이클립스에서 톰캣 DataSource 설정

- JDBC 드라이버(ojdbc?.jar)
    - pro07\WebContent\WEB-INF\lib\에 위치
- ConnectionPool 관련 jar파일(tomcat-dbcp.jar)
    - pro07\WebContent\WEB-INF\lib\에 ojdbc6.jar와 같이 위치
- context.xml
    - 이클립스에서 생성한 톰캣 서버의 설정 파일
    - Servers\Tomcat v9.0 Server at localhost-config\에 위치
- context.xml 파일 설정하기전 ConnectionPool로 연결할 **DB 속성** 알아보기
    - 다른 속성은 고정적으로 사용하며, 프로그래머는 주로 drvierClassName, user, password, url만 변경하여 설정
- `context.xml` 설정 (Resource 태그 부분)
    
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
                                     -->
        <WatchedResource>WEB-INF/web.xml</WatchedResource>
        <WatchedResource>WEB-INF/tomcat-web.xml</WatchedResource>
        <WatchedResource>${catalina.base}/conf/web.xml</WatchedResource>
        
        <Resource name="jdbc/oracle" 
    		auth="Container" 
    		type="javax.sql.DataSource" 
    		driverClassName="oracle.jdbc.OracleDriver"
    		url="jdbc:oracle:thin:@localhost:1521:XE"
    		username="omokuser"
    		password="omok123"
    		maxActive="50"
    		maxWait="-1" />
    
    </Context>
    ```
    
    | **속성** | **설명** |
    | --- | --- |
    | **name** | DataSource에 대한 JNDI 이름 |
    | **auth** | 인증 주체 |
    | **driverClassName** | 연결할 DB 종류에 따른 드라이브 클래스명 |
    | **factory** | 연결할 DB 종류에 따른 ConntectionPool 생성 클래스명 |
    | **maxActive** | 동시에 최대로 DB에 연결할 수 있는 Connection 수 |
    | **maxIdle** | 동시에 idle 상태로 대기할 수 있는 최대 수 |
    | **maxWait** | 새로운 연결이 생길 때 까지 기다릴 수 있는 최대 시간 |
    | **user** | DB 접속 ID |
    | **password** | DB접속 Password |
    | **type** | DB 종류별 DataSource |
    | **url** | 접속할 DB 주소와 포트번호 및 SID |

## ⭐7.4 DataSource 이용해 회원 정보 등록하기 (실습)

- 커넥션풀을 이용해 새 회원을 등록하고 삭제함
- `memberForm.html`
    
    ```html
    <!DOCTYPE html>
    <html>
    <head>
    <meta charset="UTF-8">
    <title>회원 가입창</title>
    <script type="text/javascript">
    	function fn_sendMember() {   // 회원 가입을 처리하는 함수 정의
    		var frmMember = document.frmMember;  // HTML 폼을 변수에 할당
    		var id = frmMember.id.value;   // 아이디 입력값을 가져옴
    		var pwd = frmMember.pwd.value;
    		var name = frmMember.name.value;
    		var email = frmMember.email.value;
    		
    		// else if 보다는 if만 쓰는 것 더 깔금
    		// if (id.length == 0 || id == "") {
    			
    		// 입력값 검증
    		if (id.trim() == '') { // 아이디가 비어있는지 확인
    			alert("아이디는 필수입니다."); // 경고 메시지 출력
    			document.querySelector("input[name='id']").focus(); // 아이디 입력란에 포커스
    			return; // 함수 종료
    		} 
    		if (pwd.length == 0 || pwd == "") {
    			alert("비밀번호는 필수입니다.");
    			return;
    		} 
    		if (name.length == 0 || name =="") {
    			alert("이름은 필수 입니다.");
    			return;
    		} 
    		if (email.length == 0 || email == "") {
    			alert("이메일은 필수입니다.")
    			return;
    		} 
    		
    		frmMember.method = "post"; // 폼 전송 방법을 POST로 설정
    		frmMember.action = "member4"; // 폼 전송 URL을 'member4'로 설정
    		frmMember.submit(); // 폼 제출
    	}
    </script>
    </head>
    <body>
    	<form name="frmMember">
    		<table>
    			<th>회원 가입창</th>
    			<tr>
    				<th>아이디</th>
    				<td><input type="text"  name="id"></td>
    			</tr>
    			<tr>
    				<th>비밀번호</th>
    				<td><input type="password"  name="pwd"></td>
    			</tr>
    			<tr>
    				<th>이름</th>
    				<td><input type="text"  name="name"></td>
    			</tr>
    			<tr>
    				<th>이메일</th>
    				<td><input type="text"  name="email"></td>
    			</tr>
    		</table>
    		<input type="button" value="가입하기" onclick="fn_sendMember()"> <!-- 가입하기 버튼, 클릭 시 함수 호출 -->
    		<input type="reset" value="다시 입력"> <!-- 입력 초기화 버튼 -->
    		<input type="hidden" name="command" value="addMember"> <!-- 숨겨진 입력 필드, 폼 전송 시 추가 정보 -->
    	</form>
    </body>
    </html>
    ```
    
- `MemberVO.java`
    - VO(Value Object) → 데이터를 저장하는 객체를 의미함
    - 주로 여러 속성을 함께 묶어서 하나의 단위로 관리하는 데 사용됨
    
    ```java
    package pro07.sec02.ex01;
    
    import java.sql.Date;
    
    import lombok.Getter;
    import lombok.Setter;
    
    @Getter
    @Setter
    public class MemberVO { // 회원 정보를 담는 클래스
    	private String id;
    	private String pwd;
    	private String name;
    	private String email;
    	private Date joinDate;
    }
    
    ```
    
- `MemberDAO.java`
    
    ```java
    package pro07.sec02.ex01;
    
    import java.sql.Connection;
    import java.sql.Date;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
    import java.util.List;
    
    import javax.naming.Context;
    import javax.naming.InitialContext;
    import javax.sql.DataSource;
    
    public class MemberDAO { // 데이터베이스와 상호작용하는 클래스 (Data Access Object)
    	
    	private PreparedStatement pstmt; // SQL 쿼리 실행을 위한 PreparedStatement
    	private Connection con; // 데이터베이스 연결을 위한 Connection
    	private DataSource dataFactory; // 데이터소스 객체
    	
    	// 자바 소스에서 DB 정보를 설정하는 것보다 톰캑 서버에 저장해 놓으면 다른 자바 프로젝트 할 때도 다시 설장할 필요 없음
    //	private String driver = "oracle.jdbc.OracleDriver";
    //	private String url = "jdbc:oracle:thin:@localhost:1521/xe";
    //	private String user = "testuser";
    //	private String pwd = "test1234";
    	
    	public MemberDAO() { // 생성자
    		try {
    			Context ctx = new InitialContext(); // JNDI 초기화
    			Context envContext = (Context)ctx.lookup("java:/comp/env"); // 환경 설정 컨텍스트 조회
    			dataFactory = (DataSource)envContext.lookup("jdbc/oracle"); // 데이터소스 조회
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    	// 모든 회원 정보를 조회하는 메소드
    	public List<MemberVO> listMembers() {
    		List<MemberVO> list = new ArrayList<>(); // 회원 정보를 저장할 리스트
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			String query = "select * from t_member"; // SQL 쿼리
    			System.out.println(query); // 쿼리 출력
    			
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			ResultSet rs = pstmt.executeQuery(); // 쿼리 실행 및 결과 집합 반환
    			
    			while (rs.next()) { // 결과 집합을 순회
    				// 각 컬럼의 값 읽기
    				String id = rs.getString("id");
    				String pwd = rs.getString("pwd");
    				String name = rs.getString("name");
    				String email = rs.getString("email");
    				Date joinDate = rs.getDate("joinDate");
    				
    				// MemberVO 객체 생성 및 값 설정
    				MemberVO vo = new MemberVO();
    				vo.setId(id);
    				vo.setPwd(pwd);
    				vo.setName(name);
    				vo.setEmail(email);
    				vo.setJoinDate(joinDate);
    				list.add(vo); // 리스트에 추가
    			}
    			rs.close(); // ResultSet 닫기
    			pstmt.close(); // PreparedStatement 닫기
    			con.close(); // Connection 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    		return list; // 회원 리스트 반환
    	}
    	
    	// 회원 정보를 추가하는 메소드
    	public void addMember(MemberVO memberVO) {
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			String id = memberVO.getId();
    			String pwd = memberVO.getPwd();
    			String name = memberVO.getName();
    			String email = memberVO.getEmail();
    			
    			String query = "INSERT INTO t_member (id,pwd,name,email) VALUES (?,?,?,?)"; // SQL 쿼리
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			pstmt.setString(1, id); // id 설정
    			pstmt.setString(2, pwd); // pwd 설정
    			pstmt.setString(3, name); // name 설정
    			pstmt.setString(4, email); // email 설정
    			pstmt.executeUpdate(); // 쿼리 실행
    			pstmt.close(); // PreparedStatement 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    	// 회원 정보를 삭제하는 메소드
    	public void delMember(String id) {
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			
    			String query = "DELETE FROM t_member WHERE id=?"; // SQL 쿼리
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			pstmt.setString(1, id); // id 설정
    			pstmt.executeUpdate(); // 쿼리 실행
    			pstmt.close(); // PreparedStatement 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    //	private void connDB() {
    //		try {
    //			Class.forName(driver);
    //			System.out.println("Oracle 드라이버 로딩 성공");
    //			con = DriverManager.getConnection(url, user, pwd);
    //			System.out.println("Connection 생성 성공");
    ////			stmt = con.createStatement();
    //			System.out.println("Statement 생성 성공");
    //		} catch (Exception e) {
    //			e.printStackTrace();
    //		}
    //	}
    }
    
    ```
    
- `MemberRegistServlet.java`
    
    ```java
    package pro07.sec02.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.sql.Date;
    import java.util.List;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class MemberRegistServlet
     */
    @WebServlet("/member4")  // 서블릿 매핑
    public class MemberRegistServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	/**
    	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doHandle(request, response);
    	}
    
    	/**
    	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    	 */
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doHandle(request, response);
    	}
    	
    	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		MemberDAO dao = new MemberDAO(); // MemberDAO 객체 생성
    		String command = request.getParameter("command"); // 요청 파라미터에서 command 가져오기
    		
    		if ("addMember".equals(command)) { // 회원 추가 요청 처리
    			String _id = request.getParameter("id"); // ID 가져오기
    			String _pwd = request.getParameter("pwd"); // 비밀번호 가져오기
    			String _name = request.getParameter("name"); // 이름 가져오기
    			String _email = request.getParameter("email"); // 이메일 가져오기
    			
    			MemberVO vo = new MemberVO(); // MemberVO 객체 생성
    			vo.setId(_id); // ID 설정
    			vo.setPwd(_pwd); // 비밀번호 설정
    			vo.setName(_name); // 이름 설정
    			vo.setEmail(_email); // 이메일 설정
    			dao.addMember(vo); // 회원 추가
    		} else if ("delMember".equals(command)) { // 회원 삭제 요청 처리
    			String id = request.getParameter("id"); // ID 가져오기
    			dao.delMember(id); // 회원 삭제
    		}
    		List<MemberVO> list = dao.listMembers(); // 모든 회원 정보 조회
    		
    		// HTML 출력
    		out.print("<html>\n<body>\n");
    		out.print("<table border=1>\n<tr align='center' bgcolor='lightgreen'>");
    		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>\n");
    		
    		for (int i=0; i<list.size(); i++) { // 회원 리스트 출력
    			MemberVO memberVO = list.get(i);
    			String id = memberVO.getId();
    			String pwd = memberVO.getPwd();
    			String name = memberVO.getName();
    			String email = memberVO.getEmail();
    			Date joinDate = memberVO.getJoinDate();
    			out.print("<tr><td>"+id+
    					"</td><td>"+pwd+
    					"</td><td>"+name+
    					"</td><td>"+email+
    					"</td><td>"+joinDate+
    					"</td><td><a href='/pro07/member4?command=delMember&id="+id+
    					"'>삭제</a></td></tr>\n");
    		}
    		out.print("</table>\n");
    		out.print("<a href='/pro07/memberForm.html'>새 회원 등록하기</a>\n</body>\n</html>");
    	}
    
    }
    ```
    

## 7.5 회원 정보 삭제하기

# ‼️⭐8장 서블릿 확장 API 사용하기 (포워드)

https://gptjs409.github.io/java/2019/10/28/servlet-expansion-api1.html

https://gptjs409.github.io/java/2019/10/29/servlet-expansion-api2.html (바인딩)

- 코드 실행 결과 정리

## 8.1 서블릿 포워드 기능 사용하기

- 서블릿에서 포워드(Forward) 기능은 클라이언트의 요청을 다른 서블릿이나 JSP로 전달하는 방법임

### 서블릿 포워드의 용도

- request에 대한 추가 작업을 다른 서블릿에게 수행하게 함
- request에 포함된 정보를 다른 서블릿이나 JSP와 공유
- request에 정보를 포함시켜 다른 서블릿에 전달
- 모델2 개발 시 서블릿에서 JSP로 데이터 전달
    - MVC

## 8.2 서블릿의 여러 가지 포워드 방법 (실습)

### 서블릿 포워드 방법

- **redirect (요청이 두 번 일어남)**
    - `HttpServletResponse` 객체의 `sendRedirect()` 메서드 이용
    - 웹 브라우저에 재요청하는 방식
    - syntax: `sendRedirect("포워드할 서블릿 또는 JSP")`
- Refresh
    - `HttpServletResponse` 객체의 `addHeader()` 메서드 이용
    - 웹 브라우저에 재요청하는 방식
    - syntax: `response.addHeader("Refresh", 경과시간(초); url=요청할 서블릿 또는 JSP)`
- location
    - 자바스크립트 `location` 객체의 `href` 속성 이용
    - 자바스크립트에서 재요청하는 방식
    - syntax: `location.href='요청할 서블릿 또는 JSP'`
- **dispatch (요청이 한 번만 일어남)**
    - 일반적인 포워딩 기능
    - 서블릿이 직접 요청하는 방식
    - `RequestDispatcher` 클래스의 `forward()` 메서드 이용
    - syntax: `RequestDispatcher dist = reqeuest.getRequestDispatcher("포워딩할 서블릿 또는 JSP"); dist.forward(request, response);`
    

### 포워드 방식 비교

- redirect, refresh는 Response 객체의 메소드 사용하고, dispacth 만 Request 객체의 메소드를 사용하는 이유
    - `redirect`와 `refresh`는 클라이언트의 동작을 변경하는 응답을 보내는 방식이기 때문에 `Response` 객체에서 처리함
    - `dispatch`는 서버 내에서의 요청 흐름을 제어하는 작업이기 때문에 `Request` 객체에서 처리됨

### redirect & dispatch 를 이용한 포워딩 실습

- `FirstServlet.java`
    
    ```java
    package pro08.sec01.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    @WebServlet("/first")
    public class FirstServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    			
    		// redirect 방법
    //		response.sendRedirect("second");
    		
    		// forward 방법
    //		RequestDispatcher rd = request.getRequestDispatcher("second");
    //		rd.forward(request, response);
    		request.getRequestDispatcher("second").forward(request, response); // 위 두 줄의 코드를 한 줄로 작성 가능
    		
    		// redirect v.s. forward 차이점 보여주기 위함 -> request 객체가 요청한 속성의 공유 가능 여부
    		request.setAttribute("name", "홍길동"); // request 객체에 name 속성을 바이딩함
    		
    		// redirect 방식으로 다른 서블릿에 데이터 전달하기
    //		response.sendRedirect("second?name=홍길동"); // GET 방식을 이용해 이름/값 쌍으로 데이터를 다른 서블릿으로 전달함 -> 이 방식을 쓸 때 33행 주석 처리해 줌 (필요 없기 때문임)
    		
    		
    	}
    
    }
    ```
    
- `SecondServlet.java`
    
    ```java
    package pro08.sec01.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    @WebServlet("/second")
    public class SecondServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		// redirect v.s. forward 차이점 비교하기 위해 first 서블릿에서 전달한 name 속성이 전달됐는지 확인용
    		String name = (String) request.getAttribute("name");
    		System.out.println("name : " + name);
    		
    		// redirect 방식으로 다른 서블릿의 데이터 전달받기
    //		String name = request.getParameter("name"); // name으로 이전 서블릿에서 전달된 lee를 받음
    		
    		out.print("<html><body>");
    		out.print("<h1>SecondServlet</h1><br>");
    //		out.println("<a style='color:red'>sendRedirect</a>를 이용한 redirect 실습입니다.<br>");
    		out.println("<a style='color:red'>forward</a>를 이용한 redirect 실습입니다.<br>");
    		out.print("Request에서 설정한 속송 name : <a style='color:red'>" + name + "</a>");
    		out.print("</body></html>");
    	}
    
    }
    
    ```
    

### refresh 를 이용한 포워딩 실습

- `FirstServlet.java`
    
    ```java
    package pro08.sec01.ex02;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    //@WebServlet("/first")
    public class FirstServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		response.addHeader("Refresh", "1;url=/pro08/second"); // 웹 브라우저에 1초 후 서블릿 second로 재요청함
    		
    	}
    
    }
    ```
    
- `SecondServlet.java`
    
    ```java
    package pro08.sec01.ex02;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    //@WebServlet("/second")
    public class SecondServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		out.print("<html><body>");
    		out.print("second<br>");
    		out.println("refresh를 이용한 redirect 실습입니다.");
    		out.print("</body></html>");
    	}
    
    }
    ```
    

### location을 이용한 포워딩 실습

- `FirstServlet.java`
    
    ```java
    package pro08.sec01.ex03;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    //@WebServlet("/first")
    public class FirstServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		out.print("<script>location.href='second';</script>");
    		
    	}
    
    }
    ```
    
- `SecondServlet.java`
    
    ```java
    package pro08.sec01.ex03;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class FirstServlet
     */
    //@WebServlet("/second")
    public class SecondServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		out.print("<html><body>");
    		out.print("second<br>");
    		out.println("location를 이용한 redirect 실습입니다.");
    		out.print("</body></html>");
    	}
    
    }
    ```
    

### getArrtibute() v.s. getParameter()

- getAttribute(): **서블릿**이나 **JSP**에서 설정한 요청 속성을 가져오는 데 사용
    
    > 예 ) request 객체에 name 속성을 바이딩함
    > 
    > 
    > ```java
    > // FirstServlet.java
    > request.setAttribute("name", "홍길동");
    > 
    > // SecondServlet.java
    > String name = (String) request.getAttribute("name");
    > ```
    > 
- getParameter(): **클라이언트**가 전송한 데이터를 가져오는 데 사용. 주로 HTML **폼 데이터**나 **쿼리 스트링**을 통해 전달된 값에 접근.
    
    > 예) HTML 폼에서 "name"이라는 입력 필드를 통해 값이 전송됨
    > 
    > 
    > ```java
    > // FirstServlet.java
    > response.sendRedirect("second?name=홍길동"); // GET 방식을 이용해 이름/값 쌍으로 데이터를 다른 서블릿으로 전달함 -> 이 방식을 쓸 때 33행 주석 처리해 줌 (필요 없기 때문임)
    > 
    > // SecondServlet.java
    > String name = request.getParameter("name"); // name으로 이전 서블릿에서 전달된 lee를 받음
    > ```
    > 

## 8.3 dispatch를 이용한 포워드 방법

## 8.4 바인딩 (실습)

### 두 서블릿 간 회원 정보 조회 바인딩 실습

- 데이터베이스에서 조회된 회원 정보를 화면 기능을 담당하는 서블릿에 전달해서 웹 브라우저에 출력함
- `MemberDAO.java`
    
    ```java
    package pro08.sec04.ex03;
    
    import java.sql.Connection;
    import java.sql.Date;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
    import java.util.List;
    
    import javax.naming.Context;
    import javax.naming.InitialContext;
    import javax.sql.DataSource;
    
    public class MemberDAO { // 데이터베이스와 상호작용하는 클래스 (Data Access Object)
    	
    	private PreparedStatement pstmt; // SQL 쿼리 실행을 위한 PreparedStatement
    	private Connection con; // 데이터베이스 연결을 위한 Connection
    	private DataSource dataFactory; // 데이터소스 객체
    	
    	public MemberDAO() { // 생성자
    		try {
    			Context ctx = new InitialContext(); // JNDI 초기화
    			Context envContext = (Context)ctx.lookup("java:/comp/env"); // 환경 설정 컨텍스트 조회
    			dataFactory = (DataSource)envContext.lookup("jdbc/oracle"); // 데이터소스 조회
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    	// 모든 회원 정보를 조회하는 메소드
    	public List<MemberVO> listMembers() {
    		List<MemberVO> list = new ArrayList<>(); // 회원 정보를 저장할 리스트
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			String query = "select * from t_member"; // SQL 쿼리
    			System.out.println(query); // 쿼리 출력
    			
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			ResultSet rs = pstmt.executeQuery(); // 쿼리 실행 및 결과 집합 반환
    			
    			while (rs.next()) { // 결과 집합을 순회
    				// 각 컬럼의 값 읽기
    				String id = rs.getString("id");
    				String pwd = rs.getString("pwd");
    				String name = rs.getString("name");
    				String email = rs.getString("email");
    				Date joinDate = rs.getDate("joinDate");
    				
    				// MemberVO 객체 생성 및 값 설정
    				MemberVO vo = new MemberVO();
    				vo.setId(id);
    				vo.setPwd(pwd);
    				vo.setName(name);
    				vo.setEmail(email);
    				vo.setJoinDate(joinDate);
    				list.add(vo); // 리스트에 추가
    			}
    			rs.close(); // ResultSet 닫기
    			pstmt.close(); // PreparedStatement 닫기
    			con.close(); // Connection 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    		return list; // 회원 리스트 반환
    	}
    	
    	// 회원 정보를 추가하는 메소드
    	public void addMember(MemberVO memberVO) {
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			String id = memberVO.getId();
    			String pwd = memberVO.getPwd();
    			String name = memberVO.getName();
    			String email = memberVO.getEmail();
    			
    			String query = "INSERT INTO t_member (id,pwd,name,email) VALUES (?,?,?,?)"; // SQL 쿼리
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			pstmt.setString(1, id); // id 설정
    			pstmt.setString(2, pwd); // pwd 설정
    			pstmt.setString(3, name); // name 설정
    			pstmt.setString(4, email); // email 설정
    			pstmt.executeUpdate(); // 쿼리 실행
    			pstmt.close(); // PreparedStatement 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    	// 회원 정보를 삭제하는 메소드
    	public void delMember(String id) {
    		try {
    			con = dataFactory.getConnection(); // 데이터베이스 연결
    			
    			String query = "DELETE FROM t_member WHERE id=?"; // SQL 쿼리
    			pstmt = con.prepareStatement(query); // PreparedStatement 생성
    			pstmt.setString(1, id); // id 설정
    			pstmt.executeUpdate(); // 쿼리 실행
    			pstmt.close(); // PreparedStatement 닫기
    		} catch (Exception e) {
    			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
    		}
    	}
    	
    }
    ```
    
- `MemberVO.java`
    
    ```java
    package pro08.sec04.ex03;
    
    import java.sql.Date;
    
    import lombok.Getter;
    import lombok.Setter;
    
    @Getter
    @Setter
    public class MemberVO { // 회원 정보를 담는 클래스
    	private String id;
    	private String pwd;
    	private String name;
    	private String email;
    	private Date joinDate;
    }
    ```
    
- `MemberRegistServlet.java`
    
    ```java
    package pro08.sec04.ex03;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.List;
    
    import javax.servlet.RequestDispatcher;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/member4")  // 서블릿 매핑
    public class MemberRegistServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doHandle(request, response);
    	}
    
    	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		doHandle(request, response);
    	}
    	
    	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		MemberDAO dao = new MemberDAO(); // MemberDAO 객체 생성
    		String command = request.getParameter("command"); // 요청 파라미터에서 command 가져오기
    		
    		if ("addMember".equals(command)) { // 회원 추가 요청 처리
    			String _id = request.getParameter("id"); // ID 가져오기
    			String _pwd = request.getParameter("pwd"); // 비밀번호 가져오기
    			String _name = request.getParameter("name"); // 이름 가져오기
    			String _email = request.getParameter("email"); // 이메일 가져오기
    			
    			MemberVO vo = new MemberVO(); // MemberVO 객체 생성
    			vo.setId(_id); // ID 설정
    			vo.setPwd(_pwd); // 비밀번호 설정
    			vo.setName(_name); // 이름 설정
    			vo.setEmail(_email); // 이메일 설정
    			dao.addMember(vo); // 회원 추가
    		} 
    		else if ("delMember".equals(command)) { // 회원 삭제 요청 처리
    			String id = request.getParameter("id"); // ID 가져오기
    			dao.delMember(id); // 회원 삭제
    		}
    		
    		List<MemberVO> list = dao.listMembers(); // 모든 회원 정보 조회
    		request.setAttribute("memberList", list); // 두번쩨 인수는 Object 객체만 가능
    		
    		RequestDispatcher rd = request.getRequestDispatcher("viewMembers");
    		rd.forward(request, response);
    	
    	}
    
    }
    ```
    
- `ViewServlet.java`
    
    ```java
    package pro08.sec04.ex03;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.sql.Date;
    import java.util.List;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/viewMembers")
    public class ViewServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
      
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		// 강제 형변환 : Object -> List 
    		// 강제 형변환의 조건 -> 원래 그 타입이어야 됨
    		// 만약 memberList의 값이 1이면 먼저 1(int)을 Interger로 형변환하고(박싱, Wrapper Class), Object로 형변환 하고자 하는데 안 됨
    		// 왜냐하면 Integer에서 Object로 형변환이 안 됨
    		List<MemberVO> list = (List<MemberVO>) request.getAttribute("memberList"); 
    		
    		// HTML 출력
    		out.print("<html>\n<body>\n");
    		out.print("<table border=1>\n<tr align='center' bgcolor='lightgreen'>");
    		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td></tr>\n");
    		
    		for (int i=0; i<list.size(); i++) { // 회원 리스트 출력
    			MemberVO memberVO = list.get(i);
    			String id = memberVO.getId();
    			String pwd = memberVO.getPwd();
    			String name = memberVO.getName();
    			String email = memberVO.getEmail();
    			Date joinDate = memberVO.getJoinDate();
    			out.print("<tr><td>"+id+
    					"</td><td>"+pwd+
    					"</td><td>"+name+
    					"</td><td>"+email+
    					"</td><td>"+joinDate+
    					"</td><td><a href='/pro08/member4?command=delMember&id="+id+
    					"'>삭제</a></td></tr>\n");
    		}
    		out.print("</table>\n");
    		out.print("<a href='/pro08/memberForm.html'>새 회원 등록하기</a>\n</body>\n</html>");
    	}
    
    }
    ```
    

## 8.5 ServletContext와 ServletConfig 사용법 (실습)

### 8.5.1. ServletContext

---

### 1) ServletContext 객체의 주요 메소드

| **메소드** | **기능** |
| --- | --- |
| **setAttribute(String name, Object object)** | 애플리케이션 범위에서 사용할 속성을 설정함 |
| **getAttribute(String name)** | 지정된 이름의 속성을 반환함 |
| removeAttribute(String name) | 지정된 이름의 속성을 삭제함 |
| getContextPath() | 애플리케이션의 컨텍스트 경로를 반환함 |
| getInitParameter(String name) | 서블릿 컨텍스트 초기화 매개변수를 반환함 |
| getInitParameterNames() | 초기화 매개변수의 이름을 Enumeration 형태로 반환함 |
| getResource(String path) | 애플리케이션의 리소스를 URL 형태로 반환함 |
| getResourceAsStream(String path) | 애플리케이션의 리소스를 InputStream 형태로 반환함 |
| getServerInfo() | 서버에 대한 정보를 반환함 |
| getMajorVersion() | 서블릿 API의 주요 버전을 반환함 |
| getMinorVersion() | 서블릿 API의 부 버전을 반환함 |

### 2) ServletContext 바인딩 기능 실습

- `SetServletContext.java`
    
    ```java
    package pro08.sec05.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.ArrayList;
    import java.util.List;
    
    import javax.servlet.ServletContext;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/cset")
    public class SetServletContext extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		ServletContext context = getServletContext(); // 현재 서블릿의 컨텍스트를 가져오기 (ServletContext 객체는 애플리케이션 전체에서 공유되는 정보를 저장하고 검색하는 데 사용됨)
    		
    		List member = new ArrayList();
    		member.add("이순신");
    		member.add(30);
    		
    		context.setAttribute("member", member); // ServletContext에 "member"라는 이름으로 리스트 저장
    		out.print("<html><body>");
    		out.print("이순신과 30 설정");
    		out.print("</body></html>");
    	}
    
    }
    
    ```
    
- `GetServletContext.java`
    
    ```java
    package pro08.sec05.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.ArrayList;
    import java.util.List;
    
    import javax.servlet.ServletContext;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/cget")   // 톰캣을 재시작하면 앞에 했던 cset이 살아지기 때문에 재시작하고 set한번 접속하고 get을 접속하면 됨
    public class GetServletContext extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		ServletContext context = getServletContext(); // 서블릿 컨텍스트 객체를 가져옴 (애플리케이션 전역에서 공유되는 데이터를 저장하고 관리하는 데 사용됨)
    		
    		// "member" 속성에서 저장된 리스트를 가져옴
    		List member = (ArrayList) context.getAttribute("member");
    		// 리스트에서 첫 번째 요소(이름)를 가져옴
    		String name = (String)member.get(0);
    		int age = (Integer)member.get(1);
    		
    		out.print("<html><body>");
    		out.print(name + "<br>");
    		out.print(age + "<br>");
    		out.print("</body></html>");
    	}
    
    }
    
    ```
    

### 3) ServletContext의 매개변수 설정 기능

- `web.xml`
    
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
      <display-name>pro08</display-name>
      <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.jsp</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>default.html</welcome-file>
        <welcome-file>default.jsp</welcome-file>
        <welcome-file>default.htm</welcome-file>
      </welcome-file-list>
    
      <context-param>
      	<param-name>menu_member</param-name>
      	<param-value>회원등록 회원조회 회원수정 회원삭제</param-value>
      </context-param>
      <context-param>
      	<param-name>menu_order</param-name>
      	<param-value>주문조회 주문등록 주문수정 주문취소</param-value>
      </context-param>
      <context-param>
      	<param-name>menu_goods</param-name>
      	<param-value>상품조회 상품등록 상품수정 상품삭제</param-value>
      </context-param>
      
      <servlet>
    	<servlet-name>initParam</servlet-name>
    	<servlet-class>pro08.sec06.ex01.InitParamServlet</servlet-class>
    	<init-param>
    		<param-name>email</param-name>
    		<param-value>admin@jweb.com</param-value>
    	</init-param>
    	<init-param>
    		<param-name>tel</param-name>
    		<param-value>010-1111-2222</param-value>
    	</init-param>
    </servlet>
    
    <servlet-mapping>
    	<servlet-name>initParam</servlet-name>
    	<url-pattern>/sInit</url-pattern>
    </servlet-mapping>
    
    </web-app>
    ```
    
- `ContextParamServlet.java`
    
    ```java
    package pro08.sec05.ex02;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    
    import javax.servlet.ServletContext;
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    /**
     * Servlet implementation class ContextParamServlet
     */
    @WebServlet("/initMenu")
    public class ContextParamServlet extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		ServletContext context = getServletContext(); // 서블릿 컨텍스트 객체를 가져오기
    		// 서블릿 컨텍스트 초기화 매개변수 가져오기
    		String menu_member = context.getInitParameter("menu_member");
    		String menu_order = context.getInitParameter("menu_order");
    		String menu_goods = context.getInitParameter("menu_goods");
    		
    		out.print("<html><body>");
    		out.print("<table border=1 cellspacing=0><tr>메뉴 이름</tr>");
    		out.print("<tr><td>" + menu_member + "</td></tr>");
    		out.print("<tr><td>" + menu_order + "</td></tr>");
    		out.print("<tr><td>" + menu_goods + "</td></tr>");
    		out.print("</tr></table></body></html>");
    	}
    
    }
    
    ```
    

### 4) ServletContext의 파일 입출력 기능 (정리 필요)

### 8.5.2. ServletConfig

---

<aside>
💡

ServletConfig 제공하는 기능

- ServletContext 객체를 얻는 기능
- 서블릿에 대한 초기화 작업 기능
</aside>

### 서블릿에서 초기화하는 두 가지 방법

- `@WebServlet`  애너테이션 이용한 실습
    - `@WebServlet`  구성 요소 (P294 정리 필요)
    - `InitParamServlet.java`
        
        ```java
        package pro08.sec06.ex01;
        
        import java.io.IOException;
        import java.io.PrintWriter;
        
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebInitParam;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        
        @WebServlet(
        		urlPatterns = { 
        				"/sInit", 
        				"/sInit2"
        		}, 
        		initParams = { 
        				@WebInitParam(name = "email", value = "admin@jweb.com"), 
        				@WebInitParam(name = "tel", value = "010-1111-2222")
        		})
        
        public class InitParamServlet extends HttpServlet {
        	private static final long serialVersionUID = 1L;
         
        	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
        		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
        		
        		String email = getInitParameter("email");
        		String tel = getInitParameter("tel");
        		
        		out.print("<html><body>");
        		out.print("<table border=1 cellspacing=0><tr>");
        		out.print("<td>email: </td><td>" + email + "</td></tr>");
        		out.print("<tr><td>휴대전화: </td><td>" + tel + "</td></tr></table>");
        		out.print("</body></html>");
        	}
        
        }
        
        ```
        
- `web.xml`을 이용한 방법
    
    ```xml
    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
      <display-name>pro08</display-name>
      <welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.jsp</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>default.html</welcome-file>
        <welcome-file>default.jsp</welcome-file>
        <welcome-file>default.htm</welcome-file>
      </welcome-file-list>
      
    	// 이 부분
      <servlet>
    	<servlet-name>initParam</servlet-name>
    	<servlet-class>pro08.sec06.ex01.InitParamServlet</servlet-class>
    	<init-param>
    		<param-name>email</param-name>
    		<param-value>admin@jweb.com</param-value>
    	</init-param>
    	<init-param>
    		<param-name>tel</param-name>
    		<param-value>010-1111-2222</param-value>
    	</init-param>
    </servlet>
    
    <servlet-mapping>
    	<servlet-name>initParam</servlet-name>
    	<url-pattern>/sInit</url-pattern>
    </servlet-mapping>
    
    </web-app>
    ```
    

## 8.6 load-on-startup 기능 사용하기

# ‼️9장 쿠키와 세션 알아보기

## 9.1 웹 페이지 연결 기능

- 웹 페이지를 연동하는 방법
    - <hidden> 태그
    - URL Rewriting
    - 쿠키
    - 세션

## 9.2 [hidden] 태그와 URL Rewriting 이용해 웹 페이지 연동하

## 9.3 쿠키를 이용한 웹 페이지 연동 기능 (실습)

### 서블릿에서 쿠키 사용하기

- `SetCookieValue.java`
    
    ```java
    package pro09.sec02.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.net.URLEncoder;
    import java.util.Date;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.Cookie;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/set")
    public class SetCookieValue extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정 (UTF-8로 설정하여 한글 데이터 처리)
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정 (HTML 문서로 응답하며 UTF-8 인코딩 사용)
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성 (응답 데이터를 클라이언트로 전송하기 위해 사용)
    		Date d = new Date();
    		
    		// 쿠키 생성: 이름은 "cookieTest", 값은 URL 인코딩된 문자열
    		Cookie c = new Cookie("cookieTest", URLEncoder.encode("JSP프로그래밍입니다.", "utf-8"));
    //		c.setMaxAge(24*60*60); // setMaxAge 안 하거나 -1로 하면 세션쿠키가 됨
    		response.addCookie(c); // 쿠키를 응답에 추가하여 클라이언트에 전송
    		
    		c = new Cookie("name", URLEncoder.encode("홍길동", "utf-8"));
    		c.setMaxAge(24*60*60);
    		response.addCookie(c);
    		
    		out.println("현재시간 : " + d);
    		out.println("문자열을 Cookie에 저장하빈다.");
    	}
    
    }
    ```
    
- `GetCookieValue.java`
    
    ```java
    package pro09.sec02.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.net.URLDecoder;
    import java.net.URLEncoder;
    import java.util.Date;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.Cookie;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    
    @WebServlet("/get")
    public class GetCookieValue extends HttpServlet {
    	private static final long serialVersionUID = 1L;
    
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성
    		
    		Cookie[]	allValues = request.getCookies();
    //		for(int i=0; i<allValues.length; i++) {
    //			
    //			if("cookieTest".equals(allValues[i].getName())) {
    //				out.println("<h2>Cookie 값 가져오기 : " + URLDecoder.decode(allValues[i].getValue(), "utf-8"));
    //			}
    //		}
    		for (Cookie c : allValues) {
    //			if ("cookieTest".equals(c.getValue())) {
    				out.println("<h2>Cookie 값 가져오기 : " + URLDecoder.decode(c.getValue() + "</h2>", "utf-8"));
    //			}
    		}
    	}
    
    }
    ```
    

## 9.4 세션을 이용한 웹 페이지 연동 기능 (실습)

### 서블릿에서 세션 API 이용하기

- `SessionTest.java`
    
    ```java
    package pro09.sec03.ex01;
    
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.Date;
    import java.util.HashMap;
    import java.util.Map;
    
    import javax.servlet.ServletException;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import javax.servlet.http.HttpSession;
    
    /**
     * Servlet implementation class SessionTest
     */
    @WebServlet("/sess")
    public class SessionTest extends HttpServlet {
    	private static final long serialVersionUID = 1L;
           
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		request.setCharacterEncoding("utf-8"); // 요청 인코딩 설정 (UTF-8로 설정하여 한글 데이터 처리)
    		response.setContentType("text/html;charset=utf-8"); // 응답 콘텐츠 타입 설정 (HTML 문서로 응답하며 UTF-8 인코딩 사용)
    		PrintWriter out = response.getWriter(); // PrintWriter 객체 생성 (응답 데이터를 클라이언트로 전송하기 위해 사용)
    		
    		// HTTP 세션 객체 가져오기 (클라이언트의 세션 정보를 관리)
    		HttpSession session = request.getSession();
    		out.println("세션 아이디: " + session.getId() + "<br>");
    		out.println("최초 세션 생성 시각 : " + new Date (session.getCreationTime()) + "<br>");
    		out.println("최근 세션 접근 시각 : " + new Date (session.getLastAccessedTime()) + "<br>");
    		out.println("세션 유효 시간 : " + session.getMaxInactiveInterval() + "<br>");  // (초 단위)
    		
    		// 새로 생성된 세션인지 확인
    		if (session.isNew()) {
    			out.print(" 새 세션이 만들어졌습니다.");
    		}
    		
    		// 세션에 데이터를 저장하기 위해 HashMap 생성
    		Map<String, Object> map = new HashMap<>();
    		map.put("name", "홍길동");
    		map.put("age", 30);
    		
    		session.setAttribute("member", map);
    		
    		// JSP 파일에서 작성하는 코드 여기에 작성해도 실행 가능 -> 하지만 같은 서블릿 파일에서 작성할 때는 궅이 getAttribute() 및 setArrtibute()를 쓸 필요없음
    		Map<String, Object> member = (Map<String, Object>) session.getAttribute("member");
    		out.print(member.get("name") + "<br>");
    		out.print(member.get("age"));
    	}
    
    }
    ```
    

## 9.5 encodeURL( ) 사용법

## 9.6 세션을 이용한 로그인 예제

# ‼️10장 서블릿의 필터와 리스너 기능

- Filter 개념 중요

## 10.1 서블릿 속성과 스코프

## 10.2 서블릿의 여러 가지 URL 패턴

## 10.3 Filter API

## 10.4 여러 가지 서블릿 관련 Listener API

# ‼️11장 JSP 정의와 구성 요소

## ⭐Extra : JSP, JSTL, EL

**JSP (Java Server Pages)**

- JSP는 HTML 문서 안에서 자바 코드를 사용할 수 있게 해주는 기술

**JSTL (JSP Standard Tag Library)**

- JSP에서 자바 코드를 쉽게 사용할 수 있게 해주는 태그 라이브러리
- 사용 시점
    - 프로그래밍 로직이 필요한 상황에서 사용됨. 예 : 반복문, 조건문 등
- 순수 자바 코드
    
    ```html
    <%
        for(Menu menu : menuList) {
            out.println("<p>" + menu.getName() + "</p>");
        }
    %>
    ```
    
- JSTL 사용
    
    ```html
    <c:forEach items="${menuList}" var="menu">
        <p>${menu.name}</p>
    </c:forEach>
    ```
    

**EL (${...})** 

- JSP에서 데이터를 쉽게 출력할 수 있게 해주는 문법
- 사용 시점
    - 데이터를 출력할 때 사용. 예 : 단순 데이터 출력, 객체 의 속성 접근
- 전통 자바 코드
    
    ```html
    <p>메뉴 이름: <%= menu.getName() %></p>
    <p>가격: <%= menu.getPrice() %></p>
    ```
    
- EL 사용
    
    ```html
    <p>메뉴 이름: ${menu.name}</p>
    <p>가격: ${menu.price}</p>
    ```
    

### **예제 코드**

```html
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
    <h1>오늘의 메뉴판</h1>
    
    <!-- JSTL로 메뉴 목록 반복 -->
    <c:forEach items="${menuList}" var="menu">
        <div class="menu-item">
            <!-- EL로 메뉴 정보 출력 -->
            <h2>${menu.name}</h2>
            <p>가격: ${menu.price}원</p>
            
            <!-- JSTL로 조건에 따라 다른 내용 표시 -->
            <c:if test="${menu.spicy}">
                <span>매운 음식</span>
            </c:if>
        </div>
    </c:forEach>
</body>
</html>
```

## 11.1 JSP 등장 배경

## 11.2 JSP의 3단계 작업 과정

## 11.3 JSP 페이지 구성 요소

### JSP 페이지 구성 요소

- 디렉티브 태그(Directive Tag)
- 스크립트 요소(Scripting Element)
- 표현 언어(Expression Language)
- 내장 객체(내장 변수)
- 액션 태그(Action Tag)
- 커스텀 태그(Custom Tag)

## 11.4 디렉티브 태그

- 중요한 JSP 송성
    - import
        - `<%@ **page** import=*"java.util.*"* %>`

# ‼️⭐12장 JSP 스크립트 요소 기능

## 12.1 JSP 스크립트 요소

## 12.2 선언문 사용하기

## 12.3 스크립트릿 사용하기

## 12.4 표현식 사용하기

## 12.5 JSP 주석문 사용하기

## 12.6 스크립트 요소 이용해 실습하기

## 12.7 내장 객체(내장 변수) 기능

## 12.8 JSP 페이지 예외 처리하기

## 12.9 JSP welcome 파일 지정하기

## 12.10 스크립트 요소 이용해 회원 정보 조회하기

- 데이터베이스의 회원 정보를 조회한 후 JSP 페이지에 출력하는 예제
- search.jsp
    
    ```java
    
    ```
    
- member.jsp

# ‼️13장 자바 코드를 없애는 액션 태그

## 13.1 인클루드 액션 태그 사용하기

## 13.2 포워드 액션 태그 사용하기

## 13.3 useBean, setProperty, getProperty 액션 태그 사용하기

# ‼️14장 표현 언어와 JSTL

## 14.1 표현 언어란?

## 14.2 표현 언어 내장 객체(내장 변수)

## 14.3 표현 언어로 바인딩 속성 출력하기

## 14.4 커스텀 태그

## 14.5 JSTL 표준 태그 라이브러리(JSTL)

## 14.6 Core 태그 라이브러리 사용하기

## 14.7 Core 태그 라이브러리 실습 예제

## 14.8 다국어 태그 라이브러리 사용하기

## 14.9 한글을 아스키 코드로 변환하기

## 14.10 포매팅 태그 라이브러리 사용하기

## 14.11 문자열 처리 함수 사용하기

## 14.12 표현 언어와 JSTL을 이용한 회원 관리 실습

# ‼️15장 JSP 페이지를 풍부하게 하는 오픈 소스 기능

## 15.1 JSP에서 파일 업로드

## 15.2 JSP에서 파일 다운로드

# ‼️16장 HTML5와 제이쿼리 (JQuery)

## 16.1 HTML5 주요 개념

## 16.2 HTML5 시맨틱 웹을 위한 구성 요소

## 16.3 제이쿼리 주요 개념

## 16.4 제이쿼리의 여러 가지 기능

## 16.5 제이쿼리 Ajax 기능

## 16.6 제이쿼리에서 JSON 사용하기

# 17장 모델2 방식으로 효율적으로 개발하기

## 17.1 웹 애플리케이션 모델

## 17.2 MVC 디자인 패턴

## 17.3 MVC를 이용한 회원 관리

## 17.4 모델2로 답변형 게시판 구현하기

# 18장 스프링(Spring) 프레임워크 시작하기

## 18.1 프레임워크란?

## 18.2 스프링 프레임워크 환경 설정하기

# 19장 스프링 의존성 주입과 제어 역전 기능

## 19.1 의존성 주입하기

## 19.2 의존성 주입 실습하기

## 19.3 회원 기능 이용해 DI 실습하기

# 20장 스프링 AOP 기능

## 20.1 관점 지향 프로그래밍의 등장

## 20.2 스프링에서 AOP 기능 사용하기

# 21장 스프링 MVC 기능

## 21.1 스프링 프레임워크 MVC의 특징

## 21.2 SimpleUrlController 이용해 스프링 MVC 실습

## 21.3 MultiActionController 이용해 스프링 MVC 실습하기

## 21.4 MultiActionController 이용해 회원 정보 표시

## 21.5 요청명과 동일한 JSP 이름 표시하기

# 22장 스프링 JDBC 기능

## 22.1 스프링 JDBC로 데이터베이스와의 연동 설정하

## 22.2 JdbcTemplate 클래스 이용해 회원 정보 조회하기

# 23장 마이바티스 프레임워크 사용하기

## 23.1 마이바티스란?

## 23.2 마이바티스 설치하기

## 23.3 마이바티스 이용해 회원 기능 실습하기

## 23.4 마이바티스 이용해 회원 정보 CRUD 실습하기

## 23.5 마이바티스의 동적 SQL문 사용하기

# 24장 스프링과 마이바티스 연동하기

## 24.1 스프링-마이바티스 연동 관련 XML 파일 설정하기

## 24.2 마이바티스 관련 XML 파일 설정하기

## 24.3 자바 클래스와 JSP 파일 구현하기

# 25장 스프링 트랜잭션 기능 사용하기

## 25.1 트랜잭션 기능

## 25.2 은행 계좌 이체를 통한 트랜잭션 기능

## 25.3 스프링의 트랜잭션 속성 알아보기

## 25.4 스프링 트랜잭션 기능 적용해 계좌 이체 실습하

# 26장 스프링 애너테이션 기능

## 26.1 스프링 애너테이션이란?

## 26.2 스프링 애너테이션 이용해 URL 요청 실습하기

## 26.3 스프링 애너테이션 이용해 로그인 기능 구현하기

## 26.4 @Autowired 애너테이션 이용해 빈 주입하기
