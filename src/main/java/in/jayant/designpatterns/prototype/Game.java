package in.jayant.designpatterns.prototype;

public class Game implements Cloneable {

    private int id;
    private String name;
    private Membership membership;

    public Game() {}

    // Prototype Objects can be created by copy constructors too
    public Game(Game game) {
        this.id = game.id;
        this.name = game.name;
        // To achieve deep cloning
        this.membership = new Membership();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    // Overriding the default clone() method to create a clone or a prototype of the original object
    @Override
    protected Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        // To achieve deep cloning
        game.setMembership(new Membership());
        return game;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", membership=" + membership +
                '}';
    }
}
