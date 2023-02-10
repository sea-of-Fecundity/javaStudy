package com.example.javastudy.functionalinterface;

import org.springframework.cglib.core.internal.Function;

public class FunctionImp implements Function<Integer, Integer> {

    private Integer key = null;

    public FunctionImp(Integer key) {
        this.key = key;
    }

    @Override
    public Integer apply(Integer integer) {
        return key + integer;
    }
}
