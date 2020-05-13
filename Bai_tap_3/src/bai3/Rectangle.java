package bai3;

public class Rectangle extends Shape {
    private static Shape rectangle;

    protected Rectangle(String brush, String frame, String paper) {
        super(brush, paper, frame);
    }
    public static Shape createRectangle() {
        if(rectangle == null)
            rectangle = new Rectangle("Brush", "Paper", "Rectangle-Frame");
        return rectangle;
    }

    @Override
    public String draw() {
        return "Draw rectangle: " + getBrush() + " + " + getPaper() + " + " + getFrame();
    }
}