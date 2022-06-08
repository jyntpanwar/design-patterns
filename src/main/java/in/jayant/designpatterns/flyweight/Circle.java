package in.jayant.designpatterns.flyweight;

public class Circle extends Shape {

    public Circle() {
        this.label = "Circle";
    }

    @Override
    public void draw(int radius, String lineColor) {
        System.out.println(String.format("Drawing a %s with radius : %s and lineColor : %s", label, radius, lineColor));
    }
}
