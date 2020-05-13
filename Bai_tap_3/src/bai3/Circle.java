package bai3;

public class Circle extends Shape {
    private static Shape circle;

    protected Circle(String brush, String frame, String paper) {
        super(brush, paper, frame);
    }
    public static Shape createCircle() {
        if(circle == null)
            circle = new Circle("Brush", "Paper", "Circle-Frame");
        return circle;
    }

    @Override
    public String draw() {
        return "Draw circle: " + getBrush() + " + " + getPaper() + " + " + getFrame();
    }
}