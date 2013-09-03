package org.lvypas.service;

import org.lvypas.aspect.LoggingAspect;
import org.lvypas.model.Circle;

public class ShapeServiceProxy extends ShapeService {
    
    public Circle getCircle() {
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }

}
