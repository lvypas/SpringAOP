package org.lvypas.service;

import org.lvypas.aspect.Loggable;
import org.lvypas.model.Circle;
import org.lvypas.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;
    
    @Loggable
    public Circle getCircle() {
        return circle;
    }
    public void setCircle(Circle circle) {
        this.circle = circle;
    }
    public Triangle getTriangle() {
        return triangle;
    }
    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }    
    
}
