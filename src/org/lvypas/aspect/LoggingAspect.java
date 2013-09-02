package org.lvypas.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

    @Before("allGetters() && allCircleMethods()")
    public void LoggingAdvice() {
        System.out.println("Advice run. Get method called.");
    }
    
    @Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second Advice executed.");
    }
    
    @Pointcut("execution(* get*())")
    public void allGetters() {}
    
    @Pointcut("within(org.lvypas.model.Circle)")
    public void allCircleMethods() {}   
     
    
}
