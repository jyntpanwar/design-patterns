package in.jayant.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static Map<String, Shape> types = new HashMap<>();

    public static Shape getShape(String type) {
        if (types.containsKey(type)) {
            return types.get(type);
        } else {
            Shape shape = null;
            if ("circle".equalsIgnoreCase(type)) {
                shape = new Circle();
            } else if ("rectangle".equalsIgnoreCase(type)) {
                shape = new Rectangle();
            }
            types.put(type, shape);
            return shape;
        }
    }
}
