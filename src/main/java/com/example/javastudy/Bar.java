package com.example.javastudy;

public interface Bar {

    /*
    //재정의 가능하다.
    void printNameUpperCase();
    */

    default void printNameUpperCase() {
        System.out.println("Bar");
    }
}
