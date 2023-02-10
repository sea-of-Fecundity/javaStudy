package com.example.javastudy.junitest.code;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {
    private String name;
    private BookTitle genre;
    private int price;
    private int quantity;


    public Book() {
    }

    public Book(int quantity) {
        if (quantity <= 0) {
            throw new IllegalStateException("0 이상의 재고를 넣어주세요.");
        }
        this.quantity = quantity;
    }
}
