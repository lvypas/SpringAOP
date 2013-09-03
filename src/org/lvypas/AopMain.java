package org.lvypas;

import org.lvypas.service.FactoryService;
import org.lvypas.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        //ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        //ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        
        FactoryService factoryService = new FactoryService();
        ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
        
        shapeService.getCircle();

    }

}
