package com.bong.book.springboot.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //1 Getter 만들어줌
@RequiredArgsConstructor //2 final로 선언된 변수 생성자 만들어줌
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
