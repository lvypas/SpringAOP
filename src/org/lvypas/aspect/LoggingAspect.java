package org.lvypas.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.lvypas.model.Circle;

@Aspect
public class LoggingAspect {

    @Before("allCircleMethods()")
    public void LoggingAdvice(JoinPoint joinPoint) {
        Circle circle = (Circle) joinPoint.getTarget();
    }
    
    @AfterReturning(pointcut ="args(name)", returning="returnString")
    public void stringArgumentMethods(String name, String returnString){
        System.out.println("A method that takes String argument has been called. The value is " + name + ". The output value is " + returnString);
    }
    
    @AfterThrowing(pointcut ="args(name)", throwing="ex")
    public void exceptionAdvice(String name, RuntimeException ex) {
        System.out.println("An exception has been thrown"+ ex);
    }
    
    /*@Before("allGetters()")
    public void secondAdvice() {
        System.out.println("Second Advice executed.");
    }*/
    
    @Pointcut("execution(* get*())")
    public void allGetters() {}
    
    @Pointcut("within(org.lvypas.model.Circle)")
    public void allCircleMethods() {}   
     
    
}
