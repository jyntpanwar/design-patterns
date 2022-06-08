package in.jayant.designpatterns.flyweight;

public abstract class Shape {
    protected String label;

    public void draw(int radius, String lineColor) {}

    public void draw(int length, int breadth, String fillStyle) {}
}
