package com.example.javastudy.datatype;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


public class helloWrapper {
    private Integer hello;
    private Object hello2;
    @Test
    public void printInteger() throws Exception {
        //given
        hello2 = hello;

        //when
        try {
            System.out.println(hello2);
        } catch (NullPointerException e) {
            System.out.println("ehllo");
        }
        //then
    }
}
