package com.example.javastudy.functionalinterface;


/**
 * 함수형 인터페이스를 만드는 예제입니다.
 * 추상화 인터페이스가 하나만 있으면 FunctionalInterface 입니다.
 * @FunctionalInterface 입력하면 편합니다.
 */


@FunctionalInterface
public interface HelloFunctionalInterface1 {
    void hello();

    //static으로 선언했을 경우 {};을 넣어줘야 한다.
    static void helloFunctional1(){
        System.out.println("hello i'm static method");
    };
    default void helloFunctional2() {
        System.out.println("꼭 구현하지 않아도 괜찮아요~");
    }
}
