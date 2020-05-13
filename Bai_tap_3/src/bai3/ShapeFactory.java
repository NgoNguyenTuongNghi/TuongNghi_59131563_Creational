package bai3;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        if (null != shapeType) 
            switch (shapeType) {
                case Rectangle:
                    return Rectangle.createRectangle();
                case Triangle:
                    return Triangle.createTriangle();
                case Circle:
                    return Circle.createCircle();
                default:
                    break;
            }
        return null;
    }
}