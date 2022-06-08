package in.jayant.designpatterns.flyweight;

public class Rectangle extends Shape {

    public Rectangle() {
        this.label = "Rectangle";
    }

    @Override
    public void draw(int length, int breadth, String fillStyle) {
        System.out.println(String.format("Drawing a %s with length : %s breadth : %s and fillstyle : %s",label, length, breadth, fillStyle));
    }
}
