package com.spring.practice.first.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

// import static: 변수, 메소드를 패키지, 클래스명 없이 접근가능하게 import하는 방식
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getTest() throws Exception {

        mvc.perform(get("/api")
                        .param("name", "harvey")
                        .param("amount", "10"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is("harvey")))
                .andExpect(jsonPath("$.amount", is(10)));
    }
}
