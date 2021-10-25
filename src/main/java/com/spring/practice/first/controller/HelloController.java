package com.spring.practice.first.controller;

import com.spring.practice.first.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api")
@RestController // JSON 형태로 반환하는 컨트롤러로 변경
public class HelloController {

    @GetMapping
    public HelloResponseDto hello(@RequestParam("name") String name, @RequestParam("amount") int amount) {

        return HelloResponseDto.builder()
                .name(name)
                .amount(amount)
                .build();
    }
}
