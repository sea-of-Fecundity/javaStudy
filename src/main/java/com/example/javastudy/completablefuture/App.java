package com.example.javastudy.completablefuture;

import jdk.jfr.Threshold;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) {
        /**
         * 현재 여기는 main Thread이다.
         */
        System.out.println(Thread.currentThread().getName());

        /**
         * main Thread에서 다른 Thread를 만드는 방법
         */
        // 1.번째 방법 상속 받아서 만든다.
        MyThread mythread = new MyThread();
        mythread.start();

        System.out.println("Hello");

//        2.번째 방법

        System.out.println("===========2번째 방법===========");

/*                Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });*/
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread: " + Thread.currentThread().getName());

        });
        thread.start();

        System.out.println("Hello: "+ Thread.currentThread().getName());

    }

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("처음 방법 Thread:" + Thread.currentThread().getName());
        }
    }

}
