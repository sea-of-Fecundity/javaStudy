package com.example.javastudy.junitest;


import com.example.javastudy.junitest.code.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;

public class StartTest {
    /**
     * junit 4와 비교
     * BeforeAll = BeforeClass
     * BeforeEach = before
     * disable = ignored
     * @throws Exception
     */
    @Test
    public void create() throws Exception {
        Book book = new Book();
        Assert.assertNotNull(book);
    }

    /**
     * 모든 테스트가 실행하기 전에 한 번만 호출된다.
     * 반드시 static을 사용해야 한다.
     * private은 안 되고 return 은 없어야 한다.
     */
    @BeforeAll
    static void beforeAll() {
        System.out.println("hello BeforeAll");
    }

    /**
     * 모든 테스트가 진행된 이후에 호출된다.
     * 나머지는 @Before와 동일 하다.
     */
    @AfterEach
    static void afterAll() {
        System.out.println("hello AfterAll");
    }

    @BeforeAll
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @Test
    @Disabled
    void 사용_안_하는_테스트() {
    }

}
