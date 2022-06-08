package in.jayant.designpatterns.flyweight;

/**
 * The Key take away here is :
 *      Separate the extrinsic state
 *      Add the state as method parameters
 *      Create a Factory class to avoid creating multiple objects
 */
public class TestFlyWeight {
    public static void main(String[] args) {
        PaintApp paintApp = new PaintApp();
        paintApp.render(10);
    }
}
