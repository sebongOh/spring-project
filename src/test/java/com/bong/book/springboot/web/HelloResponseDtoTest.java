package com.bong.book.springboot.web;

import com.bong.book.springboot.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void 롬복_테스트(){

        //given
        String name = "test";
        int amount = 100;

        //when
        HelloResponseDto helloResponseDto = new HelloResponseDto(name,amount);

        //then
        assertThat(helloResponseDto.getName()).isEqualTo(name);
        assertThat(helloResponseDto.getAmount()).isEqualTo(amount);

    }
}

//1 assertThat
//  assertJ 검증 라이브러리
//  검증하고 싶은 대상을 메소드 인자로 받는다

//2 isEqualTo
//

