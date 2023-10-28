package com.jsp.chap01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    //기본생성자
    public HelloServlet(){
        System.out.println("\n\n\n 헬로 서블릿 작동시작 \n\n\n");
    }
    //파싱된 요청정보 얻는 법

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //클라이언트 요청방식
        String method = req.getMethod();
        //요청 URL
        String requestURI = req.getRequestURI();
        //요청 Header
        String header = req.getHeader("Cache-Control");

        System.out.println("header = " + header);
        System.out.println("requestURI = " + requestURI);
        System.out.println("method = " + method);
        
        //쿼리 파라미터 읽기 
        String keyword = req.getParameter("keyword");
        System.out.println("keyword = " + keyword);

        String age = req.getParameter("age");
        System.out.println("age = " + age);

        //응답 메세지 HTML문서 생성해서 응답
        //keyword님은 xxx년생입니다ㅏ.

        //비지니스 로직
        //나이 받아서 출생년도 구하기
        int year = LocalDateTime.now().getYear();
        int birthYear = year - Integer.parseInt(age) +1;

        //HTML 생성
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        //HTML을 작성할 펜같은거 생성
        PrintWriter w = resp.getWriter();
        w.write("<!DOCTYPE html>\n");
        w.write("<html>\n");
        w.write("<head>\n");
        w.write("<body>\n");
        w.write("<h1>\n");

        w.write(String.format("%s님은 %d년생입니다.\n",keyword,birthYear));

        w.write("</h1>\n");
        w.write("</body>\n");
        w.write("</head>\n");
        w.write("</html>\n");

    }
}
