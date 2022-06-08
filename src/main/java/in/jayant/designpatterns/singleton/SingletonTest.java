package in.jayant.designpatterns.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("This is a Singleton class test");
    }
}
