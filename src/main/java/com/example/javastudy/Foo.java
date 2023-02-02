package com.example.javastudy;

public interface Foo {
    void printName();


    /**
     * @implSpec 이 구현체는 getName()으로 가져온 무자열을 대문지로 바꿔 출력한다.
     */
    default void printNameUpperCase(String a){
        System.out.println(getName().toUpperCase());
    }

    String getName();
}
