package in.jayant.designpatterns.flyweight;

public class PaintApp {

    public void render(int numberOfShapes) {
        for (int i = 1; i <= numberOfShapes; i++) {
            if (i % 2 == 0) {
                Shape shape = ShapeFactory.getShape("circle");
                shape.draw(i, "red");
            } else {
                Shape shape = ShapeFactory.getShape("rectangle");
                shape.draw(i + i, i, "dotted");
            }
        }
    }
}
