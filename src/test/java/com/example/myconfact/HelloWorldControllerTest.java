package com.example.myconfact;

import com.example.myconfact.controller.HelloWorldController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class HelloWorldControllerTest {

    @Autowired
    HelloWorldController helloWorldController;

    private MockMvc mockMvc;

    @Test
    void helloTest(){
        assertThat(helloWorldController.helloWorld()).isEqualTo("HelloWorld");
    }

    @Test
    void mockMvcTest() throws Exception {

        mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();

        mockMvc.perform(
                MockMvcRequestBuilders.get("/api/helloWorld")
        ).andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());

    }



}