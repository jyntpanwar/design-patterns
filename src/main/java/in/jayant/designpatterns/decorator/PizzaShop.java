package in.jayant.designpatterns.decorator;

// The idea is to add additional behavior to an object without modifying the original class.
// Basically we are decorating an object on the go.

public class PizzaShop {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza.bake();

        System.out.println("======================================");

        Pizza pizza2 = new CheesePizzaDecorator(new PlainPizza());
        pizza2.bake();

        System.out.println("======================================");

        Pizza pizza3 = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
        pizza3.bake();
    }
}
