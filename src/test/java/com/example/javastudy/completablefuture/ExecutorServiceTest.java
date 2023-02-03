package com.example.javastudy.completablefuture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

public class ExecutorServiceTest {

    /**
     * 고전적인 방법
     * @throws Exception
     */
    @Test
    @DisplayName("쓰레드 하나")
    public void executorService1() throws Exception {
        //given
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(getRunnable("hello"));
        //모든 작업을 끝내고 종료한다.
        //executorService.shutdown();
        //즉시 종료시킨다.
        executorService.shutdownNow();
    }

    @Test
    @DisplayName("쓰레드 둘")
    public void executorService2() throws Exception {
        //given
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(getRunnable("0"));
        executorService.submit(getRunnable("1"));
        executorService.submit(getRunnable("2"));
        executorService.submit(getRunnable("3"));
        executorService.submit(getRunnable("4"));

        //모든 작업을 끝내고 종료한다.
        executorService.shutdown();
        //즉시 종료시킨다.
        //executorService.shutdownNow();
    }

    @Test
    @DisplayName("ScheduleExecutorService")
    public void ScheduleExecutorService() throws Exception {
        //given
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.schedule(getRunnable("hello"), 3, TimeUnit.SECONDS);


        //모든 작업을 끝내고 종료한다.
        executorService.shutdown();
        //즉시 종료시킨다.
        //executorService.shutdownNow();
    }

    private static Runnable getRunnable(String message) {
        return () -> {
            System.out.println(message + Thread.currentThread().getName());
        };
    }
}
