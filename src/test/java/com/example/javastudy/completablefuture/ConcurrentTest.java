package com.example.javastudy.completablefuture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ConcurrentTest {

    @Test
    public void mainThread() throws Exception {
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * main Thread에서 다른 Thread를 만드는 방법
     */

    @Test
    @DisplayName("상속")
    public void extendsThreadTest() throws Exception {

        // 1.번째 방법 상속 받아서 만든다.
        MyThread mythread = new MyThread();
        mythread.start();

        System.out.println("Hello");
    }

    @Test
    @DisplayName("runAble")
    public void runAbleThreadTest() throws Exception {

        /*                Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: " + Thread.currentThread().getName());
            }
        });*/

        Thread thread = new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName());
        });
        thread.start();

        System.out.println("Hello: "+ Thread.currentThread().getName());
    }

    @Test
    @DisplayName("sleep")
    public void sleepThreadTest() throws Exception {

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

    @Test
    @DisplayName("interrupt")
    public void interruptThreadTest() throws Exception {

        Thread thread = new Thread(() -> {
            while (true){
                System.out.println("Thread: " + Thread.currentThread().getName());
                try{
                    Thread.sleep(1000L);

                }catch (InterruptedException e) {
                    System.out.println("exit!");
                    return;
                }
            }
        });
        thread.start();

        System.out.println("Hello: "+ Thread.currentThread().getName());
        Thread.sleep(3000L);
        thread.interrupt();
    }

    @Test
    @DisplayName("join")
    public void joinThreadTest() throws Exception {

        Thread thread = new Thread(() -> {
                System.out.println("Thread: " + Thread.currentThread().getName());
                try{
                    Thread.sleep(3000L);

                }catch (InterruptedException e) {
                    throw new IllegalArgumentException(e);
                }
        });
        thread.start();

        System.out.println("Hello: "+ Thread.currentThread().getName());
        thread.join();
        System.out.println(thread + " is finished");
    }
}

    class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread:" + Thread.currentThread().getName());
        }
    }

