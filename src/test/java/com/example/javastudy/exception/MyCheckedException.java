package com.example.javastudy.exception;

import java.sql.SQLException;

public  class MyCheckedException extends SQLException {
    public MyCheckedException(String message) {
        super(message);
    }

    public MyCheckedException(String reason, Throwable cause) {
        super(reason, cause);
    }

    public MyCheckedException(Throwable cause) {
        super(cause);
    }
}
