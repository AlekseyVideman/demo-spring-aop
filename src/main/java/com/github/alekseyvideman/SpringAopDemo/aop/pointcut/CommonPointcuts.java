package com.github.alekseyvideman.SpringAopDemo.aop.pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcuts {

    /**
     * Читается как "Для всех методов, всех классов,
     *  находящихся в пакете ..."
     */
    @Pointcut("within(com.github.alekseyvideman.SpringAopDemo.domain..*)")
    public void log() {}

    @Pointcut("log() && args(message,..)")
    public void logMessage(String message) {}

}
