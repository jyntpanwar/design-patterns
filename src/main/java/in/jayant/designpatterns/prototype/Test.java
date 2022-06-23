package in.jayant.designpatterns.prototype;

// The idea here is to create as many object as required with same state of the original object
// by cloning instead of creating similar objects from scratch.

//Spring uses prototype pattern to create objects.

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("Overwatch");
        game1.setMembership(new Membership());

        Game game2 = game1.clone();

        System.out.println(game1);
        System.out.println(game2);

        Game game3 = new Game(game1);
        System.out.println(game3);
    }
}
