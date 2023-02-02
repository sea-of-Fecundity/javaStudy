package com.example.javastudy;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws InterruptedException {

      /*  Date date = new Date();


//        Function<Integer, Integer> pluse = (i)-> i + 10;
//        Function<Integer, Integer> multi = (i)-> i * 2;
//
//        Function<Integer, Integer> compose = pluse.compose(multi);
        //System.out.println(compose.apply(2));
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        //인스턴스 메소드의 레퍼런스를 이용
        MethodReference methodReference = new MethodReference();
        UnaryOperator<String> hi2 = methodReference::hi2;


        //static 메소드의 레퍼런스를 이용
        UnaryOperator<String> hi = MethodReference::hi;


        List<String> names = new ArrayList<>();
        names.add("keesun");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

        List<String> collect = names.stream().map((s) -> {
            System.out.println(s + " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(2, "spring data jpa", true));
        springClasses.add(new OnlineClass(3, "spring mvc", false));
        springClasses.add(new OnlineClass(4, "spring core", false));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        List<OnlineClass> javaClasses = new ArrayList<>();
        javaClasses.add(new OnlineClass(6, "The Java, Test", true));
        javaClasses.add(new OnlineClass(7, "The Java, Code manipulation", true));
        javaClasses.add(new OnlineClass(8, "The Java, 8 to 11", false));

        List<List<OnlineClass>> keesunEvents = new ArrayList<>();
        keesunEvents.add(springClasses);
        keesunEvents.add(javaClasses);

        System.out.println("spring 으로 시작하는 수업");
        springClasses.stream()
                .filter(oc -> oc.getTitle().startsWith("spring"))
                .forEach(onlineClass -> System.out.println(onlineClass.getId()));

        System.out.println("close 되지 않은 수업");
        springClasses.stream()
                .filter(onlineClass -> !onlineClass.isClosed()) //.filter(Predicate.not(OnlineClass::isClosed
                .forEach(onlineClass -> System.out.println(onlineClass.getId()));

        System.out.println("수업 이름만 모아서 스트림 만들기");
        springClasses.stream()
                .map(OnlineClass::getTitle)
                .forEach(System.out::println);


        System.out.println("두 수업 목록에 들어있는 모든 수업 아이디 출력");
        keesunEvents.stream().flatMap(Collection::stream)
                              .forEach(onlineClass -> System.out.println(onlineClass.getId()));

        System.out.println("10부터 1씩 증가하는 무제한 스트림 중에서 앞에 10개 빼고 최대 10개 까지만");


        System.out.println("자바 수업 중에 Test가 들어있는 수업이 있는지 확인");
        // TODO

        System.out.println("스프링 수업 중에 제목에 spring이 들어간 제목만 모아서 List로 만들기");
        springClasses.stream().map(OnlineClass::getTitle)
                .filter(title -> title.contains("spring"))
                .toList()
                .forEach(System.out::println);*/

        Thread thread = new Thread(() -> {
            while (true) {
                System.out.println("Thread: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    System.out.println("exit!");
                    return;
                }
            }
        });

        thread.start();

        System.out.println("Hello:"+ Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.interrupt();
    }
}

