package com.example.javastudy.exception;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class CheckedExceptionStudy {

    @Test
    public void 확인된_예외_테스트()  {
        Controller controller = new Controller();
        try {
            controller.controllerCall();
        } catch (MyCheckedException e) {
          log.info("exception", e);
        }
    }

    static class Controller{
        Service service = new Service();

        void controllerCall() throws MyCheckedException {
            service.serviceCall();
        }
    }

    static class Service{
        Repository repository = new Repository();
        void serviceCall() throws MyCheckedException {
            repository.helloException();
        }
    }

    static class Repository{
        void helloException() throws MyCheckedException {
            throw new MyCheckedException("exception");
        }
    }
}
