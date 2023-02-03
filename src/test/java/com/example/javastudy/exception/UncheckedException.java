package com.example.javastudy.exception;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
public class UncheckedException {

    @Test
    public void 확인되지_않은_예외() throws Exception {
        Controller controller = new Controller();
        try {
            controller.serviceCall();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assertions.assertThatThrownBy(()->controller.serviceCall()).isInstanceOf(MyUncheckedException.class);
    }

    static class MyUncheckedException extends RuntimeException {
        public MyUncheckedException(String message) {
            super(message);
        }
    }

    static class Controller{
       Service service = new Service();

        void serviceCall() {
            service.serviceCall();
        }
    }

    static class Service{
        Repository repository = new Repository();
        void serviceCall() {
            repository.helloException();
        }
    }

    static class Repository{
        void helloException() {
           throw new MyUncheckedException("helloException");
        }
    }
}
