package in.jayant.designpatterns.factory;

/**
 * Factory class which is responsible to create objects based on type passed.
 */
public class PersonFactory {
    public static Person getPerson(String type) {
        if ("male".equalsIgnoreCase(type)) {
            return new Male();
        } else if ("female".equalsIgnoreCase(type)) {
            return new Female();
        } else {
            return null;
        }
    }
}