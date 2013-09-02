package org.lvypas.aspect;

import org.aspectj.lang.JoinPoint;
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
    
    @Before("args(name)")
    public void stringArgumentMethods(String name){
        System.out.println("A method tah takes String argument has been called. The value is " + name);
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
