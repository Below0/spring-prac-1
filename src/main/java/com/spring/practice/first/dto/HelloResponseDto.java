package com.spring.practice.first.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter // 선언된 모든 필드의 getter를 생성
@RequiredArgsConstructor // final 필드를 포함하는 생성자를 생성
@Builder // builder 패턴이 적용된 생성자를 생성
public class HelloResponseDto {

    public final String name; // final 필드는 인스턴스 생성 시 초기화되고 상수 취급받게 됨
    public final int amount;

}
