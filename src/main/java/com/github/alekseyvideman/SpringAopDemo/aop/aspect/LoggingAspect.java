package com.github.alekseyvideman.SpringAopDemo.aop.aspect;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Log(topic = "generic")
@Aspect
@Component
public class LoggingAspect {

    /**
     * Читается как "При удовлетворении заданного условия,
     *  выполнить действие ниже перед вызовом метода целевого объекта:"
     */
    @Before("com.github.alekseyvideman.SpringAopDemo.aop.pointcut.CommonPointcuts.log()")
    public void log(JoinPoint joinPoint) {
        log.info("Invoked: " + joinPoint.getSignature().getName());
    }

    @Before("com.github.alekseyvideman.SpringAopDemo.aop.pointcut.CommonPointcuts.logMessage(message)")
    public void logMessage(String message) {
        log.info("Message parameter: " + message);
    }

    @AfterReturning(
            value = "com.github.alekseyvideman.SpringAopDemo.aop.pointcut.CommonPointcuts.log()",
            returning = "value"
    )
    public void logReturnedValue(int value) {
        log.info("Returned: " + value);
    }

}
