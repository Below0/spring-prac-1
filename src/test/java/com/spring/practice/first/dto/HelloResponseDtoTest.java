package com.spring.practice.first.dto;

import com.spring.practice.first.controller.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloResponseDtoTest {

    @Test
    public void dtoTest() {
        HelloResponseDto dto = HelloResponseDto.builder()
                .name("Hello")
                .amount(5)
                .build();

        assertThat(dto.getName()).isEqualTo("Hello");
        assertThat(dto.getAmount()).isEqualTo(5);
    }
}
