package com.example.javastudy.junitest;


import com.example.javastudy.junitest.code.Book;
import com.example.javastudy.junitest.code.BookTitle;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class NameTest {
    /**
     * @DisplayName을 권장한다.
     * 테스트 이름으로 기능을 표현할 때 길이가 길어질 수 있으므로
     * @throws Exception
     */
    @Test
    @DisplayName("테스트 이름을 입력해주세요")
    public void test_name() throws Exception {
        Book book = new Book();
        Assert.assertNotNull(book);
        book.setGenre(BookTitle.ART);
        System.out.println(book.getGenre());
    }
    
    @Test
    public void 한글_이름도_가능합니다() throws Exception {
    }
}
