package ua.com.codespace.spring.aop.logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DoorLogger {

    @Before("execution(void ua.com.codespace.spring.aop.model.Door.open())")
    public void logOpenDoor() {
        System.out.println("Knock knock");
    }

    @Pointcut("execution(void ua.com.codespace.spring.aop.model.Door.close(String))")
    public void closePointcut() {}

    @After("closePointcut()")
    public void logDorClosed() {
        System.out.println("Door locked");
    }

    @AfterThrowing("execution(void ua.com.codespace.spring.aop.model.Door.close(..))")
    public void logDorNotClosed() {
        System.out.println("Dor not closed");
    }
}
