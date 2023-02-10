package com.example.javastudy.functionalinterface;

import org.springframework.cglib.core.internal.Function;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class HelloFunctionalInterfaceImpl {

    public static void main(String[] args) {
        anonymous1();
        System.out.println(anonymous2(100));
        Function<Integer, Integer> plus = key -> key + 10;
        Function<Integer, Integer> multiply = key -> key * 10;




    }

    static class Test{
        private int a = 1;
    }


    public static void anonymous1() {
        /**
         * 익명함수 예제
         *
         */
        HelloFunctionalInterface1 hfi = () -> {
            System.out.println("anonymous에서 정의됐습니다.");
        };
        hfi.hello();
        hfi.helloFunctional2();

        //static은 안 됩니다.
        //hfi.helloFunctional1();
    }

    /**
     * 받은 값에 num만큼 더하고 return 한다.
     */
    public static int anonymous2(int inputData) {
        //num의 값이 바뀌면 안 된다. 그러므로 final로 설정하자
        int num = 10;
        HelloFunctionalInterface2 hri2 = i -> i + num;
        return hri2.function(inputData);
    }
}