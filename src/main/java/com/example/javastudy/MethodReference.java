package com.example.javastudy;

public class MethodReference {

    String s;


    public MethodReference() {

    }

    public MethodReference(String s) {
        this.s = s;
    }

    public static String hi(String test) {
        return "hi" + test;
    }

    public String hi2(String test) {
        return "hi" + test;
    }
}
