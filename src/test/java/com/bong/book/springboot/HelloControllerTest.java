package com.bong.book.springboot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)//1
@WebMvcTest //2
public class HelloControllerTest {

    @Autowired //3
    private MockMvc mvc;

    @Test
    public void hello_가_리턴된다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello")) //5
                .andExpect(status().isOk()) //6
                .andExpect(content().string(hello)); //7

    }

}

//1 스프링 부트 테스트와 Junit 사이에 연결자 역할
//2 여러 스프링 테스트 어노테이션 중 Web에 집중할 수 있는 어노테이션
//  선언할 경우 @Controller, ControllerAdvice 등을 사용 할 수 있습니다.
//  @Service , @Component, @Repository 등을 사용 할 수 없음

//3 스프링이 관리하는 빈(bean)을 주입
//4 웹 API를 테스트 할 때 사용

