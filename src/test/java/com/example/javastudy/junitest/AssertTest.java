package com.example.javastudy.junitest;

import com.example.javastudy.junitest.code.Book;
import com.example.javastudy.junitest.code.BookTitle;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class AssertTest {
        @Test
        @DisplayName("assert를 활용해보자")
        public void assertStudy() throws Exception {

            Book book = new Book();
            book.setQuantity(10);
            book.setGenre(BookTitle.ART);

            assertNotNull(book);

            //아래와 같이 message를 적는 것이 효율적이다. 왜? 테스트가 실패했을 경우에 실행하므로 불필요한 연산을 수행하지 않는다.
            assertEquals(BookTitle.ART, book.getGenre(), ()->"hello");


            assertTrue(book.getQuantity() >0 , "재고가 부족합니다. ");

            //예측한 exception이 나오면 성공
            IllegalStateException illegalStateException = assertThrows(IllegalStateException.class, () -> new Book(0));
            String message = illegalStateException.getMessage();
            log.info("message ={}", message);


       /*     assertAll(
                //() -> 람다 형식으로 넣어주세요.
            );*/



        }
}
