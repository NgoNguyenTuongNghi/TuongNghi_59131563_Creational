package bai3;

public class Main {
    public static void main(String[] args) throws Exception {
        ShapeFactory sf = new ShapeFactory();
        Shape r = sf.createShape(ShapeType.Rectangle);
        Shape c = sf.createShape(ShapeType.Circle);
        Shape t = sf.createShape(ShapeType.Triangle);

        System.out.println("\n----HOW TO DRAW SHAPE----");
        System.out.println(r.draw());
        System.out.println(c.draw());
        System.out.println(t.draw());
    }
}
