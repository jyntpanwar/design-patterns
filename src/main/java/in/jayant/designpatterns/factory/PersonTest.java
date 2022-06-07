package in.jayant.designpatterns.factory;

/**
 * Class to test the factory pattern
 */
public class PersonTest {
    public static void main(String[] args) {
        Person male = PersonFactory.getPerson("male");
        male.wish();
        Person female = PersonFactory.getPerson("female");
        female.wish();
    }
}
