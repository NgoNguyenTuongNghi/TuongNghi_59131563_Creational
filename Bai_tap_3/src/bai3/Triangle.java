package bai3;

public class Triangle extends Shape {
    private static Shape triangle;

    protected Triangle(String brush, String frame, String paper) {
        super(brush, paper, frame);
    }
    public static Shape createTriangle() {
        if(triangle == null)
            triangle = new Triangle("Brush", "Paper", "Triangle-Frame");
        return triangle;
    }

    @Override
    public String draw() {
        return "Draw triangle: " + getBrush() + " + " + getPaper() + " + " + getFrame();
    }
}