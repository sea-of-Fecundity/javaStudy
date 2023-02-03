package com.example.javastudy.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import java.io.IOException;


@Slf4j
public class CheckedExceptionStudy {

    @Test
    public void 확인된_예외_테스트()  {
        Controller controller = new Controller();
        try {
            controller.controllerCall();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static class MyException extends IOException {
        public MyException(String message) {
            super(message);
        }
    }
    static class Controller{
        Service service = new Service();

        void controllerCall() throws MyException {
            service.serviceCall();
        }
    }

    static class Service{
        Repository repository = new Repository();
        void serviceCall() throws MyException {
            repository.helloException();
        }
    }
    static class Repository{
        void helloException() throws MyException {
            throw new MyException("exception");
        }
    }
}
